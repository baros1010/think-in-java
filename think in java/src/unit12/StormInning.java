package unit12;

class BaseballException extends Exception {
}

class Foul extends BaseballException {
}

class Strike extends BaseballException {
}

abstract class Inning {
	public Inning() throws BaseballException {
	}

	public void event() throws Foul {
	}

	public abstract void atBat() throws Strike, Foul;

	public void walk() {
	};
}

class StormException extends Exception {
}

class RainedOut extends StormException {
}

class PopFoul extends Foul {
}

interface Storm {
	public void event() throws RainedOut;

	public void rainHard() throws RainedOut;
}

public class StormInning extends Inning implements Storm {
	public StormInning() throws RainedOut, BaseballException {
	}

	public StormInning(String s) throws Foul, BaseballException {
	}

	// void walk() throws PopFoul{} //Interface cannot add exceptions to exiting
	// public void event() throws RainedOut{}
	public void rainHard() throws RainedOut {
	}

	public void event() {
	}

	public void atBat() throws PopFoul {
	}

	public static void main(String[] args) {
		try {
			StormInning si = new StormInning();
			si.atBat();
		} catch (PopFoul e) {
			System.out.println("Pop");
		} catch (RainedOut e) {
			System.out.println("RainedOut");
		} catch (BaseballException e) {
			System.out.println("BaseballException");
		}
		try {
			Inning i = new StormInning();
			i.atBat();
		} catch (RainedOut e) {
			// TODO �����������ꂽ catch �u���b�N
			System.out.println("RainedOut");
		} catch (BaseballException e) {
			// TODO �����������ꂽ catch �u���b�N
			System.out.println("BaseballException");
		}
	}

}
