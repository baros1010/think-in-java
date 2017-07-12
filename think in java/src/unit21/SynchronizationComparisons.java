package unit21;

import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

abstract class Acculator{
	public static long cycles=50000L;
	private static final int N=4;
	public static ExecutorService exec=Executors.newFixedThreadPool(N*2);
	private CyclicBarrier barrier=new CyclicBarrier(N*2+1);
	protected volatile int index=0;
	protected volatile int value=0;
}
public class SynchronizationComparisons {

}
