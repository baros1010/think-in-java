package unit8;

public class Music {
	public static  void tune(Instrument i){
		i.play(Note.B_FLAT);
	}
	public static void main(String[] args) {
		
		Wind flute=new Wind();
		tune(flute);
	}
}
