package unit21;

class T1 implements Runnable {

	@Override
	public void run() {
		// TODO �����������ꂽ���\�b�h�E�X�^�u

		for (int i = 0; i < 100; i++) {
			System.out.println("lala" + i);
		
		}

	}
}




public class jointest implements Runnable{

	public static void main(String[] args) throws InterruptedException {
		// TODO �����������ꂽ���\�b�h�E�X�^�u
		Thread td=new Thread(new jointest());
		td.start();
	
		Thread tds=new Thread(new T1 ());
		tds.start();
		tds.join(2000);
		

	}

	@Override
	public void run() {
		// TODO �����������ꂽ���\�b�h�E�X�^�u

		for (int i = 0; i < 100; i++) {
			System.out.println("haha" + i);
			try {
				Thread.sleep(1000);

			} catch (InterruptedException e) {
				// TODO �����������ꂽ catch �u���b�N
				e.printStackTrace();
			}
		}

	}

}
