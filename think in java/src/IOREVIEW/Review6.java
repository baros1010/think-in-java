package IOREVIEW;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Review6 implements Serializable {
	static String file = "C:\\practice\\think in java\\src\\2121.txt";
	private Date date = new Date();
	private String username;
//	private transient String password;
	private  String password;
	public Review6(String username, String password) {
		this.username = username;
		this.password = password;
	}

	public String toString() {
		return "logon info: \n username" + username + "\n date" + date + "\n password:" + password;
	}
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Review6 rw =new Review6("kaotoumegumi","nozomi");
		System.out.println("hello"+rw);
		try {
			ObjectOutputStream out=new ObjectOutputStream(new FileOutputStream("file"));
			out.writeObject(rw);
			out.close();
			TimeUnit.SECONDS.sleep(1);
			ObjectInputStream in= new ObjectInputStream(new FileInputStream("file"));
			rw=(Review6) in.readObject();
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
