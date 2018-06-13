package Suanfalianxi;

public class Main3 {
public static void method(int a,int b){
	a=a*10;
	b=b*10;
	int c=a;
	b=a;
	a=c;
}
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int a=10;
		int b=20;
		method(a,b);
		System.out.println(a);
	}

}
