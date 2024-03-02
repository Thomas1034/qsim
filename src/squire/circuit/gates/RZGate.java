package squire.circuit.gates;

import squire.circuit.QuantumGate;
import squire.complex.ComplexMatrix;
import squire.complex.ComplexNumber;

/**
 * The RZGate class represents a quantum gate that performs a rotation around
 * the Z-axis in the Bloch sphere. It extends the QuantumGate class, providing a
 * specific implementation of a single-qubit rotation gate.
 */
public class RZGate extends QuantumGate {

	/**
	 * Constructs an RZGate with the specified number of qubits, target qubit index,
	 * and rotation angle.
	 *
	 * @param numQubits The total number of qubits in the quantum system.
	 * @param target    The index of the qubit to which the gate is applied.
	 * @param theta     The rotation angle around the X-axis in radians.
	 */
	public RZGate(int numQubits, int target, double theta) {
		super(ComplexMatrix.zero(2).set(0, 0, new ComplexNumber(0, -theta / 2).exp()).set(1, 1,
				new ComplexNumber(0, theta / 2).exp()), numQubits, target);
	}
}
