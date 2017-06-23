package unit21;

import java.util.Random;

public class test6 implements Runnable{
Random rand=new Random(47);
	@Override
	public void run() {
		// TODO 自動生成されたメソッド・スタブ
		System.out.println("lala");
		try {
			int i=rand.nextInt(1000);
			System.out.println(i);
			Thread.sleep(i);
		} catch (InterruptedException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		}
		System.out.println("haha");
	}
public static void main(String[] args){
	test6 t=new test6();
	Thread td=new Thread(t);
	td.start();
}
}
