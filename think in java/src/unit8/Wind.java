package unit8;
class Instrument{
	public void play(Note n){
		System.out.println("Instrument.play()");
		
	}
	
}
public class Wind extends Instrument{
	public void play(Note n){
		
		System.out.println("Wind.play()"+n);
	}

}
