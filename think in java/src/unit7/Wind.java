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
		// TODO 自動生成されたメソッド・スタブ
		Wind w=new Wind();
		Instrument.tune(w);
	}

}
