package unit5;



class window{
	
	 window(int marker){
		 System.out.println(marker);
		 
		 
	 }

	 
	 
 }
 class House{
	 window w1=new window(1);
	 House(){
		 
		 System.out.println("House()");
		 w3=new window(33);
	 }
	 window w2=new window(2);
	 window w3=new window(3);
	 void f(){ System.out.println("f()");}
}
public class OrderOfInitializaiton {
	public static void main(String[] args) {
		House ha=new House();
		ha.f();
		
		
	}
}
