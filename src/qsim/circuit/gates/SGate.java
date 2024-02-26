package qsim.circuit.gates;

import qsim.circuit.QuantumGate;
import qsim.complex.ComplexMatrix;
import qsim.complex.ComplexNumber;

public class SGate extends QuantumGate {

	public SGate(int numQubits, int target) {
		super(ComplexMatrix.zero(2).set(0, 0, ComplexNumber.ONE).set(1, 1, ComplexNumber.I), numQubits, target);
	}
}
