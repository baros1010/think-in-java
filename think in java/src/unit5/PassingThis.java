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
		// TODO �����������ꂽ���\�b�h�E�X�^�u
new person().eat(new Apple());
	}

}
