package unit15;

public class CountedObjiect {
	private static long counter = 0;
	private final long id = counter++;

	public long id() {
		return id;
	}

	public String toString() {
		return "haha" + id;
	}
}
