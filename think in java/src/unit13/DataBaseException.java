package unit13;

public class DataBaseException extends Exception {
	public DataBaseException(int transactionID,int queryID,String message){
		super(String.format("(t%d,q%d) %s", transactionID,queryID,message));
	}
	
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		try{
			throw new DataBaseException(3,7,"HAHA");
		}catch(Exception e){
			System.out.println(e);
		}
	}

}
