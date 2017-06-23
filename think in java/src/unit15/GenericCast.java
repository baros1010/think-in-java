package unit15;
class FixSize<T>{
	private int index;
	private Object[] storage;
	public FixSize(int size){
		storage=new Object[size];
	}
	public void push(T item){storage[index++]=item;}
	@SuppressWarnings("unchecked")
	public T pop(){
		return (T)storage[--index];
	}
}
public class GenericCast {
public static final int SIZE=4;
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		FixSize<String> s=new FixSize<String>(SIZE);
		for(String ss:"I am Your father".split(" "))
			s.push(ss);
		for(int i=0;i<SIZE;i++){
			String sss=s.pop();
			System.out.println(sss);
		}
			
		
	}
	

}
