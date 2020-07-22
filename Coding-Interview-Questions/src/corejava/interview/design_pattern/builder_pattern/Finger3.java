package corejava.interview.design_pattern.builder_pattern;

public class Finger3 implements Finger{
	
	private String str;
	
	public Finger3() {
		str = "FINGER3";
	}

	@Override
	public String toFinger() {
		return "Finger3 [str=" + str + "]";
	}
	
	
}
