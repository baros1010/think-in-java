package unit13;

public class Rudoph {
	
	public static void main(String[] args) {
		// TODO �����������ꂽ���\�b�h�E�X�^�u
		for(String pattern:new String[]{"Rudoph","[Rr]Rudoph","[Rr] [aeiou] [a-z]ol.*","R.*"})
		System.out.println("Rudoph".matches(pattern));
	}

}
