package unit10;

public class parcel11 {
	private static class ParcelContents implements Contents{
		private int i=11;
		@Override
		public int value() {
			// TODO 自動生成されたメソッド・スタブ
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
			// TODO 自動生成されたメソッド・スタブ
			return label;
		}
		public static void f(){};
		static int x=10;
		}
	public static Destnation destnation(String s){
		return new ParcelDestination(s);
	}
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Destnation d=destnation("haha");
	}

	

}
