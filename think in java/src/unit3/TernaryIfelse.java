package unit3;

public class TernaryIfelse {
	static int ternifelse(int i){ 
		return i<10 ? i*100: i*10;
	
	}
	static int felse(int i){
		
		if(i<10){
			i=i*100;
			
		}
		else{
			
			i=i*10;
		}
		return i;
		
		
		
	}
	public static void main(String[] args){
		
	System.out.println(ternifelse(11));
	System.out.println(ternifelse(1));
	System.out.println(felse(11));
	System.out.println(felse(1));
		
		
	}
}
