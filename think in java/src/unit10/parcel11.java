package unit10;

public class parcel11 {
	private static class ParcelContents implements Contents{
		private int i=11;
		@Override
		public int value() {
			// TODO �����������ꂽ���\�b�h�E�X�^�u
			return i;
		}
	
	
	}
	protected static class ParcelDestination implements Destnation{
		private String label;
		private ParcelDestination(String whereTo){
			label=whereTo;
		}
		@Override
		public String readLabel() {
			// TODO �����������ꂽ���\�b�h�E�X�^�u
			return label;
		}
		public static void f(){};
		static int x=10;
		}
	public static Destnation destnation(String s){
		return new ParcelDestination(s);
	}
	public static void main(String[] args) {
		// TODO �����������ꂽ���\�b�h�E�X�^�u
		Destnation d=destnation("haha");
	}

	

}
