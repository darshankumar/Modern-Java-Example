package corejava.interview.question.singletonclass;

public class SingletonBPS {

	private SingletonBPS() {
		// private constructor
	}

	// Inner class to provide instance of class
	private static class BillPughSingleton {
		private static final SingletonBPS INSTANCE = new SingletonBPS();
	}

	public static SingletonBPS getInstance() {
		return BillPughSingleton.INSTANCE;
	}
}
