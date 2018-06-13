package IOREVIEW;

import java.lang.reflect.Field;

public class tests {
	
	public static void main(String[] args) {
		Class cl=RersonRequest.class;
		Field[] fields=cl.getDeclaredFields();
		for(Field field:fields){
			System.out.println(field.getName());
		}
	}
}
