package squire.circuit.gates;

import squire.circuit.QuantumGate;
import squire.complex.ComplexMatrix;
import squire.complex.ComplexNumber;

/**
 * The PGate class represents a quantum gate that applies a phase shift. It
 * extends the QuantumGate class, providing a specific implementation of a
 * single-qubit rotation gate.
 */
public class PGate extends QuantumGate {

	/**
	 * Constructs an PGate with the specified number of qubits, target qubit index,
	 * and rotation angle. Transforms a|0> + b|1> to a|0> + (e^it)b|1>.
	 *
	 * @param numQubits The total number of qubits in the quantum system.
	 * @param target    The index of the qubit to which the gate is applied.
	 * @param theta     The relative phase angle to apply.
	 */
	public PGate(int numQubits, int target, double theta) {
		super(ComplexMatrix.zero(2).set(0, 0, ComplexNumber.ONE).set(1, 1, new ComplexNumber(0, theta).exp()), numQubits, target);
	}
}
