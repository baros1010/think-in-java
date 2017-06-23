package unit12;
	class MyException extends Exception{
		
	}
public class SimpleException {
	public void f() throws MyException{
		System.out.println("I am your father");
		throw new MyException();
	}
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		SimpleException sp=new SimpleException();
		try{
			sp.f();
			
		}catch(MyException e){
			System.out.println("Catught it");

		}
	}

}
