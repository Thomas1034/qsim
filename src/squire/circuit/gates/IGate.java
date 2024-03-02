package squire.circuit.gates;

import squire.circuit.QuantumGate;
import squire.complex.ComplexMatrix;
import squire.complex.ComplexNumber;

/**
 * The IGate class represents an identity gate, a single-qubit quantum gate that
 * leaves the state of the target qubit unchanged. It extends the QuantumGate
 * class, providing a specific implementation of the identity gate (I gate).
 */
public class IGate extends QuantumGate {

	/**
	 * Constructs an IGate with the specified number of qubits and target qubit
	 * index.
	 *
	 * @param numQubits The total number of qubits in the quantum system.
	 * @param target    The index of the qubit to which the identity gate is
	 *                  applied.
	 */
	public IGate(int numQubits, int target) {
		super(ComplexMatrix.zero(2).set(0, 0, ComplexNumber.ONE).set(1, 1, ComplexNumber.ONE), numQubits, target);
	}
}
