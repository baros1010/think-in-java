package unit4;

import java.util.Random;

public class VowelsAndConsotants {
	public static void main(String[] args) {
		Random rand = new Random(47);
		for (int i = 0; i < 100; i++) {
			int c = rand.nextInt(26);
			System.out.println((char)c);
			switch (c) {
			case 'a':
			case 'e':
			case 'i':
			case 'o':
			case 'u':
				System.out.println("元音");
				break;
			default:System.out.println("辅音");
			}

		}

	}
}
