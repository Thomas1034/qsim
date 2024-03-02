package squire.circuit.gates;

import squire.circuit.QuantumGate;
import squire.complex.ComplexMatrix;
import squire.complex.ComplexNumber;

/**
 * The TGate class represents a quantum gate applying the T operation on a
 * qubit. It extends the QuantumGate class, providing a specific implementation
 * for the T gate operation.
 */
public class TGate extends QuantumGate {

	/**
	 * Constructs a TGate object with the specified number of qubits and target
	 * qubit index.
	 *
	 * @param numQubits The total number of qubits in the quantum system.
	 * @param target    The index of the target qubit for the T gate.
	 */
	public TGate(int numQubits, int target) {
		super(ComplexMatrix.zero(2).set(0, 0, ComplexNumber.ONE).set(1, 1,
				new ComplexNumber(Math.sqrt(2), Math.sqrt(2))), numQubits, target);
	}
}
