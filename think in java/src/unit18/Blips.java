package unit18;

import java.io.Externalizable;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

class Blips1 implements Externalizable {
public  Blips1(){
	System.out.println("1");
}
	@Override
	public void writeExternal(ObjectOutput out) throws IOException {
		// TODO 自動生成されたメソッド・スタブ
		System.out.println("hello Blips1");
	}

	@Override
	public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
		// TODO 自動生成されたメソッド・スタブ
		System.out.println("hi Blips1");
	}

}

class Blips2 implements Externalizable {
	public  Blips2(){
		System.out.println("2");
	}
	@Override
	public void writeExternal(ObjectOutput out) throws IOException {
		// TODO 自動生成されたメソッド・スタブ
		System.out.println("hello Blips2");
	}

	@Override
	public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
		// TODO 自動生成されたメソッド・スタブ
		System.out.println("hi Blips2");
	}

}

public class Blips {
	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		Blips1 b1=new Blips1();
		Blips2 b2=new Blips2();
		ObjectOutputStream out=new ObjectOutputStream(new FileOutputStream("C:\\Blips.out"));
		out.writeObject(b1);
		out.writeObject(b2);
		out.close();
		ObjectInputStream in=new ObjectInputStream(new FileInputStream("C:\\Blips.out"));
		b1=(Blips1)in.readObject();
		b2=(Blips2)in.readObject();
	}
}
