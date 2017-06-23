package unit14;

import java.util.ArrayList;
import java.util.List;

class CountedInteger{
	  private int count;
	private final long id=count++;
	public String toString(){return Long.toString(id);}	
}
public class FilledList<T> {
private Class<T> type;
public FilledList(Class<T>type){this.type=type;}
public List<T> create(int nElements){
	List<T> result=new ArrayList<T>();
	try{
		for(int i=0;i<nElements;i++)
			result.add(type.newInstance());
		
	}catch(Exception e){
		throw new RuntimeException(e);
	}
	return result;
}
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		FilledList<CountedInteger> fl=new FilledList<CountedInteger>(CountedInteger.class);
		System.out.println(fl.create(15));
	}

}
