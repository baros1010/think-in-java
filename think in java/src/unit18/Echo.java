package unit18;

import java.io.IOException;
import java.util.Scanner;

public class Echo {

	public static void main(String[] args) throws IOException {
		// TODO 自動生成されたメソッド・スタブ
//		BufferedReader in =new BufferedReader(new InputStreamReader(System.in));
//		String s;
//		while((s=in.readLine())!=null&&s.length()!=0)
//			System.out.println(s);
		Scanner scan=new Scanner(System.in);
		String s=scan.nextLine();
		System.out.println(s);
	}

}
