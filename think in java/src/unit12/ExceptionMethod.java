package unit12;

public class ExceptionMethod {

	public static void main(String[] args) {
		// TODO �����������ꂽ���\�b�h�E�X�^�u
		try{
			throw new Exception("hahaha");
		}catch(Exception e){
			System.out.println("caught it");
			System.out.println("getmessage"+e.getMessage());
			System.out.println("getLocalizedMessage"+e.getLocalizedMessage());
			System.out.println("toString"+e);
			System.out.println("printStackTrace");
			e.printStackTrace(System.out);
			
		}

	}

}
