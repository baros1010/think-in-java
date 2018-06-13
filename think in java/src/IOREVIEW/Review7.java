package IOREVIEW;

import java.io.Externalizable;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.util.concurrent.TimeUnit;

 class test implements Externalizable {
	private String id;
	private String name;
	private String tel;
	static String file = "C:\\practice\\think in java\\src\\2121.txt";
	public test(String id, String name, String tel) {
		this.id = id;
		this.name = name;
		this.tel = tel;
	}
	public test(){}
	public String toString() {
		return "logon info: \n name" + name + "\n id" + id + "\n tel:" + tel+"\n";
	}


	@Override
	public void writeExternal(ObjectOutput out) throws IOException {
		System.out.println("/////1111");
		// TODO 自動生成されたメソッド・スタブ
		out.writeObject(id);
		out.writeObject(name);

	}

	@Override
	public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
		// TODO 自動生成されたメソッド・スタブ
		System.out.println("2222");
		this.id=(String) in.readObject();
		this.name=(String) in.readObject();

	}


}
	public class Review7{
		public static void main(String[] args) {
			 test rw=new test("001","katoumegumi","123");
			 System.out.print("hello"+rw);
			// TODO 自動生成されたメソッド・スタブ
			ObjectOutputStream out;
			try {
				out = new ObjectOutputStream(new FileOutputStream("file"));
				out.writeObject(rw);
				out.close();
				TimeUnit.SECONDS.sleep(1);
				ObjectInputStream in= new ObjectInputStream(new FileInputStream("file"));
				rw=(test) in.readObject();
				System.out.println("hello!"+rw);
			} catch (FileNotFoundException e) {
				// TODO 自動生成された catch ブロック
				e.printStackTrace();
			} catch (IOException e) {
				// TODO 自動生成された catch ブロック
				e.printStackTrace();
			} catch (InterruptedException e) {
				// TODO 自動生成された catch ブロック
				e.printStackTrace();
			} catch (ClassNotFoundException e) {
				// TODO 自動生成された catch ブロック
				e.printStackTrace();
			}
		
		}
	}