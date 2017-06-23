package unit12;
class VeryImportant extends Exception{
	public String toString(){
		return "haha";
	}
}
class HoHmException extends Exception{
	public String toString(){
		return "nono";
	}
	
}
class noException extends Exception{
	public String toString(){
		return "xixi";
	}
	
}
public class LostMessage {
	void f()throws VeryImportant{
		throw new VeryImportant();
	}
	void g() throws HoHmException{
		throw new HoHmException();
	}
	void h() throws noException{
		throw new noException();
	}
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		try{
			LostMessage lm=new LostMessage();
			try{
				//lm.f();
				try{
					lm.f();
					lm.g();
				}finally{
					lm.h();
				}
			}catch(Exception e){
				System.out.println(e);
			}
		}catch(Exception e){
			System.out.println(e);
		}
	}

}
