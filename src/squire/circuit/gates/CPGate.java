package squire.circuit.gates;

import squire.circuit.QuantumGate;
import squire.complex.ComplexMatrix;
import squire.complex.ComplexNumber;

/**
 * The CPGate class represents a controlled phase gate, a two-qubit quantum gate
 * that performs a conditional phase shift on the target qubit based on the
 * state of the control qubit. It extends the QuantumGate class, providing a
 * specific implementation of the CP (controlled-P) gate.
 */
public class CPGate extends QuantumGate {

	/**
	 * Constructs a CZGate with the specified number of qubits, target qubit index,
	 * and control qubit index.
	 *
	 * @param numQubits The total number of qubits in the quantum system.
	 * @param target    The index of the qubit to which the controlled-P gate is
	 *                  applied.
	 * @param control   The index of the qubit serving as the control for the CP
	 *                  gate.
	 * @param theta     The phase angle to be conditionally applied.
	 */
	public CPGate(int numQubits, int target, int control, double theta) {
		super(ComplexMatrix.zero(4).set(0, 0, ComplexNumber.ONE).set(1, 1, ComplexNumber.ONE)
				.set(2, 2, ComplexNumber.ONE).set(3, 3, new ComplexNumber(0, theta).exp()), numQubits, target, control);
	}
}