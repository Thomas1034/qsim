package squire.circuit.gates;

import squire.circuit.QuantumGate;
import squire.complex.ComplexMatrix;
import squire.complex.ComplexNumber;

/**
 * The RXGate class represents a quantum gate that performs a rotation around
 * the Y-axis in the Bloch sphere. It extends the QuantumGate class, providing a
 * specific implementation of a single-qubit rotation gate.
 */
public class RYGate extends QuantumGate {

	/**
	 * Constructs an RYGate with the specified number of qubits, target qubit index,
	 * and rotation angle.
	 *
	 * @param numQubits The total number of qubits in the quantum system.
	 * @param target    The index of the qubit to which the gate is applied.
	 * @param theta     The rotation angle around the Y-axis in radians.
	 */
	public RYGate(int numQubits, int target, double theta) {
		super(ComplexMatrix.zero(2).set(0, 0, new ComplexNumber(Math.cos(theta / 2), 0))
				.set(1, 1, new ComplexNumber(Math.cos(theta / 2), 0))
				.set(1, 0, new ComplexNumber(Math.sin(theta / 2), 0))
				.set(0, 1, new ComplexNumber(-Math.sin(theta / 2), 0)), numQubits, target);
	}
}
