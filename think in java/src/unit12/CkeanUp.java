package unit12;

public class CkeanUp {

	public static void main(String[] args) {
		// TODO �����������ꂽ���\�b�h�E�X�^�u
		try {
			InputFile in = new InputFile("AlwaysFinally.java");
			try {
				String s;
				int i = 1;
				while ((s = in.getLine()) != null)
					;

			} catch (Exception e) {
				System.out.println("caught");
				e.printStackTrace(System.out);
			} finally {
				in.dispose();
			}
		} catch (Exception e) {
			System.out.println("//");
		}
	}

}
