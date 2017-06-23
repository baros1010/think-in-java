package unit9;
interface Instruments{
	int VALUE=5;//static&final
	void play(Note n);
	void adjust();
}
abstract class qq{
	public String toString(){return "";};
}
class Winds extends qq implements Instruments{

	@Override
	public void play(Note n) {
		// TODO 自動生成されたメソッド・スタブ
		System.out.println(this+".play()"+n);
	}
	public String toString(){
		return "wind";
	}
	@Override
	public void adjust() {
		// TODO 自動生成されたメソッド・スタブ
		System.out.println(this+"adjust()");
	}
	
}
class Percussions extends qq implements Instruments{

	@Override
	public void play(Note n) {
		// TODO 自動生成されたメソッド・スタブ
		System.out.println(this+".play()"+n);
	}
	public String toString(){
		return "Percussion";
	}
	@Override
	public void adjust() {
		// TODO 自動生成されたメソッド・スタブ
		System.out.println(this+"adjust()");
	}
	}
class Stringeds extends qq implements Instruments{


	@Override
	public void play(Note n) {
		// TODO 自動生成されたメソッド・スタブ
		System.out.println(this+".play()"+n);
	}
	public String toString(){
		return "Stringed";
	}
	@Override
	public void adjust() {
		// TODO 自動生成されたメソッド・スタブ
		System.out.println(this+"adjust()");
	}
}
class Brasss extends Winds{
	public String toString(){
		return "Brass";
	}
}
class Woodwinds extends Winds{
	public String toString(){
		return "Woodwind";
	}
}
public class Music5 {
	static void tune(Instruments i){
		i.play(Note.C_SHARP);
	}
	static void tuneAll(Instruments[] e){
		for(Instruments i:e)
			tune(i);
	}
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Instruments[] orchestra={
				 new Winds(),
				 new Percussions(),
				 new Brasss(),
				 new Woodwinds(),
				 
		};
		tuneAll(orchestra);
	}

}

