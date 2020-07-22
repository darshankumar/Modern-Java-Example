package corejava.interview.design_pattern.builder_pattern;

public class Finger4 implements Finger{
	
	private String str;
	
	public Finger4() {
		str = "FINGER4";
	}

	@Override
	public String toFinger() {
		return "Finger4 [str=" + str + "]";
	}
	
	
}
