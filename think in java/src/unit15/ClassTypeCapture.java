package unit15;
class Building{}
class house extends Building{}
public class ClassTypeCapture<T> {
	Class<T> kind;
	public ClassTypeCapture(Class<T> kind){
		this.kind=kind;
	}
	public boolean f(Object arg){
		return kind.isInstance(arg);
	}

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		ClassTypeCapture<Building> ctt1=new ClassTypeCapture<Building>(Building.class);
		System.out.println(ctt1.f(new Building()));
		System.out.println(ctt1.f(new house()));
		System.out.println(ctt1.f(new Object()));
		ClassTypeCapture<house> ctt2=new ClassTypeCapture<house>(house.class);
		System.out.println(ctt2.f(new Building()));
		System.out.println(ctt2.f(new house()));
		System.out.println("////////////////////////////");
	
	}

}
