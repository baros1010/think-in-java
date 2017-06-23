package unit21;

public class interrupt implements Runnable{

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Thread td=new Thread(new interrupt());
		td.start();
	
		
		
	}

	@Override
	public void run() {
		// TODO 自動生成されたメソッド・スタブ
		for(int i=0;i<100;i++){
			System.out.println("id="+i);
			if(i==5){
				Thread.interrupted();
//				System.out.println("****************************");
//				System.out.println("Interrupted Thread!");
//				System.out.println("****************************");
//				try {
//					Thread.sleep(2000);
//					System.out.println("****************************");
//					System.out.println("sleep Thread!");
//					System.out.println("****************************");
//				} catch (InterruptedException e) {
//					// TODO 自動生成された catch ブロック
//					e.printStackTrace();
//				}
				}
				
				
			try {
				Thread.sleep(1000);
				
			} catch (InterruptedException e) {
				// TODO 自動生成された catch ブロック
				System.out.println("interrupt");
			}
		}
			
	}

}
