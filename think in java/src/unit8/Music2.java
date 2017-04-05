package unit8;

class Stringed extends Instrument {
	public void play(Note n) {
		System.out.println("Stringed.play()" + n);
	}
}

class Bass extends Instrument {
	public void play(Note n) {
		System.out.println("Bass.play()" + n);
	}
}

public class Music2 {
	public static void tune(Wind i) {
		i.play(Note.B_FLAT);

	}

	public static void tune(Stringed i) {
		i.play(Note.B_FLAT);

	}

	public static void tune(Bass i) {
		i.play(Note.B_FLAT);

	}

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Wind w = new Wind();
		Stringed s = new Stringed();
		Bass b = new Bass();
		tune(w);
		tune(s);
		tune(b);
	}

}
