package usefulcoding;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class client {
	public static void main(String[] args) throws UnknownHostException, IOException {
		Socket socket=new Socket("localhost",10086);
		OutputStream os=socket.getOutputStream();
		PrintWriter pw=new PrintWriter(os);
		Scanner scan=new Scanner(System.in);
		String str=scan.nextLine();
		pw.write(str);
		pw.flush(); 
		socket.shutdownOutput();
		InputStream is=socket.getInputStream();
		InputStreamReader im=new InputStreamReader(is);
		BufferedReader bf=new BufferedReader(im);
		String info = null; 
		while((info=bf.readLine())!=null){ 
		 System.out.println("我是客户端，服务器说："+info); 
		} 
		is.close();
		im.close();
		os.close();
		bf.close();
	}
}
