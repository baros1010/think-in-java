package unit17;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

public class test {

	public static void main(String[] args) throws ParseException {
		// TODO 自動生成されたメソッド・スタブ
		List<String> list=new ArrayList<String>();
		list.add("1");
		list.add("2");
		list.add("3");
		list.add("4");
		list.add("5");
		list.addAll(Arrays.asList("11","12","13","14"));
		System.out.println(list);
		System.out.println(list.contains("11"));
		System.out.println(list.containsAll(Arrays.asList("1","2")));
//		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");  
//		java.util.Date date=new java.util.Date("19920125");  
//		String str=sdf.format(date); 
//		System.out.println(str);
		String s="01-00100";
		String ss=s.substring(0, 2)+s.substring(3, 8);
		System.out.println(ss);

//	}
	}
}
