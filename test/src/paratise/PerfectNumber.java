package paratise;

public class PerfectNumber {
    public static int Fibonacci(int n) {
	if(n==1||n==2){
        return n;
    }else{
        return Fibonacci(n-1)+Fibonacci(n-2);
    }
    }
	public static void main(String[] args) {
		// TODO �����������ꂽ���\�b�h�E�X�^�u
		System.out.println(Fibonacci(9));
	}

}
