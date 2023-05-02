package hometask.three;

public class Pair<L, C> {

	private Object letter;
	private Object counter;

	public Pair() {
		super();
	}

	public Pair(L letter, C counter) {
		super();
		this.letter = letter;
		this.counter = counter;
	}

	public L getLetter() {
		return (L) letter;
	}

	public void setLetter(L letter) {
		this.letter = letter;
	}

	public C getCounter() {
		return (C) counter;
	}

	public void setCounter(C counter) {
		this.counter = counter;
	}

	@Override
	public String toString() {
		return "Pair [letter=" + letter + ", counter=" + counter + "]";
	}
}