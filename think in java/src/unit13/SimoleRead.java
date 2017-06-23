package unit13;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.StringReader;

public class SimoleRead {
	public static BufferedReader input = new BufferedReader(new StringReader("wo you yi ju ma mai pi\n22 22.2222"));

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		System.out.println("I am your father?");
		try {
			String name = input.readLine();
			System.out.println(name);
			System.out.println("How old are you ? what is your name?");
			System.out.println("//////");
			String number = input.readLine();
			System.out.println(number);
			String[] num = number.split(" ");
			int age = Integer.parseInt(num[0]);
			double fa = Double.parseDouble(num[1]);
			System.out.format("%s\n", name);
			System.out.format("%f\n", fa);
			System.out.format("%d\n", age);

		} catch (IOException e) {
			// TODO 自動生成された catch ブロック
			System.out.println("I/O Exception");
		}

	}

}
