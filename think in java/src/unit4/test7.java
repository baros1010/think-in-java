package unit4;

public class test7 {
	public static void main(String[] args){
		for(int i=0;1<101;i++){
			if(i==99){
				break;
			}
			
			System.out.print(" "+i);		
		}
		for(int i=0;1<101;i++){
			if(i==99){
				return;
			}
			
			System.out.print(" i="+i);
		}
		
		
		
	}
}
