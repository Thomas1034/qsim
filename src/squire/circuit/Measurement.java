package squire.circuit;

import java.util.Random;

/**
 * The Measurement class represents a quantum measurement operation on a single
 * qubit. It implements the UncombinableCircuitModifier interface, providing a
 * specific implementation for the quantum measurement operation that cannot be
 * combined with other circuit modifiers.
 */
public class Measurement implements UncombinableCircuitModifier {

	private int target;
	private Random random;
	private int size;

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
		this.size = numQubits;
	}

	@Override
	public StateVector apply(StateVector state) {
		return state.measure(this.target, this.random.nextDouble());
	}
	
	@Override
	public int numQubits() {
		return this.size;
	}

}
