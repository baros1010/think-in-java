package unit21;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CachThreadpool {

	public static void main(String[] args) {
		// TODO �����������ꂽ���\�b�h�E�X�^�u
		//ExecutorService exec =Executors.newCachedThreadPool();
		ExecutorService exec =Executors.newFixedThreadPool(5);
		for(int i=0;i<5;i++)
			exec.execute(new LiftOff());
		exec.shutdown();
	}

}
