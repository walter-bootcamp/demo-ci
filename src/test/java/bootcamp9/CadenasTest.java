package bootcamp9;

import static org.junit.jupiter.api.Assertions.*;

import java.util.*;

import org.junit.jupiter.api.Test;

class CadenasTest {
	private List<String> _lista = Arrays.asList("Copaco", "Tigo", "Fibra", "Personal", "Vox", "Pesimo", "Servicio");

	@Test
	void testContadorFinalStream() {
		assertEquals(4, Cadenas.contadorFinalStream(_lista, "o"));
	}

	@Test
	void testContadorInicialStream() {
		assertEquals(2, Cadenas.contadorInicialStream(_lista, "P"));
	}

	@Test
	void testVerificar() {
		assertTrue(Cadenas.verificar(_lista));
	}
	@Test
	void testConcat() {
		assertEquals("CopacoTigoFibraPersonalVoxPesimoServicio", Cadenas.concat(_lista).get());
	}
	@Test
	void testConcatMinusculas() {
		assertEquals("copacotigofibrapersonalvoxpesimoservicio", Cadenas.concatMinusculas(_lista).get());
	}

}
