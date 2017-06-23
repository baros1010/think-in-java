package unit18;

import java.io.IOException;
import java.io.InputStream;
import java.io.StringReader;

public class MemoryRead {

	public static void main(String[] args) throws IOException {
		// TODO 自動生成されたメソッド・スタブ
		StringReader in=new StringReader(BufferedInputFile.read("C:\\practice\\think in java\\src\\unit18\\filenew.java"));
	 	InputStream ins=StringReader.class.getClassLoader().getSystemResourceAsStream("3.txt");
		//System.out.println(StringReader.class.getClassLoader().getResource(""));
		int c;
		while((c=ins.read())!=-1)
			System.out.print((char)c);
		//System.out.println(StringReader.class.getClassLoader().getResource(""));
	}

}
