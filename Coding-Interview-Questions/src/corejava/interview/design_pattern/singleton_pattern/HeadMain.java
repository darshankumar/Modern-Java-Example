package corejava.interview.design_pattern.singleton_pattern;

import java.util.HashSet;
import java.util.Set;

public class HeadMain {
	public static void main(String[] args) {
		Head head1 = Head.getHead();
		Head head2 = Head.getHead();
		Head head3 = Head.getHead();
		Head head4 = Head.getHead();
		
		Set<Head>  set = new HashSet<Head>();
		set.add(head1);
		set.add(head2);
		set.add(head3);
		set.add(head4);
		
		System.out.println(set.size());// got one head as all head are same instance only
	}
}
