package calculadora;

public class Calculador {

	public static double calcularPromedio(int[] nums) throws Exception {

		if (nums == null) {
			throw new Exception("nums nulo");
		}
		double promedio = 0;
		for (int i = 0; i < nums.length; i++) {
			promedio = promedio + nums[i];
		}
		return promedio / nums.length;

	}

	public static double calcular2() throws Exception {
		int[] n = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		n = null;
		double result = 0;
		try {
			result = calcularPromedio(n);
		} catch (Exception e) {
			System.out.println("UY!:" + e.getMessage());
			//e.printStackTrace(); //Muestra el StackTrace y sigue el programa
			result = -400;
		}
		return result;

	}
}
