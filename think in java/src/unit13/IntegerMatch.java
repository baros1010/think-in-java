package unit13;

public class IntegerMatch {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		System.out.println("-1234".matches("-?\\d++"));
		System.out.println("1234".matches("-?\\d++"));
		System.out.println("+1234".matches("-?\\d++"));
		System.out.println("+1234".matches("(-|\\+)?\\d++"));
	}

}
