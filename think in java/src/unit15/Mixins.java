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
		// TODO �����������ꂽ���\�b�h�E�X�^�u
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
		// TODO �����������ꂽ���\�b�h�E�X�^�u
		return serialnumber;
	}
}

class BasicImp implements Basic {
	String value;

	@Override
	public void set(String val) {
		// TODO �����������ꂽ���\�b�h�E�X�^�u
		value = val;
	}

	@Override
	public String get() {
		// TODO �����������ꂽ���\�b�h�E�X�^�u
		return value;
	}

}

class Mixin extends BasicImp implements  SerialNumbered,TimeStamped{
private TimeStampedimp t=new TimeStampedimp();
private SerNumberedImp s=new SerNumberedImp();
	@Override
	public long getStamp() {
		// TODO �����������ꂽ���\�b�h�E�X�^�u
		return t.getStamp();
	}

	@Override
	public long getSerialNumber() {
		// TODO �����������ꂽ���\�b�h�E�X�^�u
		return s.getSerialNumber();
	}

}

public class Mixins {

	public static void main(String[] args) {
		// TODO �����������ꂽ���\�b�h�E�X�^�u
		Mixin m1=new Mixin(),m2=new Mixin();
		m1.set("mama");
		m2.set("mimi");
		System.out.println(m1.get()+" "+m1.getStamp()+" "+m1.getSerialNumber());
		System.out.println(m2.get()+" "+m2.getStamp()+" "+m2.getSerialNumber());
		    
	}

}
