package test;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;

public class KeySprite3 {

	public static void main(String[] args) throws AWTException, IOException, InterruptedException {
		Runtime.getRuntime().exec("notepad");
		//创建机器人
		Robot rb=new Robot();
		rb.keyPress(KeyEvent.VK_N);
		Thread.sleep(500);
		rb.keyPress(KeyEvent.VK_I);
		Thread.sleep(500);
		rb.keyPress(KeyEvent.VK_H);
		Thread.sleep(500);
		rb.keyPress(KeyEvent.VK_A);
		Thread.sleep(500);
		rb.keyPress(KeyEvent.VK_O);
		Thread.sleep(500);
		rb.keyPress(KeyEvent.VK_1);
		Thread.sleep(500);

		
		
	}

}
