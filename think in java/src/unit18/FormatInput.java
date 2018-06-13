package unit18;

import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.IOException;

public class FormatInput {

	public static void main(String[] args) throws IOException {
		// TODO 自動生成されたメソッド・スタブ
		DataInputStream in=new DataInputStream(new ByteArrayInputStream(BufferedInputFile.read("C:\\practice\\think in java\\src\\3.txt").getBytes()));
		while(true)
			System.out.print((char)in.readByte());
	}

}
