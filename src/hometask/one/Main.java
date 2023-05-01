package hometask.one;

import java.util.List;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		List<Cat> list1 = new ArrayList<>();

		Cat cat1 = new Cat("George", 5, "Mike");
		Cat cat2 = new Cat("Lili", 3, "Julia");
		Cat cat3 = new Cat("Ruf", 1, "Olga");
		Cat cat4 = new Cat("Kitty", 2, "Steven");
		Cat cat5 = new Cat("Bubble", 3, "Peter");
		Cat cat6 = new Cat("Tom", 4, "Uve");
		Cat cat7 = new Cat("Koko", 1, "Evelina");
		Cat cat8 = new Cat("Gosha", 2, "John");
		Cat cat9 = new Cat("Guru", 1, "Scott");
		Cat cat10 = new Cat("Kush", 1, "Irina");

		list1.add(cat1);
		list1.add(cat2);
		list1.add(cat3);
		list1.add(cat4);
		list1.add(cat5);
		list1.add(cat6);
		list1.add(cat7);
		list1.add(cat8);
		list1.add(cat9);
		list1.add(cat10);

		list1.remove(0);
		list1.remove(0);
		list1.remove(list1.size() - 1);

		for (Cat element : list1) {
			System.out.println(element);
		}
	}
}