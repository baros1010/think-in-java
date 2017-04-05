package unit5;

public class PrimitiveOverloading {

	void f1(char x){System.out.println("f1(char x)");}
	void f1(byte x){System.out.println("f1(byte x)");}
	void f1(short x){System.out.println("f1(short x)");}
	void f1(long x){System.out.println("f1(long x)");}
	void f1(float x){System.out.println("f1(float x)");}
	void f1(double x){System.out.println("f1(double x)");}

	void f2(byte x){System.out.println("f2(byte x)");}
	void f2(short x){System.out.println("f2(short x)");}
	void f2(long x){System.out.println("f2(long x)");}
	void f2(float x){System.out.println("f2(float x)");}
	void f2(double x){System.out.println("f2(double x)");}
	
	void f3(short x){System.out.println("f3(short x)");}
	void f3(long x){System.out.println("f3(long x)");}
	void f3(float x){System.out.println("f3(float x)");}
	void f3(double x){System.out.println("f3(double x)");}
	
	void f4(long x){System.out.println("f4(long x)");}
	void f4(float x){System.out.println("f4(float x)");}
	void f4(double x){System.out.println("f4(double x)");}
	
	void f5(long x){System.out.println("f5(long x)");}
	void f5(float x){System.out.println("f5(float x)");}
	void f5(double x){System.out.println("f5(double x)");}
	
	void f6(float x){System.out.println("f6(float x)");}
	void f6(double x){System.out.println("f6(double x)");}
	
	void f7(double x){System.out.println("f7(double x)");}
	
	void testConstVal(){
		System.out.println("5");
		f1(5);f2(5);f3(5);f4(5);f5(5);f6(5);f7(5);
	}
	void testChar(){
		System.out.println("X");
		char x='x';
		f1(x);f2(x);f3(x);f4(x);f5(x);f6(x);f7(x);
	}
	void testByte(){
		System.out.println("byte");
		byte x=0;
		f1(x);f2(x);f3(x);f4(x);f5(x);f6(x);f7(x);
	}
	void testshort(){
		System.out.println("short");
		short x=0;
		f1(x);f2(x);f3(x);f4(x);f5(x);f6(x);f7(x);
	}
	void testInt(){
		System.out.println("int");
		int x=0;
		f1(x);f2(x);f3(x);f4(x);f5(x);f6(x);f7(x);
	}
	void testLong(){
		System.out.println("long");
		long x=0;
		f1(x);f2(x);f3(x);f4(x);f5(x);f6(x);f7(x);
	}
	void testDouble(){
		System.out.println("double");
		double x=0;
		f1(x);f2(x);f3(x);f4(x);f5(x);f6(x);f7(x);
	}
	void testFloat(){
		System.out.println("float");
		float x=0;
		f1(x);f2(x);f3(x);f4(x);f5(x);f6(x);f7(x);
	}
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		PrimitiveOverloading p=new PrimitiveOverloading();
		p.testConstVal();
		p.testChar();
		p.testByte();
		p.testshort();
		p.testInt();
		p.testLong();
		p.testDouble();
		p.testFloat();
	}

}
