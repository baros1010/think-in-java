package unit17;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class StringAdress{
	private String s;
	public StringAdress(String s){this.s=s;}
	public String toString(){
		return super.toString()+" "+s;
	}
}
public class FillingList {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		List<StringAdress> list=new ArrayList<StringAdress>(Collections.nCopies(4, new StringAdress("Hello")));
	
		System.out.println(list);
		Collections.fill(list, new StringAdress("world"));
		System.out.println(list);
		List<StringAdress> lists=new ArrayList<StringAdress>();
		Collections.fill(lists, new StringAdress("world6"));
		System.out.println(lists);
	}

}
