package unit18;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class logon implements Serializable {
	private Date date = new Date();
	private String username;
	private transient String password;

	public logon(String username, String password) {
		this.username = username;
		this.password = password;
	}

	public String toString() {
		return "logon info: \n username" + username + "\n date" + date + "\n password:" + password;
	}

	public static void main(String[] args) throws InterruptedException {
		// TODO 自動生成されたメソッド・スタブ
		logon log=new logon("chenlei","tenzai");
		System.out.println("logon log"+log);
		try {
			ObjectOutputStream out =new  ObjectOutputStream(new FileOutputStream("log out"));
			out.writeObject(log);
			out.close();
			TimeUnit.SECONDS.sleep(1);
			ObjectInputStream in=new ObjectInputStream(new FileInputStream("log out"));
			log=(logon)in.readObject();
			System.out.println("logon log"+log);
		} catch (IOException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		}
	}

}
