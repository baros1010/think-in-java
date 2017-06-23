package unit12;
class VeryImportants extends Exception{
	public String toString(){
		return "haha";
	}
}
class HoHmExceptions extends Exception{
	public String toString(){
		return "nono";
	}
	
}
public class test19 {
	void fs()throws VeryImportants{
		throw new VeryImportants();
	}
	void gs() throws HoHmExceptions{
		throw new HoHmExceptions();
	}
	public static void main(String[] args) throws HoHmExceptions {
		// TODO 自動生成されたメソッド・スタブ
		test19 t=new test19();
		try{
		
			
			try{
				t.fs();
			}catch(Exception e){
				System.out.println(e);
			}
		}finally{
			t.gs();
		}
	}

}
