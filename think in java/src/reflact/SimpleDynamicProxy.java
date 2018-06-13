package reflact;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

class DynamicProxyHanler implements InvocationHandler {
private Object proxied;
public DynamicProxyHanler(Object proxied){
	this.proxied=proxied;
}
	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		System.out.println("proxy:"+proxy.getClass()+"method:"+method+"args:"+args);
		if(args!=null)
			for(Object obj:args)
				System.out.println(" "+obj);
	
		return method.invoke(proxied, args);
	}
}

public class SimpleDynamicProxy {
public static void consummer(Interface inter){
	inter.doSthing();
	inter.somethingElse("lalala");
	
}
	public static void main(String[] args) {
	RealObject real=new RealObject();
	consummer(real);
	Interface proxy =(Interface) Proxy.newProxyInstance(Interface.class.getClassLoader(), new Class[]{Interface.class},new DynamicProxyHanler(real));
	consummer(proxy);
	

	}

}
