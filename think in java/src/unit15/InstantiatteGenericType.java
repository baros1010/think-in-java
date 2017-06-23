package unit15;
class ClassAsFactory<T>{
	T x;
	public ClassAsFactory(Class<T> kind){
		try{
			x=kind.newInstance();
		}catch(Exception e){
			throw new RuntimeException(e);
		}
	}
	
}
class Employee{}
public class InstantiatteGenericType {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		ClassAsFactory<Employee> ee=new ClassAsFactory<Employee>(Employee.class);
		try{
			ClassAsFactory<Integer> ee1=new ClassAsFactory<Integer>(Integer.class);
		}catch(Exception e){
			System.out.println("faild");
		}
	}

}
