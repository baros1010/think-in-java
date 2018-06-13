package unit18;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;

public class BasicFileOut {
	static String file = "C:\\practice\\think in java\\src\\2121.txt";

	public static void main(String[] args) {
		// TODO �����������ꂽ���\�b�h�E�X�^�u
		try(BufferedReader in = new BufferedReader(
				new StringReader(BufferedInputFile.read("C:\\practice\\think in java\\src\\3.txt")));){
		PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter(file,true)));
		//PrintWriter out = new PrintWriter(file);
		int linecount = 1;
		String s;
		while ((s = in.readLine()) != null)
			out.println(linecount++ + ":" + s);
			out.println("123");
		
		//out.close();
		System.out.print(BufferedInputFile.read(file));
		} catch(IOException ex) {
			ex.printStackTrace();
		}
	}

}
