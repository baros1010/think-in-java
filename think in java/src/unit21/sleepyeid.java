package unit21;

public class sleepyeid implements Runnable{

	public static void main(String[] args) {
		// TODO �����������ꂽ���\�b�h�E�X�^�u
		sleepyeid sl=new sleepyeid();
		Thread td=new Thread(sl);
		td.start();
	}

	@Override
	public void run() {
		for(int i=0;i<100;i++){
			// TODO �����������ꂽ���\�b�h�E�X�^�u
			System.out.println("1");
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO �����������ꂽ catch �u���b�N
				e.printStackTrace();
			}
			System.out.println("2");
		}
		
	}

}
