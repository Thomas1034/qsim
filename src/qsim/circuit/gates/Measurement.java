package qsim.circuit.gates;

import java.util.Random;

import qsim.circuit.CircuitModifier;
import qsim.circuit.StateVector;

public class Measurement implements CircuitModifier {

	private int target;
	private Random random;
	
	public Measurement(int numQubits, int target, Random rand) {
		this.target = target;
		this.random = rand;
	}

	@Override
	public StateVector apply(StateVector state) {
		return state.measure(target, random.nextDouble());
	}

}
