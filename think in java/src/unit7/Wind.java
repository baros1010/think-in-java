package unit7;
class Instrument{
	public void play(){
		System.out.println("hahaha");
	}
	static void tune(Instrument i){
		i.play();
	}
}
public class Wind extends Instrument{

	public static void main(String[] args) {
		// TODO �����������ꂽ���\�b�h�E�X�^�u
		Wind w=new Wind();
		Instrument.tune(w);
	}

}
