package unit10;

public class Parcel5 {
	public Destnation destnation(String s) {
		class PDestnation implements Destnation {
			private String label;

			private PDestnation(String whereTo) {
				label = whereTo;
			}

			@Override
			public String readLabel() {
				// TODO �����������ꂽ���\�b�h�E�X�^�u
				return label;
			}
		}
		return new PDestnation(s);
	}

	public static void main(String[] args) {
		// TODO �����������ꂽ���\�b�h�E�X�^�u
		Parcel5 p=new Parcel5();
		Destnation d=p.destnation("HAHAH");
	}

}
