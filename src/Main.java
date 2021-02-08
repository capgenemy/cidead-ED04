/**
 * Clase Main
 * 
 * @category Ejercicios
 * @author AITOR GÓMEZ
 * @version 1.0
 */
public class Main {

	/**
	 * Método main de la clase Main
	 * 
	 * @param args Parámetros adicionales de método mail (no usados)
	 */
	public static void main(String[] args) {
		operativa_cuenta(2500);
	}

	/**
	 * Realiza una operativa concreta de lanzamiento de operaciones con cuencas
	 * 
	 * @param cantidad Cantidad
	 */
	private static void operativa_cuenta(float cantidad) {
		CCuenta cuenta1;
		double saldoActual;

		cuenta1 = new CCuenta("Antonio López", "1000-2365-85-1230456789", cantidad, 0);
		saldoActual = cuenta1.estado();
		System.out.println("El saldo actual es" + saldoActual);

		try {
			cuenta1.retirar(cantidad);
		} catch (Exception e) {
			System.out.print("Fallo al retirar");
		}
		try {
			System.out.println("Ingreso en cuenta");
			cuenta1.ingresar(cantidad);
		} catch (Exception e) {
			System.out.print("Fallo al ingresar");
		}
	}
}
