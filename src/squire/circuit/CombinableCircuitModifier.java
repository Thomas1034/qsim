package squire.circuit;

import squire.complex.ComplexMatrix;

public non-sealed interface CombinableCircuitModifier extends CircuitModifier {
	
	public CircuitModifier combine(CombinableCircuitModifier c);
	
	public ComplexMatrix asMatrix();
}
