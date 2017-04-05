package unit4;

public class ifelse {
	static int a=1;
	static void test(int testval,int target){//任何实体类都可以调用没有super 与this
		if(testval>target){
			
			a=+1;
		}else if(testval==target){
			
			a=0;
		}else{
			
			a=-1;
			
		}
		
	}
	public static void main(String[] args) {
		
		ifelse.test(1,1);
		System.out.println(a);
		ifelse.test(2,1);
		System.out.println(a);
		ifelse.test(1,2);
		System.out.println(a);
	}
}
