package unit11;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class Statistics {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		 Random rand =new Random(47);
		 Map<Integer,Integer> m=new HashMap<Integer,Integer>();
		 for(int i=0;i<1000;i++){
			 int r=rand.nextInt(20);
			 Integer feq=m.get(r);
			 m.put(r, feq==null?1:feq);
		 }
		 System.out.println(m);
	}

}
