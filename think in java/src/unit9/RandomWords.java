package unit9;

import java.nio.CharBuffer;
import java.util.Random;
import java.util.Scanner;

public class RandomWords implements Readable{
private static Random rand =new Random(47);
private static final char[] cap="ABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();
private static final char[] LOW="abcdefghijklmnopqrstuvwxyz".toCharArray();
private static final char[] vowels="aeiou".toCharArray();
private int count;
public RandomWords(int count){this.count=count;}
	@Override
	public int read(CharBuffer cb)  {
		// TODO 自動生成されたメソッド・スタブ
		
		if (count--==0)
			return -1;
			cb.append(cap[rand.nextInt(cap.length)]);
			for(int i=0;i<4;i++){
				cb.append(LOW[rand.nextInt(LOW.length)]);
				cb.append(vowels[rand.nextInt(vowels.length)]);
			}
		cb.append(" ");
		return 10;
	}
public static void main(String args[]){
	Scanner s=new Scanner(new RandomWords(10));
	while(s.hasNext())
		System.out.println(s.next());
	
}
}
