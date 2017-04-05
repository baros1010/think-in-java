package unit5;
class person{
	void eat(Apple a){
		
		Apple peeled=a.getpeeled();
		System.out.println("aaa");
		
		
	}
	
	
	
	
	
}
class peeler{
	static Apple peel(Apple a){
		return a;
		
		
	}
	
	
}
class Apple{
	
	Apple getpeeled(){
		
		return peeler.peel(this);
	}
	
}
public class PassingThis {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
new person().eat(new Apple());
	}

}
