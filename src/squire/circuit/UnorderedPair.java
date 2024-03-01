package squire.circuit;

import java.util.Objects;

public class UnorderedPair {
	
	private final int x;
	private final int y;
	
	public UnorderedPair(int x, int y) {
		this.x = Math.max(x, y);
		this.y = Math.min(x, y);
	}
	
	// Order does not matter.
	@Override
	public int hashCode() {
		return Objects.hash(x, y);
	}
	
	public int x() {
		return this.x;
	}
	
	public int y() {
		return this.y;
	}
	
	// Override equality.
	@Override
	public boolean equals(Object obj) {
		if (obj == this) {
			return true;
		}
		if (obj instanceof UnorderedPair that) {
			
			return this.x == that.x && this.y == that.y;
		}
		return false;
		
	}
	
}
