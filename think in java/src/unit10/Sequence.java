package unit10;

interface Selector {
	boolean end();

	Object current();

	void next();
}

public class Sequence {
	private Object[] items;
	private int next = 0;

	public Sequence(int size) {
		items = new Object[size];
	}

	public void add(Object x) {
		if (next < items.length) {
			items[next++] = x;
		}
	}

	private class SequenceSelector implements Selector {
		private int i = 0;

		@Override
		public boolean end() {
			// TODO �����������ꂽ���\�b�h�E�X�^�u
			return i == items.length;
		}

		@Override
		public Object current() {
			// TODO �����������ꂽ���\�b�h�E�X�^�u
			return items[i];
		}

		@Override
		public void next() {
			// TODO �����������ꂽ���\�b�h�E�X�^�u
			if (i < items.length)
				i++;
		}
	}

	public Selector selector() {
		return new SequenceSelector();
	}

	public static void main(String[] args) {
		// TODO �����������ꂽ���\�b�h�E�X�^�u
		Sequence sequence = new Sequence(10);
		for (int i = 0; i < 10; i++) {
			sequence.add(Integer.toString(i));
			Selector selector = sequence.selector();
			while (!selector.end()) {
				System.out.println(selector.current() + " ");
				selector.next();
			}
		}
	}

}
