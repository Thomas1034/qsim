package squire.circuit.gates;

import squire.circuit.QuantumGate;
import squire.complex.ComplexMatrix;
import squire.complex.ComplexNumber;

/**
 * The SGate class represents a quantum gate applying the S (Phase) operation on
 * a single qubit. It extends the QuantumGate class, providing a specific
 * implementation for the S gate operation.
 */
public class SGate extends QuantumGate {

	/**
	 * Constructs an SGate object with the specified number of qubits and target
	 * qubit index.
	 *
	 * @param numQubits The total number of qubits in the quantum system.
	 * @param target    The index of the qubit to which the S gate is applied.
	 */
	public SGate(int numQubits, int target) {
		super(ComplexMatrix.zero(2).set(0, 0, ComplexNumber.ONE).set(1, 1, ComplexNumber.I), numQubits, target);
	}
}
