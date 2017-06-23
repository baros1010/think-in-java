package unit9;

import java.io.IOException;
import java.nio.CharBuffer;
import java.util.Scanner;

public class AdapterRandomDoubles extends RandomDoubles implements Readable {
	private int count;
	public AdapterRandomDoubles(int count){this.count=count;}
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
Scanner s=new Scanner(new AdapterRandomDoubles(7));
	while(s.hasNextDouble())
		System.out.println(s.nextDouble());
	}

	@Override
	public int read(CharBuffer cb) {
		// TODO 自動生成されたメソッド・スタブ
	if(count--==0)
		return -1;
		String result=Double.toString(next())+"";
	cb.append(result);
	return result.length();
	}


}
