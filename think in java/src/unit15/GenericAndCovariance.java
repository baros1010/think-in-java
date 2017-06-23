package unit15;

import java.util.ArrayList;
import java.util.List;

public class GenericAndCovariance {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		List<? extends Fruit> lists=new ArrayList<Apple>();
		List<Apple> list=new ArrayList<Apple>();
		//lists.add(new Apple()); error
		list.add(new Apple());

	}

}
