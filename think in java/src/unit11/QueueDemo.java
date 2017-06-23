package unit11;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

public class QueueDemo {
public static void printQ(Queue queue){
	while(queue.peek()!=null){
		System.out.print(queue.remove()+" ");
		System.out.println();
	}
}
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
			Queue<Integer> queue=new LinkedList<Integer>();
			Random rand=new Random(47);
			for(int i = 0;i<10;i++)
			queue.offer(rand.nextInt(i+1));
			System.out.println(queue);
			Queue<Character> qc=new LinkedList<Character>();
			for(char c: "I am your Father".toCharArray())
				qc.offer(c);
			System.out.print(qc);
			printQ(qc);
			
	}

}
