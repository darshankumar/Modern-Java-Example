package corejava.interview.design_pattern.builder_pattern;

public class HandBuilderMain {

	public static void main(String[] args) {
		HandBuilder hb = new HandBuilder();
		Hand left = hb.getHand("LEFT");
		System.out.println(left.showHand());
		Hand right = hb.getHand("RIGHT");
		System.out.println(right.showHand());

	}

}
