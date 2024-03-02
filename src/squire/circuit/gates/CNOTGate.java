package squire.circuit.gates;

import squire.circuit.QuantumGate;
import squire.complex.ComplexMatrix;
import squire.complex.ComplexNumber;

/**
 * The CNOTGate class represents a controlled NOT gate, a two-qubit quantum gate
 * where the target qubit is inverted if and only if the control qubit is in the
 * state |1⟩. It extends the QuantumGate class, providing a specific
 * implementation of the CNOT gate.
 */
public class CNOTGate extends QuantumGate {

	/**
	 * Constructs a CNOTGate with the specified number of qubits, target qubit
	 * index, and control qubit index.
	 *
	 * @param numQubits The total number of qubits in the quantum system.
	 * @param target    The index of the target qubit.
	 * @param control   The index of the control qubit.
	 */
	public CNOTGate(int numQubits, int target, int control) {
		super(ComplexMatrix.zero(4).set(0, 0, ComplexNumber.ONE).set(1, 1, ComplexNumber.ONE)
				.set(2, 3, ComplexNumber.ONE).set(3, 2, ComplexNumber.ONE), numQubits, target, control);
	}
}