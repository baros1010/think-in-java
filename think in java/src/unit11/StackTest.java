package unit11;

public class StackTest {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Stack<String> stack=new Stack<String>();
		for(String s:"I am your father".split(" "))
		stack.push(s);//壓棧
		while(!stack.empty())
			System.out.print(stack.pop()+" ");//出棧
	}

}
