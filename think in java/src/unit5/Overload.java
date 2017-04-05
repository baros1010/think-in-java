package unit5;

class tree{
	int height;
	tree(){
		System.out.println("plant a seedling");
		height=0;
	}
	tree(int initialHeight){
		height =initialHeight;
		System.out.println("Creating new Tree that is"+height+"feet tail");
		
		
	}
	void info(){
		System.out.println("tree is"+height+"feet tail");
		
		
	}
	void info(String s){
		System.out.println(s+"tree is"+height+"feet tail");
		
		
	}
}
public class Overload {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		for(int i=0;i<5;i++){
			tree t =new tree(i);
			t.info();
			t.info("overloaded method");
			new tree();
			
		}

	}

}
