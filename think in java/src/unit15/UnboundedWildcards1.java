package unit15;

import java.util.ArrayList;
import java.util.List;

public class UnboundedWildcards1 {
	static List list1;
	static List<?> list2;
	static List<? extends Object> list3;
	static void f1(List list){
		list1=list;
		list2=list;
		//list3=list; wanring
	}
	static void f2(List<?> list){
		list1=list;
		list2=list;
		list3=list;
	}
	static void f3(List<? extends Object> list){
		list1=list;
		list2=list;
		list3=list;
	}
	@SuppressWarnings("rawtypes")
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		f1(new ArrayList());
		f2(new ArrayList());
		f3(new ArrayList());
		f1(new ArrayList<String>());
		f2(new ArrayList<String>());
		f3(new ArrayList<String>());
		List<?> lists=new ArrayList();
		lists=new ArrayList<String>();
		f1(lists);
		f2(lists);
		f3(lists);
		
	
	}

}
