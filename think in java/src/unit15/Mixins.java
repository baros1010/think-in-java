package unit15;

import java.util.Date;

interface TimeStamped {
	long getStamp();
}

class TimeStampedimp implements TimeStamped {
	private final long timeStamp;

	public TimeStampedimp() {
		timeStamp = new Date().getTime();
	}

	@Override
	public long getStamp() {
		// TODO 自動生成されたメソッド・スタブ
		return timeStamp;
	}
}

interface Basic {
	public void set(String val);

	public String get();
}

interface SerialNumbered {
	long getSerialNumber();
}

class SerNumberedImp implements SerialNumbered {
	private static long counter = 1;
	private final long serialnumber = counter++;

	@Override
	public long getSerialNumber() {
		// TODO 自動生成されたメソッド・スタブ
		return serialnumber;
	}
}

class BasicImp implements Basic {
	String value;

	@Override
	public void set(String val) {
		// TODO 自動生成されたメソッド・スタブ
		value = val;
	}

	@Override
	public String get() {
		// TODO 自動生成されたメソッド・スタブ
		return value;
	}

}

class Mixin extends BasicImp implements  SerialNumbered,TimeStamped{
private TimeStampedimp t=new TimeStampedimp();
private SerNumberedImp s=new SerNumberedImp();
	@Override
	public long getStamp() {
		// TODO 自動生成されたメソッド・スタブ
		return t.getStamp();
	}

	@Override
	public long getSerialNumber() {
		// TODO 自動生成されたメソッド・スタブ
		return s.getSerialNumber();
	}

}

public class Mixins {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Mixin m1=new Mixin(),m2=new Mixin();
		m1.set("mama");
		m2.set("mimi");
		System.out.println(m1.get()+" "+m1.getStamp()+" "+m1.getSerialNumber());
		System.out.println(m2.get()+" "+m2.getStamp()+" "+m2.getSerialNumber());
		    
	}

}
