package bootcamp9;

import static org.junit.jupiter.api.Assertions.*;

import java.util.*;

import org.junit.jupiter.api.Test;

class MathTest {
	private List<Integer> _lista = Arrays.asList(10, 10, 5);

	@Test
	void testSum() {
		assertEquals(2, Math.sum(1, 1));
	}

	@Test
	void testDivide() {
		assertEquals(5, Math.divide(10, 2));
	}

	@Test
	void testSumaStream() {
		assertEquals(25, Math.sumStream(_lista));
	}

	@Test
	void testProductoStream() {
		assertEquals(500, Math.producStream(_lista));
	}
	@Test
	void testContadorStream() {
		assertEquals(3, Math.contadorStream(_lista));
	}
}
