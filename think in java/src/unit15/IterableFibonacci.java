package unit15;

import java.util.Iterator;

public class IterableFibonacci extends Fibonacci implements Iterable<Integer> {
	private int n;

	public IterableFibonacci(int count) {
		n = count;
	}

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		for(int i:new IterableFibonacci(18))
			System.out.println(i+" ");
	}

	@Override
	public Iterator<Integer> iterator() {
		// TODO 自動生成されたメソッド・スタブ
		return new Iterator<Integer>() {

			@Override
			public boolean hasNext() {
				// TODO 自動生成されたメソッド・スタブ
				return n > 0;
			}

			@Override
			public Integer next() {
				// TODO 自動生成されたメソッド・スタブ
				n--;
				return IterableFibonacci.this.next();
			}
			public void remove(){
				throw new UnsupportedOperationException();
			}
		};
	}

	

}
