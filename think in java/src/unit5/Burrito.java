package unit5;

public class Burrito {
	Spiciness ss;

	Burrito(Spiciness ss) {
		this.ss = ss;
	}

	public void aa() {

		switch (ss) {
		case TOP:
			System.out.println("1");
			break;
		case JUG:
			System.out.println("2");
			break;
		case MID:
			System.out.println("3");
			break;
		case ADC:
			System.out.println("4");
			break;
		}

	}

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Burrito TOP = new Burrito(Spiciness.TOP);
		TOP.aa();
	}

}
