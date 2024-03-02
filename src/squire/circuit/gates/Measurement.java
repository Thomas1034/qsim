package squire.circuit.gates;

import java.util.Random;

import squire.circuit.StateVector;
import squire.circuit.UncombinableCircuitModifier;

/**
 * The Measurement class represents a quantum measurement operation on a single
 * qubit. It implements the UncombinableCircuitModifier interface, providing a
 * specific implementation for the quantum measurement operation that cannot be
 * combined with other circuit modifiers.
 */
public class Measurement implements UncombinableCircuitModifier {

	private int target;
	private Random random;

	/**
	 * Constructs a Measurement object with the specified number of qubits, target
	 * qubit index, and random number generator.
	 *
	 * @param numQubits The total number of qubits in the quantum system.
	 * @param target    The index of the qubit to be measured.
	 * @param rand      The random number generator used for probabilistic
	 *                  measurement outcomes.
	 */
	public Measurement(int numQubits, int target, Random rand) {
		this.target = target;
		this.random = rand;
	}

	@Override
	public StateVector apply(StateVector state) {
		return state.measure(target, random.nextDouble());
	}

}
