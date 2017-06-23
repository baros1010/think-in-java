package unit11;

import java.util.ArrayList;

class aa extends Apple{}
class bb extends Apple{}
class cc extends Apple{}
public class GenerisAndUpcasting {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		ArrayList<Apple> apples=new ArrayList<Apple>();
		apples.add(new aa());
		apples.add(new bb());
		apples.add(new cc());
		for(Apple a:apples){
			System.out.println(a);
		}
	
	}

}
