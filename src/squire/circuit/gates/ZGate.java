package squire.circuit.gates;

import squire.circuit.QuantumGate;

import squire.complex.ComplexMatrix;
import squire.complex.ComplexNumber;

/**
 * The ZGate class represents a quantum gate applying the Pauli-Z operation on a
 * qubit. It extends the QuantumGate class, providing a specific implementation
 * for the Z gate operation. The Z gate introduces a phase flip, transforming
 * |0⟩ to |0⟩ and |1⟩ to -|1⟩.
 */
public class ZGate extends QuantumGate {

	/**
	 * Constructs a ZGate object with the specified number of qubits and target
	 * qubit index.
	 *
	 * @param numQubits The total number of qubits in the quantum system.
	 * @param target    The index of the target qubit for the Z gate.
	 */
	public ZGate(int numQubits, int target) {
		super(ComplexMatrix.zero(2).set(0, 0, ComplexNumber.ONE).set(1, 1, ComplexNumber.ONE.neg()), numQubits, target);
	}
}
