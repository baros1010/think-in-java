package unit13;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class zhengzze {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Pattern p=Pattern.compile("\\d+");
		Matcher m   =p.matcher("2333");
		Matcher m2=p.matcher("234wacsi333ui");
		boolean b=m.matches();
		System.out.println(b);
		System.out.println(m2.find());//find()对字符串进行匹配,匹配到的字符串可以在任何位置.
		System.out.println(m2.lookingAt());//lookingAt()对前面的字符串进行匹配,只有匹配到的字符串在最前面才返回true
//		start()返回匹配到的子字符串在字符串中的索引位置. 
//		end()返回匹配到的子字符串的最后一个字符在字符串中的索引位置. 
//		group()返回匹配到的子字符串 
		System.out.println(m2.start());
		System.out.println(m2.end());
		System.out.println(m2.group());
		
		
	}

}
