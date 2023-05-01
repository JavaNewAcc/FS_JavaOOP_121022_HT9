package classwork.two;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Main {

	public static void main(String[] args) {

		List<String> list1 = new ArrayList<>();

		list1.add("Hello");
		list1.add("World");
		list1.add("Java");

		System.out.println(list1);

		list1.add(1, ",");

		System.out.println(list1);

		System.out.println(list1.get(3));

		System.out.println(list1.remove(1));

		System.out.println(list1);

		Collections.sort(list1);

		System.out.println(list1);

		for (String element : list1) {
			System.out.println(element);
		}
		System.out.println();

		Iterator<String> itr = list1.iterator();
		for (; itr.hasNext();) {
			System.out.println(itr.next());
		}
	}
}