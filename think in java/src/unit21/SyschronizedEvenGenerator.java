package unit21;

public class SyschronizedEvenGenerator extends IntGenerator{
public int count;

	public static void main(String[] args) {
		// TODO �����������ꂽ���\�b�h�E�X�^�u
		EvenCheck.test(new SyschronizedEvenGenerator());
	}

	@Override
	public synchronized int next() {
		   ++count;
		   ++count;
		// TODO �����������ꂽ���\�b�h�E�X�^�u
		return count;
	}

}
