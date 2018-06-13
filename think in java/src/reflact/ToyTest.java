package reflact;

interface HasBatteries {
};

interface Waterproof {
};

interface Shoots {
};

class Toy {
	Toy() {
	};

	Toy(int i) {
	}

}

class FancyToy extends Toy implements HasBatteries, Waterproof, Shoots {
	FancyToy() {
		super(1);
	}
}

public class ToyTest {
	static void printInfo(Class cc) {
		System.out.println("Class name" + cc.getName() + "  is interface?  " + cc.isInterface());
		System.out.println("Simple name:" + cc.getSimpleName());
		System.out.println("Canonical name:" + cc.getCanonicalName());
	}

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Class c=null;
	
		try {
			c=Class.forName("reflact.FancyToy");
		} catch (ClassNotFoundException e) {
			// TODO 自動生成された catch ブロック
			System.out.println("can not find FancyToy");
			System.exit(1);;
		}
		printInfo(c);
		for(Class face:c.getInterfaces())
			printInfo(face);
			Class up=c.getSuperclass();
		Object obj=null;
		try {
			obj=up.newInstance();
		} catch (InstantiationException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		}

	}

}
