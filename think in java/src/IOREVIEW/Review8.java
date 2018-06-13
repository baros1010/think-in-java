package IOREVIEW;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class Review8 {
	static String file = "C:\\practice\\think in java\\src\\2121.txt";

	public static void main(String[] args) throws FileNotFoundException {
		// TODO 自動生成されたメソッド・スタブ
		FileChannel fc = new FileInputStream(file).getChannel();
		ByteBuffer bf=ByteBuffer.allocate(1024);
		try {
			fc.read(bf);
			bf.flip();
			while(bf.hasRemaining()){
				System.out.print((char)bf.get());
			}
		} catch (IOException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		}
	}

}
