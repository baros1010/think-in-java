package unit21;

class thread1 implements Runnable {

	@Override
	public void run() {
		// TODO �����������ꂽ���\�b�h�E�X�^�u
		for (int i = 0; i < 100; i++) {
			System.out.println("haha" + i);

		}
	}

}

public class joinpratice implements Runnable {
	 static int i;
	public static void main(String[] args) throws InterruptedException {
		// TODO �����������ꂽ���\�b�h�E�X�^�u
		Thread td1 = new Thread(new joinpratice());
		td1.start();
	
	
	}

	@Override
	public void run() {
		// TODO �����������ꂽ���\�b�h�E�X�^�u
		for (i = 0; i < 100; i++) {
			System.out.println("xixi" + i);
			Thread td2 = new Thread(new thread1());
			if(i==20){
				td2.start();
				
				try {
					td2.join(1000);
				} catch (InterruptedException e) {
					// TODO �����������ꂽ catch �u���b�N
					e.printStackTrace();
				}
			}
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO �����������ꂽ catch �u���b�N
				e.printStackTrace();
			}
		}
	}

}
