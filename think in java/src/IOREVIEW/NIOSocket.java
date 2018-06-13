package IOREVIEW;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.SelectionKey;
import java.nio.channels.Selector;
import java.nio.channels.ServerSocketChannel;
import java.nio.channels.SocketChannel;
import java.util.Iterator;
import java.util.Set;

public class NIOSocket {
	public void selector() throws IOException{
		ByteBuffer buffer=ByteBuffer.allocate(1024);
		Selector selector=Selector.open();
		ServerSocketChannel ssc=ServerSocketChannel.open();
		ssc.configureBlocking(false);//设置非阻塞方式
		ssc.socket().bind(new InetSocketAddress(8080));
		ssc.register(selector, SelectionKey.OP_ACCEPT);//注册监听事件
		while(true){
			Set SelectionKeys=selector.selectedKeys();
			Iterator it =SelectionKeys.iterator();
			SelectionKey key=(SelectionKey) it.next();
			while(it.hasNext()){
				if(((key.readyOps()&SelectionKey.OP_ACCEPT)==SelectionKey.OP_ACCEPT)){//等价于key.isAcceptable();
					ServerSocketChannel sscl=(ServerSocketChannel) key.channel();
					SocketChannel sc=sscl.accept();//接收服务端请求
					sc.configureBlocking(false);
					////注册OP_READ事件一般在接受之后
					sc.register(selector, SelectionKey.OP_READ);
					it.remove();					
				}else if((key.readyOps() & SelectionKey.OP_READ)==SelectionKey.OP_READ){
					SocketChannel sc=(SocketChannel) key.channel();
					while(true){
						buffer.clear();
						int n=sc.read(buffer);
						if(n<=0){
							break;
						}
						buffer.flip();
					}
					it.remove();
				}
			}
		}
	}

}
