package unit21;

import java.util.concurrent.locks.Lock;

public class MutexEvenGenerator extends IntGenerator{
private int count;
private Lock lock;
	@Override
	
	public int next() {
		try{
			lock.lock();
			++count;
			Thread.yield();
			++count;
		}finally{
			lock.unlock();
		}
		
		// TODO �����������ꂽ���\�b�h�E�X�^�u
		return count;
	}

}
