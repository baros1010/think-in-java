package unit16;

import java.util.Arrays;
import java.util.Random;


public class IceCream {
	private static Random rand=new Random(47); 
	static final String[] FLAVOR={"Chocolate","strawbrry","Vanilla Fude Swirl","Mint Chip","Mocha Almond swirl","Rum Raisin",
			"Praline Cream","Mud pie"};
	public static String[] flavorSet(int n){
		if(n>FLAVOR.length)
			throw new IllegalArgumentException("Set too big");
		String[] results=new String[n];
		boolean[] picked =new boolean [FLAVOR.length];
		for(int i=0;i<n;n++){
			int t;
			do 
				t=rand.nextInt(FLAVOR.length);
			while(picked[t]);
					results[i]=FLAVOR[t];
					picked[t]=true;
					
		}
		
		return results;		
	}
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		for(int i=0;i<7;i++){
			System.out.println(Arrays.toString(flavorSet(3)));
		}
	}

}
