package classwork.three;

import java.util.Set;
import java.util.HashSet;

public class Main {

	public static void main(String[] args) {
		Set<Integer> set1 = new HashSet<>();

		set1.add(1);
		set1.add(3);
		set1.add(3);
		set1.add(2);

		System.out.println(set1);

		for (Integer element : set1) {
			System.out.println(element);
		}

		set1.remove(3);

		System.out.println(set1);
	}
}