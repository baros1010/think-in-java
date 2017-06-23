package unit21;

public class EvenGerenator extends IntGenerator{
private int current=0; 
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		EvenCheck.test(new EvenGerenator());
	}

	@Override
	public int next() {
		// TODO 自動生成されたメソッド・スタブ
		++current;
		++current;
		return current;
	}

}
