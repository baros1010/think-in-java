package unit7;
	class aa{
		aa(int i){
			System.out.println("aa");
			
		}
		
	}
public class test8 extends aa{
	test8(){
		super(1);
		System.out.println("bb");
	}
	test8(int i){
		super(1);
		System.out.println("bb");
	}
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		test8 t=new test8();
		test8 t2=new test8(1);
	}

}
