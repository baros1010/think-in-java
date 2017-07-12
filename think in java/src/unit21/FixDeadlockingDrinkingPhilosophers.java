package unit21;

import java.io.IOException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class FixDeadlockingDrinkingPhilosophers {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO 自動生成されたメソッド・スタブ
		int ponder=5;
		if(args.length>0)
			ponder=Integer.parseInt(args[0]);
		int size=5;
		if(args.length>1)
			size=Integer.parseInt(args[1]);
		ExecutorService exec=Executors.newCachedThreadPool();
		Chopstick[] sticks=new Chopstick[size];
		for(int i=0;i<size;i++)
			sticks[i]=new Chopstick();
		for(int i=0;i<size;i++)
			if(i<(size-1))
			exec.execute(new Phiosopher(sticks[i],sticks[(i+1)%size],i,ponder));
			else
				exec.execute(new Phiosopher(sticks[0],sticks[i],i,ponder));
		if(args.length==3&&args[2].equals("timeout"))
			TimeUnit.SECONDS.sleep(5);
		else{
			System.out.println("quit");
			System.in.read();
		}
		exec.shutdownNow();
	}

	}

