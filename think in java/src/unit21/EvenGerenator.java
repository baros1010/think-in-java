package unit21;

public class EvenGerenator extends IntGenerator{
private int current=0; 
	public static void main(String[] args) {
		// TODO �����������ꂽ���\�b�h�E�X�^�u
		EvenCheck.test(new EvenGerenator());
	}

	@Override
	public int next() {
		// TODO �����������ꂽ���\�b�h�E�X�^�u
		++current;
		++current;
		return current;
	}

}
