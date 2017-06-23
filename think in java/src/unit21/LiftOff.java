package unit21;

public class LiftOff implements Runnable{

	protected int count=10;
	private static  int taskCount=0;
	private int id=taskCount++;
	public LiftOff(){}
	public LiftOff(int count){
		this.count=count;
	}
	public String status(){
		return "#"+id+"("+(count>0? count:"lift")+"),";
	} 
	@Override
	public void run() {
		// TODO �����������ꂽ���\�b�h�E�X�^�u
		while(count-->0){
			System.out.print(status());
			Thread.yield();
		}
	}

}
