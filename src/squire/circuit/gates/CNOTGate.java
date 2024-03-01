package squire.circuit.gates;

import squire.circuit.QuantumGate;
import squire.complex.ComplexMatrix;
import squire.complex.ComplexNumber;

public class CNOTGate extends QuantumGate {

	public CNOTGate(int numQubits, int target, int control) {
		super(ComplexMatrix.zero(4).set(0, 0, ComplexNumber.ONE).set(1, 1, ComplexNumber.ONE)
				.set(2, 3, ComplexNumber.ONE).set(3, 2, ComplexNumber.ONE), numQubits, target, control);
	}
}