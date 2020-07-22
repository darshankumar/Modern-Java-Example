package corejava.interview.design_pattern.builder_pattern;

public class Finger5 implements Finger{
	
	private String str;
	
	public Finger5() {
		str = "FINGER4";
	}

	@Override
	public String toFinger() {
		return "Finger5 [str=" + str + "]";
	}
	
	
}
