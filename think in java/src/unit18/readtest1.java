package unit18;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class readtest1 {

	public static void main(String[] args) throws IOException {
		// TODO 自動生成されたメソッド・スタブ
		BufferedReader read=new BufferedReader(new FileReader("C:\\3.txt"));
		StringBuffer s = new StringBuffer();;
		String ss;
		while((ss=read.readLine())!=null)
			s.append(ss);
			System.out.println(s.toString());
	}

}
