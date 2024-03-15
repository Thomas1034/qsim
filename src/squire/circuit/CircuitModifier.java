package squire.circuit;

/**
 * The {@code CircuitModifier} interface represents an operation that can be
 * applied to a quantum state vector within a quantum circuit. Implementing
 * classes are responsible for defining the transformation applied to the state.
 * Implementations of this interface can be either
 * {@code CombinableCircuitModifier} or {@code UncombinableCircuitModifier},
 * depending on whether they support combination with other circuit modifiers
 * for circuit optimization.
 *
 * @see CombinableCircuitModifier
 * @see UncombinableCircuitModifier
 * @see StateVector
 */
public sealed interface CircuitModifier permits CombinableCircuitModifier, UncombinableCircuitModifier {
	/**
	 * Applies the circuit modification to the given quantum state vector.
	 *
	 * Implementing classes must define the specific transformation applied to the
	 * state vector. The modification is applied directly to the provided state
	 * vector without modifying its internal state.
	 *
	 * @param state The quantum state vector to which the circuit modification is
	 *              applied.
	 * @return The resulting quantum state vector after applying the circuit
	 *         modification.
	 */
	public StateVector apply(StateVector state);
	
	/**
	 * Returns the number of qubits this gate applies to.
	 * @return The number of qubits this gate applies to.
	 */
	public int numQubits();
}
