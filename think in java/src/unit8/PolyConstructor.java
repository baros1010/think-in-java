package unit8;
class Glyph{
	void draw(){
		System.out.println("draw");
	}
	Glyph(){
		System.out.println("11");
		draw();
		System.out.println("after draw");
	}
}
class RoundGlyph extends Glyph{
	private int radius=1;
	RoundGlyph(int i){
		radius=i;
		System.out.println("RoundGlyph.RoundGlyph()"+radius);
	}
	void draw(){
		System.out.println("draw"+radius);
	}
	
}
public class PolyConstructor {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
new RoundGlyph(5);
	}

}
