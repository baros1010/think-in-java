package unit12;

public class WithFinally {
	static Switch sw=new Switch();
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		try{
			sw.on();
			OnOffSwitch.f();
		}catch(OnOffException1 e){
			System.out.println("OnOffException1");
		}catch(OnOffException2 e){
			System.out.println("OnOffException1");
		}finally{
			sw.off();
		}
	}

}
