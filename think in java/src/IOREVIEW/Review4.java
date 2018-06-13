package IOREVIEW;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Review4 {
	static String file = "C:\\practice\\think in java\\src\\2121.txt";
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		try {
			BufferedWriter bw = new BufferedWriter(new FileWriter(file,true));
			PrintWriter pw=new PrintWriter(bw);
			pw.print("1111");
			pw.flush();
		} catch (IOException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		}
	}

}
