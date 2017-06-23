package unit15;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ArrayMarker<T> {
	private Class<T> kind;
	public ArrayMarker(Class<T> kind){this.kind=kind;}
	T[] create(int size){
		return(T[])Array.newInstance(kind, size);
	}
	public static void main(String[] args) {
		// TODO �����������ꂽ���\�b�h�E�X�^�u
		ArrayMarker<String> s=new ArrayMarker<String>(String.class);
		String[] ss=s.create(9);
		System.out.println(Arrays.toString(ss));
	}

}
