package unit11;

import java.util.ArrayList;

class Apple{
	private static long counter;
	private final long id=counter++;
	public long id(){return id;}
}
class Orange{}
public class AppleAndOrangesWhithoutGenerics {

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		ArrayList apples =new ArrayList();
		for(int i=0;i<3;i++){
			apples.add(new Apple());
			apples.add(new Orange());
			for(int j=0;j<apples.size();i++)
				((Apple)apples.get(j)).id();
		}
	}

}
