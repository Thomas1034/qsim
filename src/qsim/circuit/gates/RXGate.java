package qsim.circuit.gates;

import qsim.circuit.QuantumGate;
import qsim.complex.ComplexMatrix;
import qsim.complex.ComplexNumber;

public class RXGate extends QuantumGate {

	public RXGate(int numQubits, int target, double theta) {
		super(ComplexMatrix.zero(2).set(0, 0, new ComplexNumber(Math.cos(theta / 2), 0))
				.set(1, 1, new ComplexNumber(Math.cos(theta / 2), 0))
				.set(1, 0, new ComplexNumber(0, -Math.sin(theta / 2)))
				.set(0, 1, new ComplexNumber(0, -Math.sin(theta / 2))), numQubits, target);
	}
}
