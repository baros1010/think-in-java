package unit17;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.Map;

public class SpringDetecter {
	public static <T extends GroundGhod> void test(Class<T> type) throws NoSuchMethodException, SecurityException,
			InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		Constructor<T> ghod = type.getConstructor(int.class);
		Map<GroundGhod, Prediction> map = new HashMap<GroundGhod, Prediction>();
		for (int i = 0; i < 10; i++) 
			map.put(ghod.newInstance(i), new Prediction());
			System.out.println("map=" + map);
		
		GroundGhod gd=ghod.newInstance(3);
		System.out.println("look up"+gd);
		if(map.containsKey(gd))
			System.out.println(map.get(gd));
		else
			System.out.println("key not found");
	}

	public static void main(String[] args) throws NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		// TODO 自動生成されたメソッド・スタブ
		test(GroundGhod.class);

	}

}
