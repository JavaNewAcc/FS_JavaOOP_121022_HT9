package hometask.four;

import java.util.ArrayDeque;

public class ColaSplitter {
	public static ArrayDeque<String> colaLoversSplitter(ArrayDeque<String> dequeue, int serves) {
		for (int i = 0; i < serves; i++) {
			String firstInQueue = dequeue.getFirst();
			dequeue.pollFirst();
			dequeue.addLast(firstInQueue);
			dequeue.addLast(firstInQueue);
		}
		return dequeue;
	}
}
