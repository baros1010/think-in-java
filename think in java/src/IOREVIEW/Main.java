package IOREVIEW;

import java.io.FileNotFoundException;
import java.io.IOException;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		RersonRequest request=new RersonRequest("陈磊","男","13816132818");
		request.setSex("男");
		request.setName("陈磊");
		request.setTel("13816132818");
		XMLConvert con =new XMLConvert();
		try {
			con.Convert(request.getClass());
		} catch (FileNotFoundException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		} catch (IOException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		}
	}

}
