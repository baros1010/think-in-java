package unit3;

public class URShirt {
	public static void main(String[] args){
		int i=2;
		System.out.println(Integer.toBinaryString(i));
		i<<=10;
		System.out.println(Integer.toBinaryString(i));
		long l=-1;
		System.out.println(Long.toBinaryString(l));
		l>>>=10;
		System.out.println(Long.toBinaryString(l));
		short s=-1;
		System.out.println(Integer.toBinaryString(s));
		byte b=-1;
		System.out.println(Integer.toBinaryString(b));
		b>>>=10;
		System.out.println(Integer.toBinaryString(b));
		
		b=-1;
		System.out.println(Integer.toBinaryString(b));
		System.out.println(Integer.toBinaryString(b>>>10));
	}
	
}
