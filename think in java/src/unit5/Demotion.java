package unit5;

public class Demotion {

	void f1(char x){System.out.println("f1(char x)");}
	void f1(byte x){System.out.println("f1(byte x)");}
	void f1(short x){System.out.println("f1(short x)");}
	void f1(long x){System.out.println("f1(long x)");}
	void f1(float x){System.out.println("f1(float x)");}
	void f1(double x){System.out.println("f1(double x)");}
	
	void f2(char x){System.out.println("f1(char x)");}
	void f2(byte x){System.out.println("f1(byte x)");}
	void f2(short x){System.out.println("f1(short x)");}
	void f2(long x){System.out.println("f1(long x)");}
	void f2(float x){System.out.println("f1(float x)");}
	
	void f3(char x){System.out.println("f1(char x)");}
	void f3(byte x){System.out.println("f1(byte x)");}
	void f3(short x){System.out.println("f1(short x)");}
	void f3(long x){System.out.println("f1(long x)");}
	
	void f4(char x){System.out.println("f1(char x)");}
	void f4(byte x){System.out.println("f1(byte x)");}
	void f4(short x){System.out.println("f1(short x)");}
	
	void f5(char x){System.out.println("f1(char x)");}
	void f5(byte x){System.out.println("f1(byte x)");}
	
	void f6(char x){System.out.println("f1(char x)");}
	void testDouble(){
		System.out.println("double");
		double x=0;
		f1(x);
	
	}

}
