package unit21;

public class Maintest1 {

	public static void main(String[] args) {
		// TODO �����������ꂽ���\�b�h�E�X�^�u
		Thread td=new Thread(new test1());
		for(int i=0;i<10;i++)
	td.run();

	}

}
