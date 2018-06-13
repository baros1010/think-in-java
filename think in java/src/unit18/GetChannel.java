package unit18;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class GetChannel {
private static final int BSIZE=1024;
	public static void main(String[] args) throws IOException {
		// TODO �����������ꂽ���\�b�h�E�X�^�u
		FileChannel fc=new FileOutputStream("C:\\practice\\think in java\\src\\3.txt").getChannel();
		fc.write(ByteBuffer.wrap("I am your father ".getBytes()));
		fc.close();
		fc=new FileInputStream("C:\\practice\\think in java\\src\\3.txt").getChannel();
		ByteBuffer buff= ByteBuffer.allocate(BSIZE);
		fc.read(buff);
		//fc.close();	
		buff.flip();//反转缓冲区。首先将限制设置为当前位置，然后将位置设置为 0。如果已定义了标记，则丢弃该标记。 常与compact方法一起使用。通常情况下，在准备从缓冲区中读取数据时调用flip方法。 
		while(buff.hasRemaining())
			System.out.print((char)buff.get());
	}

}
