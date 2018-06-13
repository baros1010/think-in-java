package usefulcoding;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class service {
	@SuppressWarnings("resource")
	public static void main(String[] args) throws IOException{
		ServerSocket service=new ServerSocket(10086);
		Socket scoket=service.accept();
		InputStream is=scoket.getInputStream();
		InputStreamReader im=new InputStreamReader(is,"utf-8");
		BufferedReader bf=new BufferedReader(im);
		String data=null;
		while((data=bf.readLine())!=null){
			System.out.println("我是服务器，客户端说："+data);
		}
		scoket.shutdownInput();
		OutputStream os=scoket.getOutputStream();
		PrintWriter pw = new PrintWriter(os); 
		pw.write("welcome");
		pw.flush();
		is.close();
		im.close();
		bf.close();
		os.close();
		pw.close();
	}
	

}
