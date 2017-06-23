package unit16;

import java.util.ArrayList;
import java.util.List;

public class ArrayOfGenerics {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		List<String>[] ls;
		List[] la=new List[10];
		ls=(List<String>[])la;
		ls[0] =new ArrayList<String>();
		//ls[1]=new ArrayList<Integer>();
		Object[] objects=ls;
		objects[0]=new ArrayList<String>();
		objects[1]=new ArrayList<Integer>();
		List<BerlliumSphere>[] s=(List<BerlliumSphere>[])new List[10];
		for(int i=0;i<s.length;i++)
			s[i]=new ArrayList<BerlliumSphere>(); 
	}

}
