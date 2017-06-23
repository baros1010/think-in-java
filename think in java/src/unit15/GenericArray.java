package unit15;

public class GenericArray<T> {
	@SuppressWarnings("unused")
	private T[] array;
	
@SuppressWarnings("unchecked")
public GenericArray(int sz){
	array=(T[])new Object();
	
	
}
public void put(int index,T item){
	array[index]=item;
}
public T get(int index){
	return array[index];
}
public T[] rep(){return array;} 

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		GenericArray<Integer> gei=new GenericArray<Integer>(11);
		//!Integer[] a=gei.rep();
		Object[] oa=gei.rep();
	}

}
