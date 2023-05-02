package hometask.four;

import java.util.ArrayDeque;

public class Main {

	public static void main(String[] args) {
		ArrayDeque<String> queue = new ArrayDeque<>();

		queue.addLast("Sheldon");
		queue.addLast("Leonard");
		queue.addLast("Volovitc");
		queue.addLast("Kutrapalli");
		queue.addLast("Penny");

		System.out.println(queue);

		ColaSplitter.colaLoversSplitter(queue, 2);
		System.out.println(queue);
	}
}