package unit10;

public abstract class Event {
private long eventTime;
protected final long delayTime;
public Event(long delayTime){
	this.delayTime=delayTime;
	start();
}
public  void start() {
	// TODO 自動生成されたメソッド・スタブ
	eventTime=System.nanoTime()+delayTime;//nanoTime()的作用：计时
}
public boolean ready(){
	return System.nanoTime()>=eventTime;
}
public abstract void action();
}
