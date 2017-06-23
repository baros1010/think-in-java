package unit17;

import java.util.LinkedHashSet;
import java.util.Set;

import unit15.Generator;

class Govement implements Generator<String>{
	String[] foundation=("I am your father"+"you are my son").split(" ");
	private int index;
	@Override
	public String next() {
		// TODO 自動生成されたメソッド・スタブ
		return foundation[index++];
	}}
public class CollectionDataTest {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Set<String> set=new LinkedHashSet<String>(new CollectionData<String>(new Govement(),7));
		set.addAll(CollectionData.list(new Govement(), 7));
		System.out.println(set);
		
	}

}
