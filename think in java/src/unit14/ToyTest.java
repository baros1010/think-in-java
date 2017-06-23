package unit14;

interface HasBAtteries {
}

interface Waterproof {
}

interface shoots {
}

class Toy {
	Toy() {
	}

	Toy(int i) {
	}
}

class FancyToy extends Toy {
	FancyToy() {
		super(1);
	}
}

public class ToyTest {
	static void print(Class cc) {
		System.out.println("Class name" + cc.getName()+"  isinterface"+cc.isInterface());
		System.out.println("Simple name:"+cc.getSimpleName());
		System.out.println("Canonical name:"+cc.getCanonicalName());
		
	}

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Class c=null;
		try{
			c=Class.forName("test14.FancyToy");
			
		}catch(ClassNotFoundException e){
			System.out.println("not exit");
			System.exit(1);
			
		}
		print(c);
		for(Class face:c.getInterfaces())
			print(face);
		Class up=c.getSuperclass();
		Object obj=null;
		try{
			obj=up.newInstance();
		}catch(InstantiationException e){
			System.out.println("not exit");
			System.exit(1);
		}catch(IllegalAccessException e){
			System.out.println("not exit");
			System.exit(1);
		}
		print(obj.getClass());
	}

}
