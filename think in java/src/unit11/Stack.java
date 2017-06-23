package unit11;

import java.util.LinkedList;

public class Stack<T> {
	private LinkedList<T> Storage =new LinkedList<T>(); 
	public void push(T v){Storage.addFirst(v);}
	public T peek(){return Storage.getFirst();}
	public T pop(){return Storage.removeFirst();}
	public boolean empty(){return Storage.isEmpty();}
}
