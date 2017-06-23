package unit18;

import java.nio.ByteBuffer;
import java.nio.IntBuffer;

public class INBufferEMO {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		ByteBuffer buff=ByteBuffer.allocate(1024);
		IntBuffer inb=buff.asIntBuffer();
		inb.put(new int[] {2,1,123,43,44,67});
		System.out.println(inb.get(3));
		inb.put(3, 11);
		inb.flip();
		while(inb.hasRemaining()){
			int i = inb.get();
			System.out.println(i);
		}
			 
		
	}

}
