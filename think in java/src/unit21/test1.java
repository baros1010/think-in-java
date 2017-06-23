package unit21;

import java.util.Random;

public class test1 implements Runnable{
	public static Random rand =new Random(47);
	
	@Override
	public void run() {
		// TODO 自動生成されたメソッド・スタブ
		System.out.print("this is"+rand.nextInt(20));
	}

}
