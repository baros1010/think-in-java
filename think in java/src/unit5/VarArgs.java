package unit5;
class A{}
public class VarArgs {
	static void printArray(Object[] args){
		for(Object obj:args){
			
			System.out.print(obj+"");
			System.out.println();
		}
	}
	public static void main(String[] args) {
		// TODO �����������ꂽ���\�b�h�E�X�^�u
		printArray(new Object[]{new Integer(1),new Float(1.1),new Double(1.1)});

}
}