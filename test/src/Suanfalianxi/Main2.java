package Suanfalianxi;

public class Main2 {
	
	public int test(int n){
		if(n<=1) return 0;
		else{
		return n*test(n-1);
		}
		
	
	}

	public static void main(String[] args) {
		Main2 m = new Main2();
		System.out.println(m.test(5));

	}

}
