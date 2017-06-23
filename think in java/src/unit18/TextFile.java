package unit18;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.TreeSet;

public class TextFile extends ArrayList<String> {
	public static String read(String file) {
		StringBuffer sb = new StringBuffer();
		try {
			BufferedReader in = new BufferedReader(new FileReader(new File(file).getAbsoluteFile()));
			try {
				String s;
				while ((s = in.readLine()) != null) {
					sb.append(s);
					sb.append("\n");
				}
			} finally {
				in.close();

			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		return sb.toString();
	}

	public static void write(String filename, String text) {
		try {
			PrintWriter out = new PrintWriter(new File(filename).getAbsolutePath());
			try {
				out.print(text);
			} finally {
				out.close();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	public TextFile(String filename,String splitter){
		super(Arrays.asList(read(filename).split(splitter)));
		if(get(0).equals("")) 
			remove(0); 
	}
	public TextFile(String s){
		this(s,"\n");
	}
	public void writer(String s){
		try {
			PrintWriter out = new PrintWriter(new File(s).getAbsolutePath());
			try{for(String ss:this)
				out.print(ss);}finally{
					out.close();
				}
			
		} catch (FileNotFoundException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		String s=read("C:\\practice\\think in java\\src\\3.txt");
		write("C:\\practice\\think in java\\src\\2121.txt",s);
		TextFile f=new TextFile("C:\\practice\\think in java\\src\\3.txt");
		f.writer("C:\\practice\\think in java\\src\\3.txt");
		TreeSet<String> tree =new TreeSet<String>(new TextFile("C:\\practice\\think in java\\src\\3.txt","\\w+"));
		System.out.println(tree);
		System.out.println(tree.headSet("aa"));
		
	}

}
