package unit5;

public class VarargType {
static void f(Character...args){
	System.out.print(args.getClass());
	System.out.println(args.length);
}
static void g(int...args){
	System.out.print(args.getClass());
	System.out.println(args.length);
}
	public static void main(String[] args) {
		// TODO �����������ꂽ���\�b�h�E�X�^�u
f('1');
g(1,2);
	}

}
