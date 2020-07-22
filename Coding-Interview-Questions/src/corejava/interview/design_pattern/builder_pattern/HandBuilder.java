package corejava.interview.design_pattern.builder_pattern;

public class HandBuilder {

	public Hand getHand(String type) {
		Hand h = new Hand(type);
		h.addFinger(new Finger1());
		h.addFinger(new Finger2());
		h.addFinger(new Finger3());
		h.addFinger(new Finger4());
		h.addFinger(new Finger5());
		return h;
	}

}
