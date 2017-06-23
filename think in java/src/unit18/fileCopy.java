package unit18;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.util.Date;

public class fileCopy {
	public static void main(String[] args) throws IOException{
		System.out.println(new Date());
		File f1= new File("C:\\4.txt");
		if(!f1.exists())
			f1.createNewFile();
		FileChannel out=new FileOutputStream("C:\\4.txt").getChannel();
		FileChannel in=new FileInputStream("C:\\3.txt").getChannel();
		ByteBuffer buff =ByteBuffer.allocate(1024);
		while(in.read(buff)!=-1){
			buff.flip();
			out.write(buff);
			buff.clear();
		}
		System.out.println(new Date());	
			   
	}
}
