package unit18;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class BufferedInputFile {
	public static String read(String filename) throws IOException{
		BufferedReader in=new BufferedReader(new FileReader(filename));
		String s;
		StringBuffer sb =new StringBuffer();
		while((s=in.readLine())!=null){
			sb.append(s+"\n");
			
		}
		in.close();
		return sb.toString();
	}
	public static void main(String[] args) throws IOException {
		// TODO 自動生成されたメソッド・スタブ
		System.out.println(read("C:\\practice\\think in java\\src\\unit18\\filenew.java"));
//		System.out.println(read("C:\\practice\\\think in java\\src\\3.txt"));
	}

}
