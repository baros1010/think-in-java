package unit15;
class Fruit{}
class Apple extends Fruit{}
class Jonathon extends Apple{}
class Orange extends Fruit{}

public class CovariantArrays {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Fruit[] fruit=new Apple[10];
		fruit[0] =new Apple();
		fruit[1]=new Jonathon();
		try{
			fruit[0]=new Fruit();
			
		}catch(Exception e){
			System.out.println(e);
		}
		try{
			fruit[0]=new Orange();
		}catch(Exception e){
			System.out.println(e);
		}
		
	}

}
