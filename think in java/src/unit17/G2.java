 package unit17;

public class G2 extends GroundGhod{

	public G2(int n) {
		super(n);
		// TODO 自動生成されたコンストラクター・スタブ
	}
	public int hashCode(){return number;}
	public boolean equals(Object o){
		return o instanceof G2&&(number==((G2)o).number);	
	}
	

}
