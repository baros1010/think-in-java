package unit21;

class runtest1 extends Thread {
	public void run() {
		for (int i = 0; i < 10; i++)
			System.out.println("haha" + i);

	}
}

class runtest2 implements Runnable {

	@Override
	public void run() {
		// TODO �����������ꂽ���\�b�h�E�X�^�u
		for(int i=0;i<10;i++){
			System.out.println("xixi"+i);	
		}
	

	}
}

public class testpro {

	public static void main(String[] args) {
		// TODO �����������ꂽ���\�b�h�E�X�^�u
		runtest1 t1= new runtest1();
		//Thread t1=new Thread(new runtest1());
		Thread t2=new Thread(new runtest2());
		t1.setPriority(1);
		t2.setPriority(10);
		t1.start();
		t2.start();
	}

}
