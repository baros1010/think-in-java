package unit10;

public class Parcel7b {
class MyContents implements Contents {
private int i=11;
	@Override
	public int value() {
		// TODO �����������ꂽ���\�b�h�E�X�^�u
		return i;
	}
	
}
public Contents contents(){return new MyContents();}
	public static void main(String[] args) {
		// TODO �����������ꂽ���\�b�h�E�X�^�u
		Parcel7b b=new Parcel7b();
		Contents c=b.contents();
	}

}
