package IOREVIEW;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.SelectionKey;
import java.nio.channels.Selector;
import java.nio.channels.ServerSocketChannel;
import java.nio.channels.SocketChannel;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;
import java.util.Vector;

public class ChatServer implements Runnable{
	  private Selector selector;
	    private SelectionKey serverKey;
	    private Vector<String> usernames;
	    private static final int PORT = 9999;

	    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

	    public ChatServer(){
	        usernames = new Vector<String>();
	        init();
	    }
	    public void init(){
	    	try {
				selector=Selector.open();//建立Selector
				ServerSocketChannel serverchannel=ServerSocketChannel.open();//ServerSocketChannel建立
				serverchannel.socket().bind(new InetSocketAddress(9080));//创建socket
				serverchannel.configureBlocking(false);
				serverchannel.register(selector, SelectionKey.OP_ACCEPT);//注册channel
				System.out.println("server start.............");
			} catch (IOException e) {
				
				e.printStackTrace();
			}
	    }
		@Override
		public void run() {
		
			try {
				int count=selector.select();//返回有多少准备就绪通道
				while(true){
				
					if(count>0){
						  Iterator<SelectionKey> iterator = selector.selectedKeys().iterator();
						  while(iterator.hasNext()){
							  SelectionKey key = iterator.next();
							  if(key.isAcceptable()){
								  //若此key的通道是等待接受新的套接字连接
								  System.out.println(key.toString() + " : 接收");
								  //一定要把这个accpet状态的服务器key去掉，否则会出错
		                            iterator.remove();
		                            ServerSocketChannel serverChannel = (ServerSocketChannel) key.channel();//打开通道
		                            SocketChannel channel=serverChannel.accept();//  //接受socket
		                            channel.configureBlocking(false);
		                            channel.register(selector, SelectionKey.OP_READ);//注册
		                            if(key.isValid()&&key.isReadable()){
		                            	System.out.println(key.toString()+"读");
		                            	ReadMsg(key);
		                            }
		                            if(key.isValid() && key.isWritable()){
		                                System.out.println(key.toString() + " : 写");
		                                writeMsg(key);
		                            }
							  }
						  }
					}
				}
		
			} catch (IOException e) {
				// TODO 自動生成された catch ブロック
				e.printStackTrace();
			}
		
			
		}
		
		private void writeMsg(SelectionKey key) {
			   try {
		            SocketChannel channel = (SocketChannel) key.channel();
		            Object attachment = key.attachment();
		            //获取key的值之后，要把key的值置空，避免影响下一次的使用
		            key.attach("");
		            channel.write(ByteBuffer.wrap(attachment.toString().getBytes()));
		            key.interestOps(SelectionKey.OP_READ);
//interest集合是Selector感兴趣的集合，用于指示选择器对通道关心的操作，可通过SelectionKey对象的interestOps()获取
		        } catch (Exception e) {
		            e.printStackTrace();
		        }
			
		}
		private void ReadMsg(SelectionKey key) {
			SocketChannel channel = null;
			 channel = (SocketChannel) key.channel();
	            //设置buffer缓冲区
	            ByteBuffer buffer = ByteBuffer.allocate(1024);
	            //假如客户端关闭了通道，这里在对该通道read数据，会发生IOException，捕获到Exception后，关闭掉该channel，取消掉该key
	            try {
					int count = channel.read(buffer);
				    StringBuffer buf = new StringBuffer();
				    if(count>0){
				    	buffer.flip();
				    	buf.append(new String(buffer.array(), 0, count));
				    	String msg = buf.toString();
				    	if(msg.indexOf("open_")==-1){
				    	    String name = msg.substring(5);//取出名字
			                System.out.println(name);
			                usernames.add(name);
			                Iterator<SelectionKey> iter = selector.selectedKeys().iterator();
			                //若不是服务器套接字通道的key，则将数据设置到此key中  
		                    //并更新此key感兴趣的动作  
			                while(iter.hasNext()){
			                	SelectionKey skey=iter.next();
			                	if(skey!=serverKey){
			                		skey.attach(usernames);
			                		skey.interestOps(skey.interestOps()|SelectionKey.OP_WRITE);
			                		//interest集合是Selector感兴趣的集合，用于指示选择器对通道关心的操作，可通过SelectionKey对象的interestOps()获取
			                	}
			                	
			                }
				    	}else if(msg.indexOf("exit_") != -1){
	                		  String username = msg.substring(5);
	                          usernames.remove(username);
	                          key.attach("close");
	                          key.interestOps(SelectionKey.OP_WRITE);
	                          //interest集合是Selector感兴趣的集合，用于指示选择器对通道关心的操作，可通过SelectionKey对象的interestOps()获取
	                          Iterator<SelectionKey> iter = selector.selectedKeys().iterator();
	                          while(iter.hasNext()){
	                              SelectionKey sKey = iter.next();
	                              sKey.attach(usernames);
	                              sKey.interestOps(sKey.interestOps() | SelectionKey.OP_WRITE);
	                          }
	                          
	                	}else{
	                        String uname = msg.substring(0, msg.indexOf("^"));
	                        msg = msg.substring(msg.indexOf("^") + 1);
	                      System.out.println("("+uname+")说："+msg);
	                        String dateTime = sdf.format(new Date());
	                        String smsg = uname + " " + dateTime + "\n  " + msg + "\n";
	                        Iterator<SelectionKey> iter = selector.selectedKeys().iterator();
	                        while(iter.hasNext()){
	                            SelectionKey sKey = iter.next();
	                            sKey.attach(smsg);
	                            sKey.interestOps(sKey.interestOps() | SelectionKey.OP_WRITE);
	                        }
	                    }
				    }
				} catch (IOException e) {
					// TODO 自動生成された catch ブロック
					e.printStackTrace();
				}
	        
			
		}
		 public static void main(String[] args) {
		        ChatServer server = new ChatServer();
		        new Thread(server).start();
		    }
		
}
