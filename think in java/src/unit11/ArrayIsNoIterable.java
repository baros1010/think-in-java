package unit11;

import java.util.Arrays;

public class ArrayIsNoIterable {
	static <T> void test(Iterable<T> ib){
		for(T t:ib){
			System.out.println(t+" ");
		}
	}
	public static void main(String[] args) {
		// TODO �����������ꂽ���\�b�h�E�X�^�u
		test(Arrays.asList(1,2,3));
		String[] Strings={"A","B","C"};
		test(Arrays.asList(Strings));
	}

}
