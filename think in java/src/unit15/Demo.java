package unit15;

public class Demo {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Generator<CountedObjiect> gen= BasicGenerator.creates(CountedObjiect.class);
		for(int i=0;i<5;i++){
			System.out.println(gen.next());
		}
	}

}
