package bootcamp9;

import java.util.List;
import java.util.Optional;

public class Cadenas {

	/***
	 * Cantidad palabras terminadas en a
	 * 
	 * @param lista
	 * @param letra
	 * @return resultado como entero
	 */
	public static int contadorFinalStream(List<String> lista, String letra) {
		return (int) lista.stream().filter((s) -> s.endsWith(letra)).count();
	}

	/***
	 * Cantidad palabras terminadas en a
	 * 
	 * @param lista
	 * @param letra
	 * @return resultado como entero
	 */
	public static int contadorInicialStream(List<String> lista, String letra) {
		return (int) lista.stream().filter((s) -> s.startsWith(letra)).count();
	}

	/***
	 * Cantidad palabras terminadas en a
	 * 
	 * @param lista
	 * @return true si no hay items en blanco
	 */
	public static boolean verificar(List<String> lista) {
		return lista.stream().map(String::trim).noneMatch(String::isBlank);
	}

	/***
	 * Concatenacion de las palabras
	 * 
	 * @param lista
	 * @return la lista concatenada
	 */
	public static Optional<String> concat(List<String> lista) {
		return lista.stream().reduce((a, b) -> a + b);
	}

	/***
	 * Concatenacion de las palabras
	 * 
	 * @param lista
	 * @return la lista concatenada en minusculas
	 */
	public static Optional<String> concatMinusculas(List<String> lista) {
		return lista.stream().map(String::toLowerCase).reduce((a, b) -> a + b);
	}
}
