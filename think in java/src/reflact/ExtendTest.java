package reflact;
class test1{}
class test2 extends test1{}
class test3 extends test2{}
public class ExtendTest {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		try {
			Class c=Class.forName("reflact.test3");
			test3 t=new test3();
			if(c.isInstance(t))
				System.out.println("aaa");
			System.out.println(c.getSuperclass());
		} catch (ClassNotFoundException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		}
	}

}
