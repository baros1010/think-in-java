package unit12;
class MyException2 extends Exception{
	
}
public class test2 {
 private void f()throws  MyException2{
	 System.out.println(" haha");
	 throw new MyException2();
 }
	public static void main(String[] args) {
		// TODO �����������ꂽ���\�b�h�E�X�^�u
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
