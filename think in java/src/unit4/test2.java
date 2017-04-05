package unit4;

import java.util.Random;

public class test2 {
	public static void main(String[] args) {
		int b = 1;
		for (int i = 0; i < 25; i++) {
			//int a = (int) Math.random();
			Random rand= new Random(47);
			
			int a=rand.nextInt(10);
			System.out.println(a);
			if (a > b) {
				System.out.println(a + ">" + b);

			} else if (a == b) {
				System.out.println(a + "=" + b);
			}else{
				System.out.println(a + "<" + b);
				
			}
			b=a;
		}

	}
}
