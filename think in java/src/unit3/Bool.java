package unit3;

import java.util.Random;

public class Bool {
	public static void main(String[] args){
		Random rand=new Random();
		int i=rand.nextInt(2);
		int j=rand.nextInt(100);
		System.out.println(i);
		System.out.println(j);
		System.out.println(i>j);
		System.out.println(i<j);
		//System.out.println(i&&j);//•s”\—p
		System.out.println((i<10)&&(j<10));
		System.out.println((i<10)||(j<10));
		
	}
	
}
