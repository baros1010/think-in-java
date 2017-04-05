package unit8;

import java.util.Random;

public class RandomShapeGenrator {
	private Random rand = new Random(47);

	public Shape next() {
		switch (rand.nextInt(3)) {
		default:
		case 0:
			return new Triangle();
		case 1:
			return new Square();
		case 2:
			return new Circle();
		}
	}
}
