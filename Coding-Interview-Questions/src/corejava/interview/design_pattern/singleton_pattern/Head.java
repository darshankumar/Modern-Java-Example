package corejava.interview.design_pattern.singleton_pattern;

public class Head {
	// make static and private instance too

	private static Head head = new Head();

	// make private constructor
	private Head() {

	}

	public static Head getHead() {
		return head;
	}
}
