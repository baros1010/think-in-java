package unit4;

public class whiletest {
	
	static boolean test(){
		boolean result =Math.random()<100;
		System.out.println(result);
		return result;
		
		
		
	}
public static void main(String [] args){
	while(test()){
		
		System.out.println("inside while");
		
	}
	System.out.println("out while");
	
	
	
	
	
}
}
