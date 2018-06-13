package paratise;

import java.util.Scanner;

public class test11 {
	private static String  getMark(int score) {
		String s = "不合格";
		if (score < 60) {
			
			return s;
		} else if (score > 60 && score < 70) {
			 s = "合格";
			return s;
		} else if (score > 70 && score < 80) {
			 s = "中";
			return s;
		} else if (score > 80 && score < 90) {
			 s = "良";
			return s;
		}else{
			s = "优秀";
			return s;
		}
	}

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scan=new Scanner(System.in);
		System.out.println("请输入成绩");
		int score=scan.nextInt();
		String mark=getMark(score);
		System.out.println(mark);
	}

}
