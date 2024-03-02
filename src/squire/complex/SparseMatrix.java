package squire.complex;

import java.math.BigInteger;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * Represents a sparse matrix with complex number entries. Sparse matrices
 * efficiently store and operate on matrices with a significant number of zero
 * elements. This class provides methods to set and retrieve values at specific
 * row and column indices. Non-zero values are stored in a map to conserve
 * memory and enhance performance.
 */
public class SparseMatrix {

	/**
	 * A map storing non-zero entries of the sparse matrix along with their indices.
	 */
	private Map<MatrixIndex, ComplexNumber> matrix;

	/**
	 * Constructs an empty sparse matrix. The sparse matrix is initialized as an
	 * empty map.
	 */
	public SparseMatrix() {
		matrix = new HashMap<>();
	}

	/**
	 * Sets the value at the specified row and column indices in the sparse matrix.
	 * If the value is null, the entry is removed. If the value is zero, the entry
	 * is removed to save space.
	 *
	 * @param row   The row index at which to set the value.
	 * @param col   The column index at which to set the value.
	 * @param value The complex number value to be set.
	 */
	public void set(BigInteger row, BigInteger col, ComplexNumber value) {
		MatrixIndex index = new MatrixIndex(row, col);
		if (value == null) {
			matrix.remove(index);
			return;
		}

		if (value.equals(ComplexNumber.ZERO)) {
			matrix.remove(index);
		} else {
			matrix.put(index, value);
		}
	}

	/**
	 * Retrieves the complex number value at the specified row and column indices in
	 * the sparse matrix. If the entry is not present, it returns
	 * ComplexNumber.ZERO.
	 *
	 * @param row The row index from which to retrieve the value.
	 * @param col The column index from which to retrieve the value.
	 * @return The complex number value at the specified indices.
	 */
	public ComplexNumber get(BigInteger row, BigInteger col) {
		MatrixIndex index = new MatrixIndex(row, col);
		return matrix.getOrDefault(index, ComplexNumber.ZERO);
	}

	/**
	 * A record representing the index of a non-zero element in the sparse matrix.
	 * This record is used as a key in the map to uniquely identify matrix entries.
	 */
	private record MatrixIndex(BigInteger row, BigInteger col) {

		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null || getClass() != obj.getClass())
				return false;
			MatrixIndex that = (MatrixIndex) obj;
			return this.row.equals(that.row) && this.col.equals(that.col);
		}

		@Override
		public int hashCode() {
			return Objects.hash(this.row, this.col);
		}
	}
}
