package unit15;

public class Manipulator <T extends HasF>{
	private T obj;
	public void Manipulator(T x){obj=x;}
	//private void manipulate(){}{obj.f();} without extends cant comp
	private void manipulate(){}{obj.f();}
	

}
