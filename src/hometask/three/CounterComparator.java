package hometask.three;

import java.util.Comparator;

public class CounterComparator implements Comparator<Pair<Character, Integer>> {

	@Override
	public int compare(Pair<Character, Integer> o1, Pair<Character, Integer> o2) {
		if (o1.getCounter() < o2.getCounter()) {
			return 1;
		} else if (o1.getCounter() > o2.getCounter()) {
			return -1;
		} else {
			return 0;
		}
	}
}