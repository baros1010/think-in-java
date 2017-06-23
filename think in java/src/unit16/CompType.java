package unit16;

import java.util.Random;

import unit15.Generator;

public class CompType implements Comparable<CompType> {
	int i;
	int j;
	private static int count = 1;

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		//CompType [] a=
	}

	public CompType(int i, int j) {
		this.i = i;
		this.j = j;

	}

	public String ToString() {
		String result = "[i=" + i + ",j=" + j + "]";
		if (count++ % 3 == 0)
			result += "\n";
		return result;
	}

	@Override
	public int compareTo(CompType o) {
		// TODO 自動生成されたメソッド・スタブ
		return (i < o.i ? -1 : (i == o.i ? 0 : 1));

	}

	private static Random rand = new Random(47);

	public static Generator<CompType> test() {
		return new Generator<CompType>() {

			@Override
			public CompType next() {
				// TODO 自動生成されたメソッド・スタブ
				return new CompType(rand.nextInt(100), rand.nextInt(100));
			}
		};
	}
}
