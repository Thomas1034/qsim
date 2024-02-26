package squire.circuit.gates;

import squire.circuit.QuantumGate;
import squire.complex.ComplexMatrix;
import squire.complex.ComplexNumber;

public class XGate extends QuantumGate {

	public XGate(int numQubits, int target) {
		super(ComplexMatrix.zero(2).set(1, 0, ComplexNumber.ONE).set(0, 1, ComplexNumber.ONE), numQubits, target);
	}
}
