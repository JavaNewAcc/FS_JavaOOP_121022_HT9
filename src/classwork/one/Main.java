package classwork.one;

public class Main {

	public static void main(String[] args) {

		Container<Integer> a = new Container<>(100);
		Container<String> b = new Container<>("Hello world");

		int number = 50 + a.getValue();

		System.out.println(number);
		System.out.println(a);
		System.out.println(b);

		Pair<Integer, String> pair1 = new Pair<>(1, "Hello World");

		System.out.println(pair1.getLeft());
		System.out.println(pair1.getRight());

		Integer[] intArr = new Integer[] { 10, 15, 20, 40, 3 };

		Integer result = getMinElem(intArr);
		System.out.println(result);

		Container<? extends Comparable<?>> c = a;
		System.out.println(c);
		c = b;
		System.out.println(c);
	}

	public static <T extends Comparable<T>> T getMinElem(T[] array) {
		T min = array[0];
		for (int i = 0; i < array.length; i++) {
			if (array[i].compareTo(min) < 0) {
				min = array[i];
			}
		}
		return min;
	}
}