package unit11;

import java.util.Iterator;

public class Iterableclass implements Iterable<String>{
	protected String[] words=("And that  is how").split(" ");
	public Iterator<String> iterator(){
		return new Iterator<String>(){
			private int index=0; 
			@Override
			public boolean hasNext() {
				// TODO �����������ꂽ���\�b�h�E�X�^�u
				return index<words.length;
			}

			@Override
			public String next() {
				// TODO �����������ꂽ���\�b�h�E�X�^�u
				return words[index++];
			}};
	}
	public static void main(String[] args) {
		// TODO �����������ꂽ���\�b�h�E�X�^�u
		for(String s:new Iterableclass())
			System.out.println(s);
	}

}
