package unit18;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Random;

class Data implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int n;

	public Data(int n) {
		this.n = n;
	}

	public String toString() {
		return Integer.toString(n);
	}
}

public class Worm implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public static Random rand = new Random(47);
	private Data[] d = { new Data(rand.nextInt(10)), new Data(rand.nextInt(10)), new Data(rand.nextInt(10)) };
	private Worm next;
	private char c;

	public Worm(int i, char c) {
		System.out.println("constructor" + i);
		this.c = c;
		if (--i > 0)
			next = new Worm(i, (char) (c + 1));

	}

	public Worm() {
		System.out.print("Default constructor");
	}

	public String toString() {
		StringBuilder result = new StringBuilder(":");
		result.append(c);
		result.append("(");
		for (Data dat : d)
			result.append(dat);
		result.append(")");
		if (result != null)
			result.append(next);
		return result.toString();

	}

	@SuppressWarnings("resource")
	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		File f = new File("C:\\Worm.out");
		if (!f.exists())
			f.createNewFile();
		// TODO 自動生成されたメソッド・スタブ
		Worm w = new Worm(6, 'a');
		System.out.println("w=" + w);
		ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("C:\\Worm.out"));
		out.writeObject(w);
		out.close();
		ObjectInputStream in = new ObjectInputStream(new FileInputStream("C:\\Worm.out"));
		//String s = (String) in.readObject();
		Worm w2 = (Worm) in.readObject();
		System.out.println("w2" + w2);
		ByteArrayOutputStream bout = new ByteArrayOutputStream();
		ObjectOutputStream out2 = new ObjectOutputStream(bout);
		out2.writeObject(w);
		out.flush();
		ObjectInputStream in2 = new ObjectInputStream(new ByteArrayInputStream(bout.toByteArray()));
		//s = (String) in2.readObject();
		Worm w3 = (Worm) in2.readObject();
		System.out.println( "w3" + w3);
	}

}
