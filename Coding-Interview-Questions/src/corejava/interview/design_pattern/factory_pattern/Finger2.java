package corejava.interview.design_pattern.factory_pattern;

public class Finger2 implements Finger{
	
	private String str;
	
	public Finger2() {
		str = "FINGER2";
	}

	@Override
	public String toFinger() {
		return "Finger2 [str=" + str + "]";
	}
	
	
}
