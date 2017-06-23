package unit10;

public class Parcel7b {
class MyContents implements Contents {
private int i=11;
	@Override
	public int value() {
		// TODO 自動生成されたメソッド・スタブ
		return i;
	}
	
}
public Contents contents(){return new MyContents();}
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Parcel7b b=new Parcel7b();
		Contents c=b.contents();
	}

}
