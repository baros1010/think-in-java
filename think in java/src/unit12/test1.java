package unit12;

public class test1 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		try{
			int i=10;
			int j=i/0;
		}catch(Exception e){
			System.out.println("haha");
		}finally{
			System.out.println("xixi");
		}
	}

}
