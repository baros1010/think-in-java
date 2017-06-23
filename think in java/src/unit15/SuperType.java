package unit15;

import java.util.List;

public class SuperType {
	static void writeTo(List<? super Apple> apples){
		apples.add(new Apple());
	}
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

	}

}
