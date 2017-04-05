package unit5;

public class OtiionalTralingArgument {
static void f(int i, String...request){
	System.out.println("request:"+request);
	for(String s:request){
		System.out.println(s);
	}
	
}
public static void main(String[] args){
	
	f(1,"1");
	f(2,"1","2","3");
}
}
