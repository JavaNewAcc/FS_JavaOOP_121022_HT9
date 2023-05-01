package classwork.one;

public class Pair<L, R> {
	private Object left;
	private Object right;

	public Pair(L left, R right) {
		super();
		this.left = left;
		this.right = right;
	}

	public L getLeft() {
		return (L) left;
	}

	public void setLeft(L left) {
		this.left = left;
	}

	public R getRight() {
		return (R) right;
	}

	public void setRight(R right) {
		this.right = right;
	}

	@Override
	public String toString() {
		return "Pair [left=" + left + ", right=" + right + "]";
	}

}
