package unit17;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

import unit15.Generator;

public class QueueBehavior {
private static int count=10;
static <T> void test(Queue<T> queue,Generator<T> gen){
	for(int i=0;i<count;i++)
		queue.offer(gen.next());
	while(queue.peek()!=null)
		System.out.print(queue.remove()+" ");
	System.out.println();
}
static class Gen implements Generator<String>{
	String []s="I AM YOUR FATHER your ARE MY SON HA HA".split(" ");
	int i;
	@Override
	public String next() {
		// TODO �����������ꂽ���\�b�h�E�X�^�u
		return s[i++];
	}
	
}
	public static void main(String[] args) {
		// TODO �����������ꂽ���\�b�h�E�X�^�u
		test(new LinkedList<String>(),new Gen());
		test(new PriorityQueue<String>(),new Gen());
	}

}
