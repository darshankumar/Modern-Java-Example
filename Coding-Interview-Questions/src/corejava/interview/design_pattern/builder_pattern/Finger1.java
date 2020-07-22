package corejava.interview.design_pattern.builder_pattern;

public class Finger1 implements Finger{
	
	private String str;
	
	public Finger1() {
		str = "FINGER1";
	}

	@Override
	public String toFinger() {
		return "Finger1 [str=" + str + "]";
	}
	
	
}
