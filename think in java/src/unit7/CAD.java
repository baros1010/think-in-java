package unit7;

class sharp {
	sharp(int i) {
		System.out.println("SHARP");
	}

	void dispose() {
		System.out.println("SHARP dispose");
	}
}

class Circle extends sharp {

	Circle(int i) {
		super(i);
		System.out.println("Circle");
		// TODO 自動生成されたコンストラクター・スタブ
	}

	void dispose() {

		System.out.println("Circle dispose");
		super.dispose();
	}

}

class Triangle extends sharp {

	Triangle(int i) {
		super(i);
		System.out.println("Triangle");
		// TODO 自動生成されたコンストラクター・スタブ
	}

	void dispose() {

		System.out.println("Triangle dispose");
		super.dispose();
	}

}
class Line extends sharp {
private int start,end;

	Line(int start,int end) {
		super(start);
		this.start=start;
		this.end=end;
		System.out.println("Line");
		// TODO 自動生成されたコンストラクター・スタブ
	}

	void dispose() {

		System.out.println("Line dispose");
		super.dispose();
	}

}
public class CAD extends sharp{
private Circle c;
private Triangle t;
private Line[] l=new Line[3];
	CAD(int i) {
		super(i+1);
		for(int j=0;j<l.length;j++){
			l[j]=new Line(j,j*j);
			
		}
		c=new Circle(1);
		t=new Triangle(1);
		System.out.println("11 ");
		
		// TODO 自動生成されたコンストラクター・スタブ
	}
	void dispose() {

		System.out.println("CAD dispose");
		t.dispose();
		c.dispose();
		for(int i=0;i<l.length;i++){
			
			l[i].dispose();
		}
		super.dispose();
	}
	public static void main(String[] args){
		CAD cd=new CAD(1);
		try{
			
		}finally{
			cd.dispose();
		}
	}
}
