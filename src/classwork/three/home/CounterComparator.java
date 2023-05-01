package classwork.three.home;

import java.util.Comparator;

public class CounterComparator implements Comparator<Pair<Character, Integer>> {

	@Override
	public int compare(Pair<Character, Integer> o1, Pair<Character, Integer> o2) {
		if ((int) o1.getCounter() > (int) o2.getCounter()) {
			return 1;
		} else if ((int) o1.getCounter() < (int) o2.getCounter()) {
			return -1;
		} else {
			return 0;
		}
	}
}