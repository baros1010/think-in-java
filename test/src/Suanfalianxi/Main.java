package Suanfalianxi;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class Main {
	
	public int test(String str){
		int count=0;
		
		int i=0;
		while(str.charAt(i)!='\n'){
			count++;
			++i;
		
		}
//		for(int i=str.length()-1;i>=0;i--){
//			if(str.charAt(i)!=' '){
//				count++;
//			}else{
//				break;
//			}
//		}
		return count;
	}
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Main m=new Main(); 
		Scanner scanner=new Scanner(System.in);
		String str=scanner.nextLine();
		System.out.println(str.length());
//		int i=m.test(str);
//		System.out.println(i);
		Map<String,String> map=new HashMap<String,String>();
		map.put("1", "2");
		map.put("2", "3");
		map.put("3", "4");
		Map.Entry<String, String>entry=(Entry<String, String>) map.entrySet();
		
	}

}
