package unit14;
class bala{
	 static{
		 System.out.println("haha");
	 }
}
public class test {
	
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		try {
			Class.forName("test14.bala");
		} catch (ClassNotFoundException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		}
	
	}

}
