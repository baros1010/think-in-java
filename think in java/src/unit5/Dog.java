package unit5;

public class Dog {
	
	
	 void bark(int i){
		System.out.println("barking");
		
	}
	 void bark(String i){
			System.out.println("howing");
			
		}
	 
	 void bark(String i,int j){
			System.out.println("hahaha");
			
		}
	 void bark(int j,String i){
			System.out.println("nonono");
			
		}
	public static void main(String[] args) {
		Dog d=new Dog();
		d.bark(0);
		d.bark("11");
		d.bark("11", 0);
		d.bark(0, "11");
		
	}
}
