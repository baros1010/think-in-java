package unit15;

public class BasicGenerator<T> implements Generator<T>{
	private Class<T> type;
	private BasicGenerator(Class<T> type){this.type=type;}
	@Override
	public T next() {
		// TODO �����������ꂽ���\�b�h�E�X�^�u
		try {
			return type.newInstance();
		} catch (InstantiationException | IllegalAccessException e) {
			// TODO �����������ꂽ catch �u���b�N
			throw new RuntimeException(e);
		}
	
	}
	public static <T> Generator<T> creates(Class<T> type){
		 return new BasicGenerator<T>(type);
	}

}
 