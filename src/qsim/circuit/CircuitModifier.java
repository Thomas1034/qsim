package qsim.circuit;

public interface CircuitModifier {
	public StateVector apply(StateVector state);
}
