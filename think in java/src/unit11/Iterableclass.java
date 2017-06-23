package unit11;

import java.util.Iterator;

public class Iterableclass implements Iterable<String>{
	protected String[] words=("And that  is how").split(" ");
	public Iterator<String> iterator(){
		return new Iterator<String>(){
			private int index=0; 
			@Override
			public boolean hasNext() {
				// TODO 自動生成されたメソッド・スタブ
				return index<words.length;
			}

			@Override
			public String next() {
				// TODO 自動生成されたメソッド・スタブ
				return words[index++];
			}};
	}
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		for(String s:new Iterableclass())
			System.out.println(s);
	}

}
