package unit15;

public class Fibonacci implements Generator<Integer> {
	private int count;

	private int fib(int n){if(n<2)return 1;
	else
		return fib(n-1)+fib(n-2);
	}

	public static void main(String[] args) {
		// TODO �����������ꂽ���\�b�h�E�X�^�u
		Fibonacci f=new Fibonacci();
		for(int i=0;i<18;i++){
			System.out.println(f.next()+" ");
		}
	}

	public Integer next() {
		// TODO �����������ꂽ���\�b�h�E�X�^�u
		return fib(count++);
	}

}
