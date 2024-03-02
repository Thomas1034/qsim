package squire.circuit.gates;

import squire.circuit.QuantumGate;
import squire.complex.ComplexMatrix;
import squire.complex.ComplexNumber;

/**
 * The YGate class represents a quantum gate applying the Pauli-Y operation on a
 * qubit. It extends the QuantumGate class, providing a specific implementation
 * for the Y gate operation. The Y gate introduces a phase flip along with a bit
 * flip, transforming |0⟩ to i|1⟩ and |1⟩ to -i|0⟩.
 */
public class YGate extends QuantumGate {

	/**
	 * Constructs a YGate object with the specified number of qubits and target
	 * qubit index.
	 *
	 * @param numQubits The total number of qubits in the quantum system.
	 * @param target    The index of the target qubit for the Y gate.
	 */
	public YGate(int numQubits, int target) {
		super(ComplexMatrix.zero(2).set(0, 1, ComplexNumber.I.neg()).set(1, 0, ComplexNumber.I), numQubits, target);
	}
}
