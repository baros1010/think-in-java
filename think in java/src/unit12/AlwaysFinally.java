package unit12;
class FourException extends Exception{}
public class AlwaysFinally {

	public static void main(String[] args) {
		// TODO �����������ꂽ���\�b�h�E�X�^�u
		System.out.println("Entering first try block");
		try{
			System.out.println("Entering second try block");
			try{
				throw new FourException();
			}finally{
				System.out.println("finally in 2nd try block");
			}
		}catch(FourException e){
			System.out.println("catch four in 1st try block");
		}finally{
			System.out.println("finally in 1st try block");
		}
	}

}
