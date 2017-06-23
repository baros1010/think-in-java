package unit12;
class MyException2 extends Exception{
	
}
public class test2 {
 private void f()throws  MyException2{
	 System.out.println(" haha");
	 throw new MyException2();
 }
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		test2 t1=new test2();
		try{
			t1.f();
		}catch(MyException2 e){
			System.out.println("xixi");
		}finally{
			System.out.println("hehe");
		}
	}

}
