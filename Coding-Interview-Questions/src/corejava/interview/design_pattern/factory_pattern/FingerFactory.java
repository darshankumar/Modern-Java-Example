package corejava.interview.design_pattern.factory_pattern;

public class FingerFactory {

	Finger getFinger(Integer finger) {
		if (finger == null) {
			return null;
		}
		if (finger.equals(1)) {
			return new Finger1();

		} else if (finger.equals(2)) {
			return new Finger2();

		} else if (finger.equals(3)) {
			return new Finger3();

		} else if (finger.equals(4)) {
			return new Finger4();

		} else if (finger.equals(5)) {
			return new Finger5();

		}
		return null;
	}

}
