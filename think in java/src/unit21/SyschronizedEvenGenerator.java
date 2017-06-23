package unit21;

public class SyschronizedEvenGenerator extends IntGenerator{
public int count;

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		EvenCheck.test(new SyschronizedEvenGenerator());
	}

	@Override
	public synchronized int next() {
		   ++count;
		   ++count;
		// TODO 自動生成されたメソッド・スタブ
		return count;
	}

}
