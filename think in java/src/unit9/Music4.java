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
		// TODO �����������ꂽ���\�b�h�E�X�^�u

	}

	public String what() {
		return "Wind";
	}

	@Override
	public void adjust() {

		// TODO �����������ꂽ���\�b�h�E�X�^�u

	}
}
class Percussion extends Instrument{

	@Override
	public void play(Note n) {
		// TODO �����������ꂽ���\�b�h�E�X�^�u
		System.out.println("Percussion.play()" + n);
	}
	public String what() {
		return "Percussion";
	}
	@Override
	public void adjust() {
		// TODO �����������ꂽ���\�b�h�E�X�^�u
		
	}
	
}
class Brass extends Wind{
	public void play(Note n) {
		// TODO �����������ꂽ���\�b�h�E�X�^�u
		System.out.println("Brass.play()" + n);
	}
	public String what() {
		return "Brass";
	}
	public void adjust() {
		// TODO �����������ꂽ���\�b�h�E�X�^�u
		
	}
}
class Woodwind extends Wind{
	public void play(Note n) {
		// TODO �����������ꂽ���\�b�h�E�X�^�u
		System.out.println("Woodwind.play()" + n);
	}
	public String what() {
		return "Woodwind";
	}
	public void adjust() {
		// TODO �����������ꂽ���\�b�h�E�X�^�u
		
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
		// TODO �����������ꂽ���\�b�h�E�X�^�u
		Instrument[] orchestra={
				 new Wind(),
				 new Percussion(),
				 new Brass(),
				 new Woodwind(),
				 
		};
		tuneAll(orchestra);
	}

}
