package unit2;

public class ShowProperties {
	public static void main(String args[]) {
		System.getProperties().list(System.out);//获取所有属性
		System.out.println(System.getProperty("user.name"));
		System.out.println(System.getProperty("java.library.path"));
	}
}
