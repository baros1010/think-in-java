package unit15;

public class SimpleHold {
	private Object obj;
	public void set(Object obj){this.obj=obj;}
	public Object get(){return obj;}
	public static void main(String[] args) {
		// TODO �����������ꂽ���\�b�h�E�X�^�u
		SimpleHold h=new SimpleHold();
		h.set("ba");
		String s=(String)h.get();
		
	}

}
