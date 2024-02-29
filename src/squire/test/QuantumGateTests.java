package squire.test;

import java.util.stream.IntStream;

import squire.circuit.QuantumGate;
import squire.circuit.StateVector;
import squire.circuit.gates.CNOTGate;
import squire.circuit.gates.HGate;
import squire.circuit.gates.IGate;
import squire.circuit.gates.RXGate;
import squire.circuit.gates.RYGate;
import squire.circuit.gates.RZGate;
import squire.complex.ComplexMatrix;

public class QuantumGateTests {

	public static void run() {
		System.out.println("Starting quantum gate tests...");
		smallIdentityTest();
		largeIdentityTest();
		smallHadamardTest();
		mediumHadamardTest();
		largeHadamardTest();
		smallCNOTTest();
		smallCNOTTest2();
		mediumCNOTTest();
		mediumCNOTTest2();
		mediumCNOTTest3();
		rotations(10);
		System.out.println("Finished quantum gate tests!");
	}

	public static void rotations(int n) {

		int numQubits = 2;

		StateVector sv = StateVector.createZeroState(numQubits);

		for (int q = 0; q < numQubits; q++) {
			final int qval = q;
			double[] rxs = IntStream.range(0, n).mapToDouble((i) -> (Math.sqrt(i + qval) * 2 * Math.PI * i / 3))
					.toArray();
			double[] rys = IntStream.range(0, n).mapToDouble((i) -> (Math.sqrt(i + qval) * 2 * Math.PI * i / 5))
					.toArray();
			double[] rzs = IntStream.range(0, n).mapToDouble((i) -> (Math.sqrt(i + qval) * 2 * Math.PI * i / 7))
					.toArray();

			for (int i = 0; i < n; i++) {
				ComplexMatrix rxmat = new RXGate(numQubits, q, rxs[i]).asMatrix();
				ComplexMatrix rymat = new RYGate(numQubits, q, rys[i]).asMatrix();
				ComplexMatrix rzmat = new RZGate(numQubits, q, rzs[i]).asMatrix();
				sv = sv.applyMatrix(rxmat);
				sv = sv.applyMatrix(rymat);
				sv = sv.applyMatrix(rzmat);
			}
		}

		System.out.println(sv);

	}

	private static void smallIdentityTest() {
		System.out.println("Expected result: 2x2 identity");

		QuantumGate qg = new IGate(1, 0);
		System.out.println(qg.asMatrix());
	}

	private static void largeIdentityTest() {
		System.out.println("Expected result: 4x4 identity");

		QuantumGate qg = new IGate(2, 0);
		System.out.println(qg.asMatrix());
	}

	private static void smallHadamardTest() {
		System.out.println("Expected result: standard Hadamard");
		QuantumGate qg = new HGate(1, 0);
		System.out.println(qg.asMatrix());
	}

	private static void mediumHadamardTest() {
		System.out.println("Expected result: 4x4, with Hadamard on second qubit");
		QuantumGate qg = new HGate(2, 1);
		System.out.println(qg.asMatrix());
	}

	private static void largeHadamardTest() {
		System.out.println("Expected result: 8x8, with Hadamard on second qubit");
		QuantumGate qg = new HGate(3, 1);
		System.out.println(qg.asMatrix());
	}

	private static void smallCNOTTest() {
		System.out.println("Expected result: 4x4, standard CNOT");
		QuantumGate qg = new CNOTGate(2, 0, 1);
		System.out.println(qg.asMatrix());
	}

	private static void smallCNOTTest2() {
		System.out.println("Expected result: 4x4, standard CNOT with bits switched");
		QuantumGate qg = new CNOTGate(2, 1, 0);
		System.out.println(qg.asMatrix());
	}

	private static void mediumCNOTTest() {
		System.out.println("Expected result: 8x8, I cross standard CNOT");
		QuantumGate qg = new CNOTGate(3, 0, 1);
		System.out.println(qg.asMatrix());
	}

	private static void mediumCNOTTest2() {
		System.out.println("Expected result: 8x8, standard CNOT cross I");
		QuantumGate qg = new CNOTGate(3, 1, 2);
		System.out.println(qg.asMatrix());
	}

	private static void mediumCNOTTest3() {
		System.out.println("Expected result: 8x8, CNOT on bits 2 and 0");
		QuantumGate qg = new CNOTGate(3, 2, 0);
		System.out.println(qg.asMatrix());
	}
}
