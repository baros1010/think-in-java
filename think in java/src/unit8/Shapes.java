package unit8;

public class Shapes {
private static RandomShapeGenrator  gen=new RandomShapeGenrator();
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Shape[] s=new Shape[9];
		for(int i=0;i<s.length;i++){
			s[i]=gen.next();
		}
		for(Shape sh:s){
			sh.draw();
		}
		Circle sp=new Circle();
		sp.abc();
	}

}
