package qsim.circuit.gates;

import qsim.circuit.QuantumGate;
import qsim.complex.ComplexMatrix;
import qsim.complex.ComplexNumber;

public class YGate extends QuantumGate {

	public YGate(int numQubits, int target) {
		super(ComplexMatrix.zero(2).set(0, 1, ComplexNumber.I.neg()).set(1, 0, ComplexNumber.I), numQubits, target);
	}
}
