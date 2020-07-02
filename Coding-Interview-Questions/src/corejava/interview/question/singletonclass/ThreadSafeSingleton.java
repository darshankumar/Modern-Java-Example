package corejava.interview.question.singletonclass;

class ThreadSafeSingleton {

	// static variable single_instance of type Singleton
	private static ThreadSafeSingleton single_instance = null;

	// variable of type String
	public String s;

	private ThreadSafeSingleton() {
		// a private constructor
		s = "Hello I am a string part of Singleton class";
	}

	// static method to create instance of Singleton class -- Thread safe
	public synchronized static ThreadSafeSingleton getInstance() {
		if (single_instance == null)
			single_instance = new ThreadSafeSingleton();
		return single_instance;
	}

	public static void main(String[] args) {
		// instantiating Singleton class with variable x
		ThreadSafeSingleton x = ThreadSafeSingleton.getInstance();

		// instantiating Singleton class with variable y
		ThreadSafeSingleton y = ThreadSafeSingleton.getInstance();

		// instantiating Singleton class with variable z
		ThreadSafeSingleton z = ThreadSafeSingleton.getInstance();

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