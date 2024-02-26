package squire.circuit.gates;

import squire.circuit.QuantumGate;
import squire.complex.ComplexMatrix;
import squire.complex.ComplexNumber;

public class YGate extends QuantumGate {

	public YGate(int numQubits, int target) {
		super(ComplexMatrix.zero(2).set(0, 1, ComplexNumber.I.neg()).set(1, 0, ComplexNumber.I), numQubits, target);
	}
}
