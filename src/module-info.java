
/**
 * This module defines a set of classes and interfaces for quantum circuit
 * simulation. It includes abstractions for quantum gates, measurements, and
 * state vectors in a quantum system.
 * 
 * To implement these, this module defines a {@code ComplexNumber} class to
 * represent complex numbers, as well as a {@code ComplexMatrix} class to hold
 * matrix and vector representations of logic gates and quantum states.
 */
module squire {
	exports squire.circuit;
	exports squire.circuit.gates;
	exports squire.complex;
}