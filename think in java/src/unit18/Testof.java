package unit18;

import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.File;
import java.io.IOException;

public class Testof {

	public static void main(String[] args) throws IOException {
		// TODO 自動生成されたメソッド・スタブ
		DataInputStream in=new DataInputStream(new ByteArrayInputStream(BufferedInputFile.read("C:\\practice\\think in java\\src\\3.txt").getBytes()));
		while(in.available()!=0)
			System.out.print((char)in.readByte());
		File file = new File("C:\\3.txt");
		if(file.exists())
		System.out.println(file.getPath());
	}

}
