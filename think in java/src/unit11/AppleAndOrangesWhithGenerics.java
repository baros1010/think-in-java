package unit11;

import java.util.ArrayList;

public class AppleAndOrangesWhithGenerics {
	public static void main(String[] args) {
		ArrayList<Apple> apples = new ArrayList<Apple>();
		for(int i=0;i<3;i++){
			apples.add(new Apple());
			for(int j=0;j<apples.size();j++)
				System.out.println(apples.get(j).id());
				for(Apple A:apples){
					System.out.println(A.id());
				}
			}
		
	}
}
