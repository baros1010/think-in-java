package unit8;

import java.util.Arrays;

class Instruments {
	void play(Note n) {
		System.out.println("Instrument.play()" + n);
	}

	String what() {
		return "Instrument";
	}

	void adjust() {
		System.out.println("Instrument adjust");
	}
}

class Winds extends Instruments {
	void play(Note n) {
		System.out.println("Wind.play()" + n);
	}

	String what() {
		return "Wind";
	}

	void adjust() {
		System.out.println("Wind adjust");
	}
}

class Percussion extends Instruments {
	void play(Note n) {
		System.out.println("Percussion.play()" + n);
	}

	String what() {
		return "Percussion";
	}

	void adjust() {
		System.out.println("Percussion adjust");
	}
}

class Stringeds extends Instruments {
	void play(Note n) {
		System.out.println("Stringeds.play()" + n);
	}

	String what() {
		return "Stringeds";
	}

	void adjust() {
		System.out.println("Stringeds adjust");
	}
}

class Brass extends Winds {
	void play(Note n) {
		System.out.println("Brass.play()" + n);
	}

	String what() {
		return "Brass";
	}

	void adjust() {
		System.out.println("Brass adjust");
	}
}

class Woodwind extends Winds {
	void play(Note n) {
		System.out.println("Woodwind.play()" + n);
	}

	String what() {
		return "Woodwind";
	}

	void adjust() {
		System.out.println("Woodwind adjust");
	}
}

public class Music3 {
	public static void tunes(Instruments i) {
		i.play(Note.C_SHARP);
		
	}
	public static void tuneall(Instruments[] e){
		for(Instruments s:e)
			tunes(s);
	}
	public static void main(String [] args){
		Instruments[] ss={
				new Winds(),
				new Percussion(),
				new Brass(),
				new Woodwind()
		};
		tuneall(ss);
		System.out.println(Arrays.toString(ss));
		
	}
}
