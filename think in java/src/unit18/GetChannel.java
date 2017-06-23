package unit18;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class GetChannel {
private static final int BSIZE=1024;
	public static void main(String[] args) throws IOException {
		// TODO 自動生成されたメソッド・スタブ
		FileChannel fc=new FileOutputStream("C:\\practice\\think in java\\src\\3.txt").getChannel();
		fc.write(ByteBuffer.wrap("I am your father ".getBytes()));
		fc.close();
		fc=new FileInputStream("C:\\practice\\think in java\\src\\3.txt").getChannel();
		ByteBuffer buff= ByteBuffer.allocate(BSIZE);
		fc.read(buff);
		//fc.close();	
		buff.flip();
		while(buff.hasRemaining())
			System.out.print((char)buff.get());
	}

}
