package unit18;

import java.io.File;
import java.io.IOException;

public class filenew {

	public static void main(String[] args) throws IOException {
		// TODO �����������ꂽ���\�b�h�E�X�^�u
		File nf =new File("C:\\3.exe");
		if(nf.exists()){
			System.out.println("1");
		}else{
			nf.createNewFile();
		}
	}

}
