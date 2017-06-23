package unit18;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;

public class Endians {
	public static void main(String[] args){
		ByteBuffer buff=ByteBuffer.wrap(new byte[12]);
		buff.asCharBuffer().put("abcdef");
		System.out.println(Arrays.toString(buff.array()));
		buff.rewind();
		buff.order(ByteOrder.BIG_ENDIAN);
		buff.asCharBuffer().put("abcdef");
		System.out.println(Arrays.toString(buff.array()));
		buff.rewind();
		buff.order(ByteOrder.LITTLE_ENDIAN);
		buff.asCharBuffer().put("abcdef");
		System.out.println(Arrays.toString(buff.array()));
		buff.rewind();
		
	}

}
