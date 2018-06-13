package IOREVIEW;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Review3 {
	static String file = "C:\\practice\\think in java\\src\\2121.txt";
	public static void main(String[] args) {
		String s;
		StringBuffer sb=new StringBuffer();
		try {
			PrintWriter bw = new PrintWriter(new FileWriter(file));
			bw.write(" i am your fatherssss");
			 //使用缓冲区中的方法，将数据刷新到目的地文件中去。 必须有
			bw.flush();
			BufferedReader br =new BufferedReader(new FileReader(file));
			while((s=br.readLine())!=null)
				sb.append(s);
			System.out.println(sb.toString());
		} catch (IOException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		}
		
		
	}
}
