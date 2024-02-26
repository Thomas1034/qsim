package qsim.circuit.gates;

import qsim.circuit.QuantumGate;
import qsim.complex.ComplexMatrix;
import qsim.complex.ComplexNumber;

public class RZGate extends QuantumGate {

	public RZGate(int numQubits, int target, double theta) {
		super(ComplexMatrix.zero(2).set(0, 0, new ComplexNumber(0, -theta/2).exp())
				.set(1, 1, new ComplexNumber(0, theta/2).exp()), numQubits, target);
	}
}
