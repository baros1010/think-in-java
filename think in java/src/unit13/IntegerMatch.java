package unit13;

public class IntegerMatch {

	public static void main(String[] args) {
		// TODO �����������ꂽ���\�b�h�E�X�^�u
		System.out.println("-1234".matches("-?\\d++"));
		System.out.println("1234".matches("-?\\d++"));
		System.out.println("+1234".matches("-?\\d++"));
		System.out.println("+1234".matches("(-|\\+)?\\d++"));
	}

}