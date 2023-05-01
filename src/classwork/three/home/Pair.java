package classwork.three.home;

public class Pair<Ltr, Cntr> {

	private Object letter;
	private Object counter;

	public Pair() {
		super();
	}

	public Pair(Ltr letter, Cntr counter) {
		super();
		this.letter = letter;
		this.counter = counter;
	}

	public Ltr getLetter() {
		return (Ltr) letter;
	}

	public void setLetter(Ltr letter) {
		this.letter = letter;
	}

	public Cntr getCounter() {
		return (Cntr) counter;
	}

	public void setCounter(Cntr counter) {
		this.counter = counter;
	}

	@Override
	public String toString() {
		return "Pair [letter=" + letter + ", counter=" + counter + "]";
	}
}