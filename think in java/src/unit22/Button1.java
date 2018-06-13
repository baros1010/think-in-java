package unit22;

import java.awt.AWTException;
import java.awt.FlowLayout;
import java.awt.Robot;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.InputEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class Button1 extends JFrame{
private JButton b1=new JButton("hello java");
private JTextField txt=new JTextField(10);
ButtonListener bl=new ButtonListener();
public Button1(){
	b1.addActionListener(bl);
	add(b1);
	add(txt);
	FlowLayout fl=new FlowLayout();
	setLayout(fl);
	

}
class ButtonListener implements ActionListener{

	@Override
	public void actionPerformed(ActionEvent e) {
		
		String name=((JButton)e.getSource()).getText();
		txt.setText(name);
		
	}}
	public static void main(String[] args) throws AWTException, InterruptedException {
		// TODO 自動生成されたメソッド・スタブs
		Button1 button=new Button1();
		button.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		button.setVisible(true);
		button.setSize(200, 400);
		Robot rb=new Robot();
		rb.mouseMove(100, 50);
		rb.mousePress(InputEvent.BUTTON1_MASK);
		Thread.sleep(1000);
		rb.mouseRelease(InputEvent.BUTTON1_MASK);
	}

}
