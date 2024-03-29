package squire.circuit.components;

import squire.circuit.QuantumCircuitSimulator;
import squire.circuit.StateVector;
import squire.circuit.UncombinableCircuitModifier;

public class QuantumFourierTransform implements UncombinableCircuitModifier {

	private QuantumCircuitSimulator qft;

	QuantumFourierTransform(int numQubits) {
		this.qft = new QuantumCircuitSimulator(numQubits);
		// Construct the QuantumFourierTransform
		for (int i = numQubits - 1; i >= 0; i--) {
			for (int j = numQubits - 1; j > i; j--) {
				addControlledPhaseGate(qft, j, i, j - i + 1);
			}
			this.qft.h(i);
		}
	}

	private void addControlledPhaseGate(QuantumCircuitSimulator circuit, int src, int target, int n) {
		circuit.cp(-Math.PI / Math.pow(2, n - 1), src, target);
	}

	@Override
	public StateVector apply(StateVector state) {
		return qft.apply(state);
	}

	@Override
	public int numQubits() {
		return qft.numQubits();
	}
}
