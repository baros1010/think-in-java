package unit18;

import java.io.IOException;

import java.io.StringReader;

public class MemoryRead {

	public static void main(String[] args) throws IOException {
		// TODO �����������ꂽ���\�b�h�E�X�^�u
		StringReader in=new StringReader(BufferedInputFile.read("C:\\practice\\think in java\\src\\unit18\\filenew.java"));
	 	
		//System.out.println(StringReader.class.getClassLoader().getResource(""));
		int c;
		while((c=in.read())!=-1)
			System.out.print((char)c);
		//System.out.println(StringReader.class.getClassLoader().getResource(""));
	}

}
