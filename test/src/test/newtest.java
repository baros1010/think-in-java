package test;

public class newtest {
	int i = 1;

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		newtest t1 = new newtest();
		newtest t2 = new newtest();
		boolean a=t1.equals(t2);
		System.out.println(a);
		String s1="s";
		String s2="s";
		String s3=new String("s");
		System.out.println(s1==s2);
		System.out.println(s1==s3);
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		System.out.println(s2.hashCode());
		int a1=0;
		int b=4;
		System.out.println(-10<a1&&b<0);
		
		
	}

}
