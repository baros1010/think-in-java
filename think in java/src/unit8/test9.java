package unit8;
class Rodent{
	public void bite(){System.out.println("123");}
}
class Mouse extends Rodent{
	public void bite(){System.out.println("222");}
}
class Grebil extends Rodent{
	public void bite(){System.out.println("333");}
}
class Hamster extends Rodent{
	public void bite(){System.out.println("444");}
}

public class test9 {
	public static void test1(Rodent i){
		i.bite();
	}
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Rodent[] rr= {
			new Mouse(),new Grebil(),new Hamster()
		};
		for(Rodent r:rr)
			test1(r);
	}

}
