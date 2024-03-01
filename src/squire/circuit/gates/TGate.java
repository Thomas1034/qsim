package squire.circuit.gates;

import squire.circuit.QuantumGate;
import squire.complex.ComplexMatrix;
import squire.complex.ComplexNumber;

public class TGate extends QuantumGate {

	public TGate(int numQubits, int target) {
		super(ComplexMatrix.zero(2).set(0, 0, ComplexNumber.ONE).set(1, 1,
				new ComplexNumber(Math.sqrt(2), Math.sqrt(2))), numQubits, target);
	}
}
