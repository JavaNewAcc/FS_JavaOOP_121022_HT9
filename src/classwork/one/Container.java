package classwork.one;

public class Container<T> {

	private Object value;

	public Container(T value) {
		super();
		this.value = value;
	}

	public T getValue() {
		return (T) value;
	}

	public void setValue(T value) {
		this.value = value;
	}

	@Override
	public String toString() {
		return "Container [value=" + value + "]";
	}

}
