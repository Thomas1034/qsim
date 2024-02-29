package squire.test;

import java.util.Random;

import squire.circuit.QuantumCircuitSimulator;

public class QuantumCircuitTests {

	public static void run(int n) {
		smallHadamardTest(n);
		largeHadamardTest(n);
		smallEntanglingTest(n);
		largeEntanglingTest(n);
		teleportationTest(n);
		bellStateTest(n);
	}

	private static void smallHadamardTest(int tries) {
		System.out.println("Running Hadamard test on a single qubit:");
		QuantumCircuitSimulator qc = new QuantumCircuitSimulator(1, new Random());
		qc.h(0);
		testCircuit(qc, tries);
	}

	private static void largeHadamardTest(int tries) {
		System.out.println("Running Hadamard test on a 4 qubit system, expect equal probabilities:");
		QuantumCircuitSimulator qc = new QuantumCircuitSimulator(4, new Random());
		qc.h(0);
		qc.h(1);
		qc.h(2);
		qc.h(3);
		testCircuit(qc, tries);
	}

	private static void smallEntanglingTest(int tries) {
		System.out.println("Running entangling test on a pair of qubits:");
		QuantumCircuitSimulator qc = new QuantumCircuitSimulator(2, new Random());
		qc.h(0);
		qc.cx(1, 0);
		testCircuit(qc, tries);
	}

	private static void largeEntanglingTest(int tries) {
		System.out.println("Running entangling test on 4 qubits:");
		QuantumCircuitSimulator qc = new QuantumCircuitSimulator(4, new Random());
		qc.h(0);
		qc.cx(1, 0);
		qc.cx(2, 0);
		qc.cx(3, 0);
		testCircuit(qc, tries);
	}

	private static void teleportationTest(int tries) {
		double chance_of_one = 0.25;
		System.out.println("Running teleportation test on three qubits (sending probability " + chance_of_one + "):");
		QuantumCircuitSimulator qc = new QuantumCircuitSimulator(3, new Random());
		// Alice has qubit 0 and 1
		// Bob has qubit 2

		// We'll use 1 and 2 as the communication pair, and set the initial state as
		// follows:
		qc.ry(0, Math.acos(Math.sqrt(chance_of_one)));

		// Entangle 1 and 2 into the Hadamard-0 bell state
		qc.h(1);
		qc.cx(2, 1);
		// Now CNOT 0 onto 1.
		qc.cx(1, 0);
		// Hadamard 0.
		qc.h(0);
		// Now measure 0 and 1, making them classical.
		qc.measure(0);
		qc.measure(1);
		// CNOT 1 onto 2
		qc.cx(2, 1);
		// CZ 0 onto 2
		qc.cz(2, 0);

		// And, hopefully, 0 is now sent to 2.

		testCircuit(qc, tries);
	}
	
	private static void bellStateTest(int tries) {
		System.out.println("Bell states:");
		System.out.println("Bell 0:");
		QuantumCircuitSimulator qc0 = new QuantumCircuitSimulator(2, new Random());
		qc0.h(0);
		qc0.cx(1, 0);
		testCircuitWithDebug(qc0, tries);
		System.out.println("Bell 1:");
		QuantumCircuitSimulator qc1 = new QuantumCircuitSimulator(2, new Random());
		qc1.x(0);
		qc1.h(0);
		qc1.cx(1, 0);
		testCircuitWithDebug(qc1, tries);
		System.out.println("Bell 2:");
		QuantumCircuitSimulator qc2 = new QuantumCircuitSimulator(2, new Random());
		qc2.x(1);
		qc2.h(0);
		qc2.cx(1, 0);
		testCircuitWithDebug(qc2, tries);
		System.out.println("Bell 3:");
		QuantumCircuitSimulator qc3 = new QuantumCircuitSimulator(2, new Random());
		qc3.x(0);
		qc3.x(1);
		qc3.h(0);
		qc3.cx(1, 0);
		testCircuitWithDebug(qc3, tries);
	}

	private static void testCircuit(QuantumCircuitSimulator qc, int tries) {

		int[] successes = new int[qc.countQubits()];
		for (int i = 0; i < tries; i++) {
			boolean[] temp = qc.run();
			//if (i % 50 == 0) {
			//	System.out.println("Test " + i + " produced " + Arrays.toString(temp));
			//}
			for (int j = 0; j < temp.length; j++) {
				successes[j] += temp[j] ? 1 : 0;
			}
		}

		for (int i = 0; i < successes.length; i++) {
			System.out.println("Qubit[" + i + "] was true: " + successes[i] + "/" + tries);
		}
	}
	
	private static void testCircuitWithDebug(QuantumCircuitSimulator qc, int tries) {

		int[] successes = new int[qc.countQubits()];
		for (int i = 0; i < tries; i++) {
			boolean[] temp = qc.run(true);
			//if (i % 50 == 0) {
			//	System.out.println("Test " + i + " produced " + Arrays.toString(temp));
			//}
			for (int j = 0; j < temp.length; j++) {
				successes[j] += temp[j] ? 1 : 0;
			}
		}

		for (int i = 0; i < successes.length; i++) {
			System.out.println("Qubit[" + i + "] was true: " + successes[i] + "/" + tries);
		}
	}

}
