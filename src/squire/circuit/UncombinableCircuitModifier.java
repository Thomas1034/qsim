package squire.circuit;

/**
 * The {@code UncombinableCircuitModifier} interface extends
 * {@link CircuitModifier} and represents a circuit modifier that cannot be
 * combined with other circuit modifiers for optimization. Implementing classes
 * must define specific modifications that cannot be simplified or combined with
 * other modifiers.
 *
 * @see CircuitModifier
 */
public non-sealed interface UncombinableCircuitModifier extends CircuitModifier {
	// No additional methods are required for this interface.
}
