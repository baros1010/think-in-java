package unit12;
class ThreeException extends Exception {}
public class FinallyWorks {
	static int count=0;

	public static void main(String[] args) {
		// TODO �����������ꂽ���\�b�h�E�X�^�u
		while(true){
			try{
				if(count++==0)
					throw new ThreeException();
					System.out.println("haha exception");
				
			}catch(ThreeException e){
				System.out.println("ThreeException");
			}finally{
				System.out.println("finally Exception");
				if(count==2) break;
			}
		}
	}

}
