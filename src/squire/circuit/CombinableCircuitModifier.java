package squire.circuit;

import squire.complex.ComplexMatrix;

/**
 * The {@code CombinableCircuitModifier} interface extends
 * {@link CircuitModifier} and represents a circuit modifier that can be
 * combined with another {@code CombinableCircuitModifier} for circuit
 * optimization. Implementing classes must provide methods to combine with
 * another modifier and represent the modification as a {@link ComplexMatrix}.
 *
 * @see CircuitModifier
 * @see ComplexMatrix
 */
public non-sealed interface CombinableCircuitModifier extends CircuitModifier {

	/**
	 * Combines this combinable circuit modifier with another combinable circuit
	 * modifier.
	 *
	 * @param c The combinable circuit modifier to be combined with this modifier.
	 * @return A new circuit modifier representing the combination of this and the
	 *         provided modifier.
	 *
	 * @implNote Implementing classes must define the specific rules for combination
	 *           with another modifier.
	 * @implNote The resulting modifier should incorporate the combined effect of
	 *           both modifiers.
	 */
	public CircuitModifier combine(CombinableCircuitModifier c);

	/**
	 * Converts this combinable circuit modifier into a complex matrix
	 * representation.
	 *
	 * @return The complex matrix representation of this combinable circuit
	 *         modifier.
	 *
	 * @implNote Implementing classes must define how the modification is
	 *           represented as a complex matrix.
	 * @implNote The resulting matrix should capture the transformation applied by
	 *           this circuit modifier.
	 */
	public ComplexMatrix asMatrix();
}
