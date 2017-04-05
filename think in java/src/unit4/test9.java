package unit4;

public class test9 {

	public static  int test(int n) {
		if (n == 1)
			return 1;
		else if (n == 2)
			return 1;
		else 
			return test(n-1)+test(n-2); //采用递归知识点的

	}

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
	for(int i=1;i<20;i++){
		System.out.print(test(i)+"\t");// /t代表tab缩进
		if(i%5==0)
			
			System.out.println();
	}
	
	}

}
