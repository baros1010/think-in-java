package unit21;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class AtomicityTest implements Runnable{
private int i=0;
public  synchronized int getvalue(){return i;}
public synchronized void evenIncrement(){
	i++;
	i++; 
}
	public static void main(String[] args) {
		// TODO �����������ꂽ���\�b�h�E�X�^�u
		ExecutorService exc=Executors.newCachedThreadPool();
		AtomicityTest at=new AtomicityTest();
		
		exc.equals(at);
		while(true){
			int val=at.getvalue();
			if(val%2!=0){
				System.out.println(val);
				System.exit(0);
			}
		}
	}
	@Override
	public void run() {
		// TODO �����������ꂽ���\�b�h�E�X�^�u
		while(true)
			evenIncrement();
	}

}
