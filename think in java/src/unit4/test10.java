package unit4;

public class test10 {
	
//	public static void main(String[] args){
//		
//		/***
//		 * –\—Í”j‰ð
//		 * 
//		 */
////		for(int i=1000;i<10000;i++)
////		{
////			if(i%100==0){
////				continue;
////				
////			}
////			int a=i/1000;//çˆÊ”Žš
////			int b=i/100%10;
////			int c=i/10%10;
////			int d=i/10;
////			if((10*a+b)*(10*c+d)==i){
////				System.out.println(i);
////				continue;
////			}else if((10*a+c)*(10*b+d)==i){
////				System.out.println(i);
////				continue;
////			}else if((10*a+d)*(10*b+c)==i){
////				System.out.println(i);
////				continue;
////			}else if((10*a+c)*(10*b+d)==i){
////				System.out.println(i);
////				continue;
////			}
////			else if((10*a+b)*(10*d+c)==i){
////				System.out.println(i);
////				continue;
////			}
////			else if((10*a+c)*(10*b+d)==i){
////				System.out.println(i);
////				continue;
////			}if((10*a+c)*(10*d+b)==i){
////				System.out.println(i);
////				continue;
////			}
////			
////			
////			
////	}
//	
//		
//}
	/**—D‰»
	 * •û–@1
	 * 
	 * 
	 */
	 static int a(int i){
		
		return i/1000;
		
	}
    static int b(int i) {
        return (i%1000)/100;
    }
    static int c(int i) {
        return ((i%1000)%100)/10;
    }
    static int d(int i) {
        return ((i%1000)%100)%10;
    }
   
   static int sum(int x,int y){
	   return (x * 10) + y;
	   
   }
   static int test (int a,int b,int i){
	   
	   if(a*b==i)
		   System.out.println(i) ; 
		   return  i;

   }
   public static void main(String[] args) {
	   for(int i=1001;i<9999;i++){
		  test(sum(a(i),b(i)),sum(c(i),d(i)),i); 
		  test(sum(a(i),b(i)),sum(d(i),c(i)),i); 
		  test(sum(a(i),c(i)),sum(b(i),d(i)),i); 
		  test(sum(a(i),c(i)),sum(d(i),b(i)),i); 
		  test(sum(a(i),d(i)),sum(b(i),c(i)),i); 
		  test(sum(a(i),d(i)),sum(c(i),b(i)),i); 
		  test(sum(b(i),a(i)),sum(c(i),d(i)),i);  
		  test(sum(b(i),a(i)),sum(d(i),c(i)),i);  
		  test(sum(b(i),c(i)),sum(d(i),a(i)),i);  
		  test(sum(b(i),d(i)),sum(c(i),a(i)),i);  
		  test(sum(c(i),a(i)),sum(d(i),b(i)),i);  
		  test(sum(c(i),b(i)),sum(d(i),a(i)),i);  
	   }
	   
	   
	   
	   
	   
   } 
}
