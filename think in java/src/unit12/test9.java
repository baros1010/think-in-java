package unit12;

public class test9 {
public static void main(String[] args){
	try{
		throw new Exception("xixi");
	}catch(Exception e){
		System.out.println(e.getMessage());
		System.out.println(e);
		e.printStackTrace(System.out);
	}
}
}
