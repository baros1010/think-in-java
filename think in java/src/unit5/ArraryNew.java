package unit5;

import java.util.Arrays;
import java.util.Random;

public class ArraryNew {

	public static void main(String[] args) {
		// TODO �����������ꂽ���\�b�h�E�X�^�u
		int []a;
		Random rand =new Random(47);
		a=new int[rand.nextInt(20)];
		System.out.println(a.length);
		System.out.println(Arrays.toString(a));

	}

}
