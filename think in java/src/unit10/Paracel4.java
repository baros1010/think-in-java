package unit10;

public class Paracel4 {
	private class PContents implements Contents {
		private int i = 11;

		@Override
		public int value() {

			// TODO 自動生成されたメソッド・スタブ
			return i;
		}
	}

	protected class PDestnation implements Destnation {
		private String label;

		private PDestnation(String whereTo) {
			label = whereTo;
		}

		@Override
		public String readLabel() {
			// TODO 自動生成されたメソッド・スタブ
			return label;
		}
	}
	public Destnation destnation(String s){
		return new PDestnation(s);
	}
	public Contents contents(){
		return new PContents();
	}
}
