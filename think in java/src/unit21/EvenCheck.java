package unit21;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class EvenCheck implements Runnable{
	private IntGenerator  generator;
	private final int id;
	public EvenCheck(IntGenerator  generator,int id){
		this.generator=generator;
		this.id=id;
	}
	
	@Override
	public void run() {
		
		while(!generator.isCanceled()){
			int val=generator.next();
			if(val%2!=0){
				System.out.println(val+"not even");
				
			}
		}
	}
	public static void test(IntGenerator gp,int count){
		System.out.println("Press");
		ExecutorService exc=Executors.newCachedThreadPool();
		for(int i=0;i<count;i++){
			exc.execute(new EvenCheck(gp,i));
		}
		exc.shutdown();
	}
	public static void test(IntGenerator gp){
		test(gp,10);
	}
}
