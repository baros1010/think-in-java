package unit22;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class HelloSwing {

	public static void main(String[] args) throws InterruptedException {
		// TODO 自動生成されたメソッド・スタブ
		JFrame jm = new JFrame("hello world");
		JLabel lb = new JLabel("hello java");
	
		jm.add(lb);
		jm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jm.setSize(300, 500);
		jm.setVisible(true);
		Thread.sleep(1000);
		lb.setText("java good");
	}

}
