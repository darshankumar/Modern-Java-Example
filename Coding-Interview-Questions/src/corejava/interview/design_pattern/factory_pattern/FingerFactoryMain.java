package corejava.interview.design_pattern.factory_pattern;

public class FingerFactoryMain {

	public static void main(String[] args) {
		FingerFactory ff = new FingerFactory();
		System.out.println(ff.getFinger(1).toFinger());
		System.out.println(ff.getFinger(2).toFinger());
		System.out.println(ff.getFinger(3).toFinger());
		System.out.println(ff.getFinger(4).toFinger());
		System.out.println(ff.getFinger(5).toFinger());
	}

}
