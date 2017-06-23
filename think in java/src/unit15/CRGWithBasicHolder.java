package unit15;
class sub extends BasicHolder<sub>{}

public class CRGWithBasicHolder {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		sub s=new sub(),
		s2=new sub();
		s.set(s2);
		sub s3=s.get();
		s .f();
	}

}
