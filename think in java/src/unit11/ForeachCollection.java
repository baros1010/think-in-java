package unit11;

import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;

public class ForeachCollection {

	public static void main(String[] args) {
		// TODO �����������ꂽ���\�b�h�E�X�^�u
		Collection<String>cs=new LinkedList<String>();
		Collections.addAll(cs, "I am Your father".split(" " ));
		for(String s:cs)
			System.out.println(s);
	}

}
