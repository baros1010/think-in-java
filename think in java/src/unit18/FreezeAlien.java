package unit18;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class FreezeAlien {

	public static void main(String[] args) throws IOException {
		// TODO �����������ꂽ���\�b�h�E�X�^�u
	ObjectOutputStream out=new ObjectOutputStream(new FileOutputStream("C:\\x.file"));
	Alien a=new Alien();
	out.writeObject(a);
	}

}
