package unit18;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.spi.*;
import java.util.concurrent.TimeUnit;

public class FileLock {

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO �����������ꂽ���\�b�h�E�X�^�u
		try {
			FileOutputStream fos= new FileOutputStream("C:\\3.txt");
			java.nio.channels.FileLock fl=fos.getChannel().tryLock();
			if(fl!=null){
				System.out.println("lock");
				TimeUnit.MICROSECONDS.sleep(5000);
				fl.release();
				System.out.println("release");
				fos.close();
			}
		} catch (FileNotFoundException e) {
			// TODO �����������ꂽ catch �u���b�N
			e.printStackTrace();
		}
	}

}
