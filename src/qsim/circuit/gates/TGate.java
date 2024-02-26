package qsim.circuit.gates;

import qsim.circuit.QuantumGate;
import qsim.complex.ComplexMatrix;
import qsim.complex.ComplexNumber;

public class TGate extends QuantumGate {

	public TGate(int numQubits, int target) {
		super(ComplexMatrix.zero(2).set(0, 0, ComplexNumber.ONE).set(1, 1, new ComplexNumber(Math.sqrt(2), Math.sqrt(2))), numQubits, target);
	}
}
