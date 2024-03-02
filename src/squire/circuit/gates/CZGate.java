package squire.circuit.gates;

import squire.circuit.QuantumGate;
import squire.complex.ComplexMatrix;
import squire.complex.ComplexNumber;

/**
 * The CZGate class represents a controlled-Z gate, a two-qubit quantum gate
 * that performs a conditional phase shift on the target qubit based on the
 * state of the control qubit. It extends the QuantumGate class, providing a
 * specific implementation of the CZ (controlled-Z) gate.
 */
public class CZGate extends QuantumGate {

	/**
	 * Constructs a CZGate with the specified number of qubits, target qubit index,
	 * and control qubit index.
	 *
	 * @param numQubits The total number of qubits in the quantum system.
	 * @param target    The index of the qubit to which the controlled-Z gate is
	 *                  applied.
	 * @param control   The index of the qubit serving as the control for the CZ
	 *                  gate.
	 */
	public CZGate(int numQubits, int target, int control) {
		super(ComplexMatrix.zero(4).set(0, 0, ComplexNumber.ONE).set(1, 1, ComplexNumber.ONE)
				.set(2, 2, ComplexNumber.ONE).set(3, 3, ComplexNumber.ONE.neg()), numQubits, target, control);
	}
}