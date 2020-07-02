package corejava.interview.question.singletonclass;

class DoubleCheckThreadSafeSingleton {

	// static variable single_instance of type Singleton
	private static DoubleCheckThreadSafeSingleton single_instance = null;

	// variable of type String
	public String s;

	private DoubleCheckThreadSafeSingleton() {
		// a private constructor
		s = "Hello I am a string part of Singleton class";
	}

	// static method to create instance of Singleton class -- Thread safe
	public static DoubleCheckThreadSafeSingleton getInstance() {
		if (single_instance == null) { // first check
			synchronized (DoubleCheckThreadSafeSingleton.class) {
				if (single_instance == null) {// double check in synchronized
					single_instance = new DoubleCheckThreadSafeSingleton();
				}
			}
		}
		return single_instance;
	}

	public static void main(String[] args) {
		// instantiating Singleton class with variable x
		DoubleCheckThreadSafeSingleton x = DoubleCheckThreadSafeSingleton.getInstance();

		// instantiating Singleton class with variable y
		DoubleCheckThreadSafeSingleton y = DoubleCheckThreadSafeSingleton.getInstance();

		// instantiating Singleton class with variable z
		DoubleCheckThreadSafeSingleton z = DoubleCheckThreadSafeSingleton.getInstance();

		System.out.println("String from x is " + x.s);
		System.out.println("String from y is " + y.s);
		System.out.println("String from z is " + z.s);
		System.out.println("\n");

		// changing variable of instance x
		x.s = (x.s).toUpperCase();

		System.out.println("String from x is " + x.s);
		System.out.println("String from y is " + y.s);
		System.out.println("String from z is " + z.s);
		System.out.println("\n");

		// changing variable of instance z
		z.s = (z.s).toLowerCase();

		System.out.println("String from x is " + x.s);
		System.out.println("String from y is " + y.s);
		System.out.println("String from z is " + z.s);

	}
}