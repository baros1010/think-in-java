package reflact;

import java.lang.reflect.Method;

public class InvokeTester {
	public String getNames(String s){
		return s;
	}
	public static void main(String[] args) throws Exception {
	Class <?> classType=InvokeTester.class;
    Object invokeTester = classType.newInstance();
    System.out.println(invokeTester instanceof InvokeTester);
    Method m=classType.getMethod("getNames", new Class[]{String.class});
    Object s1=m.invoke(invokeTester, new Object[]{"Tom"});
    System.out.println(s1);
	}
}
