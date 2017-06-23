package unit15;

public class GenericArray2<T> {
	private Object[] array;

	public  GenericArray2(int sz) {
		array = new Object[sz];
	}
	public void put(int index,T item){
		array[index]=item;
	}
	public T get(int index) {
		return (T) array[index];
	}

	public T[] rep() {
		return (T[]) array;
	}

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		GenericArray2<Integer> gei=new GenericArray2<Integer>(10);
		for(int i=0;i<10;i++)
			gei.put(i, i);
		for(int i=0;i<10;i++)
			System.out.println(gei.get(i));
		
	}

}
