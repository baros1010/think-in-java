package unit18;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class UsingRandomAccessFile {
	static String file = "C:\\practice\\think in java\\src\\2121.txt";
	public static void main(String[] args) throws IOException {
		// TODO 自動生成されたメソッド・スタブ
		RandomAccessFile af=new RandomAccessFile(file,"rw");
		for(int i=0;i<7;i++)
			af.writeDouble(1.121*i);
		af.writeUTF("123");
		af.close();
		test();
		af=new RandomAccessFile(file,"rw");
		af.seek(5*8);
		af.writeDouble(12.11);
		af.close();
		test();
	}
	static void test() throws IOException{
		RandomAccessFile af=new RandomAccessFile(file,"r");
		for(int i=0;i<7;i++)
			System.out.println("Value"+i+":"+af.readDouble());
		System.out.println(af.readUTF());
		af.close();
	}
}
