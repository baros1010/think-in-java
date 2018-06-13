package IOREVIEW;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Review {
	static String file = "C:\\sharework\\personal\\stub\\REQ_b2trswbt4_Acc-AS01-2-dev_20180124191724_000000000024.E.log";
	
	public static void main(String[] args) throws IOException {
		String s;
		StringBuffer sb=new StringBuffer();
		// TODO 自動生成されたメソッド・スタブ
		File f =new File(file);
		if(!f.exists()){
			f.createNewFile();
		}
		try {
			BufferedReader br =new BufferedReader(new FileReader(file));
			while((s=br.readLine())!=null)
				
			System.out.println(s);
			
		} catch (FileNotFoundException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		}
		
	}

}
