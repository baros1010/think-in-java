package unit14;
class bala{
	 static{
		 System.out.println("haha");
	 }
}
public class test {
	
	public static void main(String[] args) {
		// TODO �����������ꂽ���\�b�h�E�X�^�u
		
		try {
			Class.forName("test14.bala");
		} catch (ClassNotFoundException e) {
			// TODO �����������ꂽ catch �u���b�N
			e.printStackTrace();
		}
	
	}

}
