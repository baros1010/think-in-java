package unit11;

public class StackTest {

	public static void main(String[] args) {
		// TODO �����������ꂽ���\�b�h�E�X�^�u
		Stack<String> stack=new Stack<String>();
		for(String s:"I am your father".split(" "))
		stack.push(s);//�؞�
		while(!stack.empty())
			System.out.print(stack.pop()+" ");//�o��
	}

}
