package unit2.test;

import java.io.UnsupportedEncodingException;
import java.util.Base64;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class test1 {
	public static void main(String args[]) throws UnsupportedEncodingException {
		//
		// String s = "basic MTIzNDoxMjMz";
		// System.out.println(s.replace("basic " + "", "").trim());
		// byte[] decodeBytes = Base64.getDecoder().decode(s.replace("basic " +
		// "", "").trim());
		// String ss = new String(decodeBytes);
		// System.out.println(ss);
		// final StringTokenizer tokenizer = new StringTokenizer(ss, ":");
		// final String username = tokenizer.nextToken();
		// final String password = tokenizer.nextToken();
		// String sss="\"";
		// String jsonString =
		// "{\"users\":[{\"loginname\":\"zhangfan\",\"password\":\"userpass\",\"email\":\"10371443@qq.com\"},{\"loginname\":\"zf\",\"password\":\"userpass\",\"email\":\"822393@qq.com\"}]}";
		// // String[] sss=ss.split(":");
		//
		// System.out.println(sss);
		//
		/*
		 * String regEx = "^\\d{4}$"; String str="0011"; Pattern pattern =
		 * Pattern.compile(regEx); Matcher matcher = pattern.matcher(str); //
		 * 查找字符串中是否有匹配正则表达式的字符/字符串 boolean rs = matcher.find();
		 * System.out.println(rs);
		 */
		// String URL =
		// "https://chenlei.mybluemix.net/cic/jpbanking/apic/demo/stub/simulator/accounts/";
//		System.out.print("输入");
//		Scanner scan = new Scanner(System.in);
//		System.out.println("输入数据：");
//		String user = scan.nextLine();
//		System.out.println("输入数据：");
//		String password = scan.nextLine();

//		String code = "1234" + ":" + "1233";
//		String codes = code.trim();
//		byte[] b = codes.getBytes("UTF8");
//		String c=Base64.getEncoder().encodeToString(b);
//		System.out.println("c"+c);
		String s="a";
		String ss=s.toUpperCase();
		System.out.println(ss);

	}
}
