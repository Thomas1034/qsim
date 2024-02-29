package squire.circuit;

public sealed interface CircuitModifier permits CombinableCircuitModifier, UncombinableCircuitModifier {
	public StateVector apply(StateVector state);
}
