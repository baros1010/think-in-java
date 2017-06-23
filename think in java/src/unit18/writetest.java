package unit18;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class writetest {
	static String file = "C:\\practice\\think in java\\src\\2121.txt";
	static String s="234";
	public static void main(String[] args) {
		try {
			PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter(file,true)));
			out.println(s);
			out.close();
			System.out.print(BufferedInputFile.read(file));
			
		} catch (IOException e) {
			// TODO é©ìÆê∂ê¨Ç≥ÇÍÇΩ catch ÉuÉçÉbÉN
			e.printStackTrace();
		}
	}
}
