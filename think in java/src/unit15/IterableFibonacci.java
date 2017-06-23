package unit15;

import java.util.Iterator;

public class IterableFibonacci extends Fibonacci implements Iterable<Integer> {
	private int n;

	public IterableFibonacci(int count) {
		n = count;
	}

	public static void main(String[] args) {
		// TODO �����������ꂽ���\�b�h�E�X�^�u
		for(int i:new IterableFibonacci(18))
			System.out.println(i+" ");
	}

	@Override
	public Iterator<Integer> iterator() {
		// TODO �����������ꂽ���\�b�h�E�X�^�u
		return new Iterator<Integer>() {

			@Override
			public boolean hasNext() {
				// TODO �����������ꂽ���\�b�h�E�X�^�u
				return n > 0;
			}

			@Override
			public Integer next() {
				// TODO �����������ꂽ���\�b�h�E�X�^�u
				n--;
				return IterableFibonacci.this.next();
			}
			public void remove(){
				throw new UnsupportedOperationException();
			}
		};
	}

	

}
