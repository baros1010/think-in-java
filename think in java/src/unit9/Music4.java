package unit9;

abstract class Instrument {
	private int i;

	public abstract void play(Note n);

	public String what() {
		return "Instrument";
	}

	public abstract void adjust();
}

class Wind extends Instrument {

	@Override
	public void play(Note n) {
		System.out.println("Wind.play()" + n);
		// TODO 自動生成されたメソッド・スタブ

	}

	public String what() {
		return "Wind";
	}

	@Override
	public void adjust() {

		// TODO 自動生成されたメソッド・スタブ

	}
}
class Percussion extends Instrument{

	@Override
	public void play(Note n) {
		// TODO 自動生成されたメソッド・スタブ
		System.out.println("Percussion.play()" + n);
	}
	public String what() {
		return "Percussion";
	}
	@Override
	public void adjust() {
		// TODO 自動生成されたメソッド・スタブ
		
	}
	
}
class Brass extends Wind{
	public void play(Note n) {
		// TODO 自動生成されたメソッド・スタブ
		System.out.println("Brass.play()" + n);
	}
	public String what() {
		return "Brass";
	}
	public void adjust() {
		// TODO 自動生成されたメソッド・スタブ
		
	}
}
class Woodwind extends Wind{
	public void play(Note n) {
		// TODO 自動生成されたメソッド・スタブ
		System.out.println("Woodwind.play()" + n);
	}
	public String what() {
		return "Woodwind";
	}
	public void adjust() {
		// TODO 自動生成されたメソッド・スタブ
		
	}
}
public class Music4 {
	static void tune(Instrument i){
		i.play(Note.C_SHARP);
	}
	static void tuneAll(Instrument[] e){
		for(Instrument i:e)
			tune(i);
	}
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Instrument[] orchestra={
				 new Wind(),
				 new Percussion(),
				 new Brass(),
				 new Woodwind(),
				 
		};
		tuneAll(orchestra);
	}

}
