package unit10;

public interface classInterface {
	void howdy();

	class Test implements classInterface {

		@Override
		public void howdy() {
			// TODO 自動生成されたメソッド・スタブ
			System.out.println("haha");
		}

		public static void main(String[] args) {
			new Test().howdy();
		}
	}
}
