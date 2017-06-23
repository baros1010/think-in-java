package unit16;

import unit15.Generator;

public class GeneratorTest {
	public static int size=10;
	public static void test(Class<?> surroundingClass){
		for(Class<?> type: surroundingClass.getClasses()){
			System.out.println(type.getSimpleName()+": ");
			try{
				Generator<?> g=(Generator<?>)type.newInstance();
				for(int i=0;i<size;i++)
					System.out.println(g.next());
			}catch(Exception e){
				throw new RuntimeException(e);
			}
		}
	}
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		test(CountingGenerator.class);
	}

}
