package unit13;

import java.io.PrintStream;
import java.util.Formatter;

public class Turtle {
	private String name;
	private Formatter f;

	public Turtle(String name, Formatter f) {
		this.name = name;
		this.f = f;

	}

	public void move(int x, int y) {
		f.format("%s theTurtle is at(%d,%d)\n", name, x, y);
	}

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		PrintStream outAlias = System.err;
		Turtle tom = new Turtle("Tom", new Formatter(System.err));
		Turtle Jerry = new Turtle("Jerry", new Formatter(outAlias));
		tom.move(1, 1);
		Jerry.move(0, 0);
		tom.move(2, 1);
		Jerry.move(1, 0);

	}

}
