package squire.circuit.gates;

import squire.circuit.QuantumGate;
import squire.complex.ComplexMatrix;
import squire.complex.ComplexNumber;

/**
 * The XGate class represents a quantum gate applying the Pauli-X (NOT)
 * operation on a qubit. It extends the QuantumGate class, providing a specific
 * implementation for the X gate operation. The X gate flips the state of a
 * qubit, exchanging |0⟩ and |1⟩.
 */
public class XGate extends QuantumGate {

	/**
	 * Constructs an XGate object with the specified number of qubits and target
	 * qubit index.
	 *
	 * @param numQubits The total number of qubits in the quantum system.
	 * @param target    The index of the target qubit for the X gate.
	 */
	public XGate(int numQubits, int target) {
		super(ComplexMatrix.zero(2).set(1, 0, ComplexNumber.ONE).set(0, 1, ComplexNumber.ONE), numQubits, target);
	}
}
