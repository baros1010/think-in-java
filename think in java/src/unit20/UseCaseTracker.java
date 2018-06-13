package unit20;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class UseCaseTracker {
	public static void trackUserCase(List<Integer> userCases, Class<?> cl) {
		for (Method method : cl.getDeclaredMethods()) {
			UserCase uc = method.getAnnotation(UserCase.class);
			if (uc != null) {
				System.out.println(uc.id() + "  " + uc.decription());
				userCases.remove(new Integer(uc.id()));
			}
			for (int i : userCases)
				System.out.println("missing the use case_:" + i);
		}
	}

	public static void main(String[] args) {
List<Integer>useCases=new ArrayList<Integer>();
Collections.addAll(useCases, 41,42,47,4);
trackUserCase(useCases,PasswordUtil.class);
	}
}
