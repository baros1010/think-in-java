package unit21;

public class MoreThread {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		for(int i=0;i<10;i++){
			Thread td=new Thread(new LiftOff());
			td.start();
			
		}
		
	}

}
