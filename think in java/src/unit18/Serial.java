package unit18;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Serial  implements Serializable{
	private String a;
	private transient String b;

	public Serial(String a, String b) {
		this.a = "No Transient" + a;
		this.b = "Transient" + b;
	}

	public String toString() {
		return a + "\n" + b;
	}
	private void writeObject(ObjectOutputStream stream) throws IOException{
		stream.defaultWriteObject();
		stream.writeObject(b);
	}
	private void readObject(ObjectInputStream stream) throws ClassNotFoundException, IOException{
		stream.defaultReadObject();
		b=(String) stream.readObject();
	}

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		// TODO 自動生成されたメソッド・スタブ
		Serial s=new Serial("test1","test2");
		System.out.println("before"+s);
		ByteArrayOutputStream buf=new ByteArrayOutputStream();
		
			ObjectOutputStream out=new ObjectOutputStream(buf);
			out.writeObject(s);
			
		
		ObjectInputStream in =new ObjectInputStream(new ByteArrayInputStream(buf.toByteArray()));
		Serial s2=(Serial)in.readObject();
		System.out.println("before"+s2);
	}

}
