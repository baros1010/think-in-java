package test;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;

public class KeySprite2 {

	public static void main(String[] args) throws AWTException, InterruptedException {
		Robot r=new Robot();
	//	r.mouseMove(288,25);//将鼠标移至屏幕坐标(288,15)
		r.mouseMove(888,2500);//将鼠标移至屏幕坐标(288,15)
		r.delay(150);//停留150ms
		r.mousePress(InputEvent.BUTTON1_MASK);//按下鼠标左键
		r.delay(100);
		r.mouseRelease(InputEvent.BUTTON1_MASK);//松开左键
		//r.mouseMove(288, 500);
		
		String s="    hello!";
		char [] c=s.toCharArray();
		for(int i=0;i<c.length;i++){
			if((int) c[i]>=97&&(int) c[i]<=122){
				r.keyPress((int) c[i]-32);
				Thread.sleep(500);
				r.keyRelease((int) c[i]-32);
				Thread.sleep(500);
			}else{
				r.keyPress((int) c[i]);
				Thread.sleep(500);
				r.keyRelease((int) c[i]);
				Thread.sleep(500);
			}
			
		}
	r.keyPress(KeyEvent.VK_1);
		
		
		
	}

}
