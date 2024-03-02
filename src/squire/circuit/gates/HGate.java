package squire.circuit.gates;

import squire.circuit.QuantumGate;
import squire.complex.ComplexMatrix;
import squire.complex.ComplexNumber;

/**
 * The HGate class represents a Hadamard gate, a single-qubit quantum gate that
 * creates a superposition by putting the qubit in an equal probability of being
 * in state |0⟩ or |1⟩. It extends the QuantumGate class, providing a specific
 * implementation of the Hadamard gate.
 */
public class HGate extends QuantumGate {

	/**
	 * Constructs an HGate with the specified number of qubits and target qubit
	 * index.
	 *
	 * @param numQubits The total number of qubits in the quantum system.
	 * @param target    The index of the qubit to which the Hadamard gate is
	 *                  applied.
	 */
	public HGate(int numQubits, int target) {
		super(ComplexMatrix.zero(2).add(ComplexNumber.ONE).set(1, 1, ComplexNumber.ONE.neg())
				.mult(new ComplexNumber(1 / Math.sqrt(2), 0)), numQubits, target);
	}
}
