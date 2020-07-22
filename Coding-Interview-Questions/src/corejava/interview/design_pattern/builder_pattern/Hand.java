package corejava.interview.design_pattern.builder_pattern;

import java.util.ArrayList;
import java.util.List;

public class Hand {
	private String type;
	private List<Finger> fingers = new ArrayList<Finger>();

	public Hand(String type) {
		this.type = type;
	}

	public void addFinger(Finger finger) {
		fingers.add(finger);
	}

	public String showHand() {
		return "Hand [type=" + type + ", fingers=" + fingers + "]";
	}

}
