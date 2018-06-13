package IOREVIEW;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class Review5 {
	static String file = "C:\\practice\\think in java\\src\\2121.txt";

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		try {
			FileChannel fc = new FileOutputStream(file).getChannel();
			try {
				fc.write(ByteBuffer.wrap("balabala".getBytes()));
				fc.close();
				fc = new FileInputStream(file).getChannel();
				ByteBuffer bf = ByteBuffer.allocate(1024);//分配一个数组并且将他放入缓冲区
				fc.read(bf);
				bf.flip();
				while (bf.hasRemaining()) {
					System.out.print((char)bf.get());
				}
			} catch (IOException e) {
				// TODO 自動生成された catch ブロック
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		}
	}
}
