package unit15;
class sub extends BasicHolder<sub>{}

public class CRGWithBasicHolder {

	public static void main(String[] args) {
		// TODO �����������ꂽ���\�b�h�E�X�^�u
		sub s=new sub(),
		s2=new sub();
		s.set(s2);
		sub s3=s.get();
		s .f();
	}

}
