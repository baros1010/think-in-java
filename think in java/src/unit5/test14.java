package unit5;
	
class haha{
	static String s="11";
	static String ss;
	static{
		ss="22";
		
	}
	
}
public class test14 {
	public static void main(String[] args){
		String ha=haha.ss.trim();
		System.out.println(ha);
		
	}
}
