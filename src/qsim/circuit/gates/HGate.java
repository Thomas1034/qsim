package qsim.circuit.gates;

import qsim.circuit.QuantumGate;
import qsim.complex.ComplexMatrix;
import qsim.complex.ComplexNumber;

public class HGate extends QuantumGate {

	public HGate(int numQubits, int target) {
		super(ComplexMatrix.zero(2).add(ComplexNumber.ONE).set(1, 1, ComplexNumber.ONE.neg())
				.mult(new ComplexNumber(1 / Math.sqrt(2), 0)), numQubits, target);
	}
}
