package unit15;

public class LinkedStack <T>{
	private static class Node<D>{
		D item; 
		Node<D> next;
		Node(){item=null;next=null;}
		Node(D item,Node<D>next){this.item=item;this.next=next;}
		boolean end(){return item==null&&next==null;}
	}
	private Node<T> top=new Node<T>();
	public void push(T item){
		top=new Node<T>(item,top);
		
	}
	public T pop(){
		T result=top.item;
		if(!top.end())
			top=top.next;
			return result;
	}
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
LinkedStack<String> lss=new LinkedStack<String>();
for(String s:"I am your father".split(" "))
	lss.push(s);
String s;
while((s=lss.pop())!=null){
	System.out.println(s);
	
}
	}

}
