package usefulcoding;

import java.text.SimpleDateFormat;
import java.util.Date;

public class CacheManager {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Date date = new Date();
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSZ");

		SimpleDateFormat df1 = new SimpleDateFormat("yyyy-MM-dd'测试'HH:mm:ss.SSSZ"); 

		String str = df.format(date);

		String str1 = df1.format(date);

		System.out.println(str);

		System.out.println(str1);
	}

}
