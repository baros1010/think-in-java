package unit11;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Random;
import java.util.Set;

public class PriorityQueueDemo {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		PriorityQueue<Integer> priorityqueue=new PriorityQueue<Integer>();
		Random rand=new Random(47);
		for(int i=0;i<10;i++)
			priorityqueue.offer(rand.nextInt(i+1));
		QueueDemo.printQ(priorityqueue);
		List<Integer> ints=Arrays.asList(25,22,20,18,14,9,3,1,1,2,3,9,14,18,21,23,25);
		priorityqueue=new PriorityQueue<Integer>(ints);
		//priorityqueue.addAll(priorityqueue);
		QueueDemo.printQ(priorityqueue);
		String fact="I am your father haha";
		List<String> Strings=Arrays.asList(fact.split(""));
		PriorityQueue<String> StringPQ=new PriorityQueue<String>(Strings);
		StringPQ.addAll(Strings);
		QueueDemo.printQ(StringPQ);
		Set<Character> charSet=new HashSet<Character>();
		for(char c:fact.toCharArray())
			charSet.add(c);
		PriorityQueue<Character> sq=new PriorityQueue<Character> (charSet);
		QueueDemo.printQ(sq);
	}

}
