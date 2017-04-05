package unit3;

import java.util.Random;

public class coinrandom {
	public static void main(String[] args) {

		Random rand = new Random();
		int i = rand.nextInt(2);
		String a = "ê≥ñ ";
		if (i == 1) {
			a = "îΩñ ";
		}
		System.out.println(a);
	}
}
