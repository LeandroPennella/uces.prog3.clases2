package calculadora;

import excepciones.MiException;

public class Calculador {

	public static double calcular2() throws MiException {
		String[] n = new String[] { "1", "hola" };
		// n = null;
		double result;
		try {
			result = calcularPromedio(n);
		} catch (MiException e) {
			System.out.println(e.getMessage());
			result = -100;
			e.printStackTrace();
		} catch (NumberFormatException e) {
			System.out.println(e.getMessage());
			result = -200;
			e.printStackTrace();
		} catch (RuntimeException e) { /*
										 * Primero va la runtime porque es mas
										 * específica
										 */
			e.printStackTrace();
			result = -300;
		} catch (Exception e) {
			System.out.println("UY!:" + e.getMessage());
			e.printStackTrace(); //Muestra el StackTrace y sigue el programa
			result = -400;
		}
		return result;

	}

	public static double calcularPromedio(String[] nums) throws MiException {

		if (nums == null) {
			throw new MiException("nums nulo");
		}
		double promedio = 0;

		for (int i = 0; i < nums.length; i++) {
			try {
				promedio = promedio + Integer.parseInt(nums[i]);
			} catch (NumberFormatException e) {
				throw new MiException("No se puede parsear", e);/*
																 * Envolvemos en
																 * otra
																 * exception
																 * donde creemos
																 * que puede
																 * suceder la
																 * excepcion
																 */
			}

		}

		return promedio / nums.length;

	}
}
