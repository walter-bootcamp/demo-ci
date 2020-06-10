package bootcamp9;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.IntStream;

public class Math {
	/***
	 * Suma de 2 enteros
	 * 
	 * @param x
	 * @param y
	 * @return resultado como entero
	 */
	public static int sum(int x, int y) {
		return x + y;
	}

	/***
	 * Division de 2 enteros
	 * 
	 * @param x
	 * @param y
	 * @return resultado como entero
	 */
	public static int divide(int x, int y) {
		return (int) x / y;
	}

	/***
	 * Suma de enteros utilizando Stream
	 * 
	 * @param x
	 * @param y
	 * @return resultado como entero
	 */
	public static int sumStream(List<Integer> lista) {
		return lista.stream().reduce(0, (a, b) -> a + b);
	}
	/***
	 * Producto de enteros utilizando Stream
	 * 
	 * @param x
	 * @param y
	 * @return resultado como entero
	 */
	public static int producStream(List<Integer> lista) {
		return lista.stream().reduce(1, (a, b) -> a * b);
	}
	/***
	 * Cantidad items en la lista
	 * 
	 * @param x
	 * @param y
	 * @return resultado como entero
	 */
	public static int contadorStream(List<Integer> lista) {
		return (int) lista.stream().count();
	}
}
