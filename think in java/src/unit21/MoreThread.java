package unit21;

public class MoreThread {

	public static void main(String[] args) {
		// TODO �����������ꂽ���\�b�h�E�X�^�u
		
		for(int i=0;i<10;i++){
			Thread td=new Thread(new LiftOff());
			td.start();
			
		}
		
	}

}
