package unit16;

import java.util.Arrays;
import java.util.Random;

public class RaggedArray {

	public static void main(String[] args) {
		// TODO �����������ꂽ���\�b�h�E�X�^�u
		Random rand = new Random(47);
		int a[][][] =new int[rand.nextInt(7)][][];
		for(int i=0;i<a.length;i++){

			a[i]=new int[rand.nextInt(5)][];
			for(int j=0;j<a[j].length;j++)
				a[i][j] = new int[rand.nextInt(5)];
		}
		System.out.println(Arrays.deepToString(a));
	}

}
