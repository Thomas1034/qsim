package squire.circuit;

import java.util.Objects;

/**
 * Represents an unordered pair of integers. The order in which the elements are
 * specified does not matter. This class is immutable.
 */
public class UnorderedPair {

	/**
	 * The first element of the pair, where x is greater than or equal to y.
	 */
	private final int x;
	/**
	 * The second element of the pair, where y is less than or equal to x.
	 */
	private final int y;

	/**
	 * Constructs an unordered pair with the given integers. The order of the
	 * elements will be adjusted to ensure x is greater than or equal to y.
	 *
	 * @param x The first element of the pair.
	 * @param y The second element of the pair.
	 */
	public UnorderedPair(int x, int y) {
		this.x = Math.max(x, y);
		this.y = Math.min(x, y);
	}

	/**
	 * Generates a hash code for this unordered pair based on the hash codes of its
	 * elements.
	 *
	 * @return A hash code value for this object.
	 */
	@Override
	public int hashCode() {
		return Objects.hash(x, y);
	}

	/**
	 * Returns the first element of the unordered pair.
	 *
	 * @return The first element.
	 */
	public int x() {
		return this.x;
	}

	/**
	 * Returns the second element of the unordered pair.
	 *
	 * @return The second element.
	 */
	public int y() {
		return this.y;
	}

	/**
	 * Checks whether this unordered pair is equal to another object. Two unordered
	 * pairs are considered equal if they have the same elements, regardless of
	 * order.
	 *
	 * @param obj The object to compare with this unordered pair.
	 * @return True if the objects are equal, false otherwise.
	 */
	@Override
	public boolean equals(Object obj) {
		if (super.equals(obj)) {
			return true;
		}
		if (obj instanceof UnorderedPair that) {

			return this.x == that.x && this.y == that.y;
		}
		return false;

	}

}
