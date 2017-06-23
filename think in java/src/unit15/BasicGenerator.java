package unit15;

public class BasicGenerator<T> implements Generator<T>{
	private Class<T> type;
	private BasicGenerator(Class<T> type){this.type=type;}
	@Override
	public T next() {
		// TODO 自動生成されたメソッド・スタブ
		try {
			return type.newInstance();
		} catch (InstantiationException | IllegalAccessException e) {
			// TODO 自動生成された catch ブロック
			throw new RuntimeException(e);
		}
	
	}
	public static <T> Generator<T> creates(Class<T> type){
		 return new BasicGenerator<T>(type);
	}

}
 