package IOREVIEW;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

public class Review2 {
	static String file = "C:\\practice\\think in java\\src\\2121.txt";
	public static void main(String[] args) throws FileNotFoundException {
		// TODO 自動生成されたメソッド・スタブ
		FileInputStream is=new FileInputStream(file);
		InputStreamReader ir=new InputStreamReader(is);
		BufferedReader br=new BufferedReader(ir);
		
		int c;
		try {
			while((c=ir.read())!=-1){
				
				System.out.print((char)c);
			}
		} catch (IOException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		}

	}

}
