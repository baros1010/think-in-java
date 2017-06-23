package unit16;

import java.util.Arrays;

import unit15.Generator;

public class Generated {
	public static void main(String[] args) {
		int[] a = new int[10];
		int[] b = new int[10];
		Arrays.fill(a, 1);
		Arrays.fill(b, 2);
		System.out.println("i=" + Arrays.toString(a));
		System.out.println("j=" + Arrays.toString(b));
		int[] c = new int[6];
		Arrays.fill(c, 3);
		System.arraycopy(a, 0, c, 0, c.length);
		System.out.println("k=" + Arrays.toString(c));
		Arrays.fill(c, 3);
		System.arraycopy(c, 1, a, 0, c.length-1);
		System.out.println("i=" + Arrays.toString(a));
		Integer [] i=new Integer[10];
		Integer [] j=new Integer[20];
		Arrays.fill(i, new Integer(47));
		Arrays.fill(j, new Integer(100));
		System.out.println(Arrays.toString(i));
		System.out.println(Arrays.toString(j));
		System.arraycopy(i, 0, j, 0, i.length);
		System.out.println(Arrays.toString(j));
	}

}
