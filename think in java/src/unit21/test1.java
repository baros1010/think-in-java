package unit21;

import java.util.Random;

public class test1 implements Runnable{
	public static Random rand =new Random(47);
	
	@Override
	public void run() {
		// TODO �����������ꂽ���\�b�h�E�X�^�u
		System.out.print("this is"+rand.nextInt(20));
	}

}
