package usefulcoding;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class net {
	static List<String> list = new ArrayList<String>();

	public static List<String> test(int x) {
		if (x % 2 == 0 && x != 0) {
			String s = "2";
			list.add(s);
			x = (x - 2) / 2;
			test(x);

		} else if (x % 2 == 1) {
			String s = "1";
			list.add(s);
			x = (x - 1) / 2;
			test(x);
		}
		return list;

	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// TODO 自動生成されたメソッド・スタブ
		List<String> list = test(scan.nextInt());

		for (int i = list.size(); i > 0; i--)
			System.out.print(list.get(i - 1));
	}

}
