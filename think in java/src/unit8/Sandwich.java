package unit8;
class Meal{
	Meal(){
		System.out.println("Meal()");
	}
}
class Bread{
	Bread(){
		System.out.println("Bread()");
	}
}
class Cheese{
	Cheese(){
		System.out.println("Cheese()");
	}
}
class Lettuce{
	Lettuce(){
		System.out.println("Lettuce()");
	}
}
class Lunch extends Meal{
	Lunch(){
		System.out.println("Lunch()");
	}
}
class PortableLunch extends Lunch{
	PortableLunch(){
		System.out.println("PortableLunch()");
	}
}
public class Sandwich extends PortableLunch{
	private Bread b=new Bread();
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Sandwich s=new Sandwich();
	}

}
