package squire.circuit.gates;

import squire.circuit.QuantumGate;
import squire.complex.ComplexMatrix;
import squire.complex.ComplexNumber;

/**
 * The SwapGate class represents a quantum gate applying the SWAP operation on
 * two qubits. It extends the QuantumGate class, providing a specific
 * implementation for the SWAP gate operation.
 */
public class SwapGate extends QuantumGate {

	/**
	 * Constructs a SwapGate object with the specified number of qubits, target
	 * qubit index, and control qubit index. This gate will swap the states of the
	 * target and control qubits.
	 *
	 * @param numQubits The total number of qubits in the quantum system.
	 * @param target    The index of the target qubit for the SWAP gate.
	 * @param control   The index of the control qubit for the SWAP gate.
	 */
	public SwapGate(int numQubits, int target, int control) {
		super(ComplexMatrix.zero(4).set(0, 0, ComplexNumber.ONE).set(1, 2, ComplexNumber.ONE)
				.set(2, 1, ComplexNumber.ONE).set(3, 3, ComplexNumber.ONE), numQubits, target, control);
	}
}