package unit15;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class New {
	public static <K,V> Map<K,V> map(){
		return new HashMap<K,V>();
	}
public static <T> List<T> list(){
	return new ArrayList<T>();
}
	public static void main(String[] args) {
		// TODO �����������ꂽ���\�b�h�E�X�^�u
		Map<String,String> mp=New.map();
		List<Integer> list=New.list();
	}

}
