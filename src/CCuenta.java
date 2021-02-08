/**
 * Clase Cuenta
 * 
 * @author AITOR GÓMEZ
 * @version 1.0
 */
public class CCuenta {

	// Nombre de la cuenta
	private String nombre;
	// Numero de la cuenta
	private String cuenta;
	// Saldo de la cuenta
	private double saldo;
	// Tipo de interés de la cuenta
	private double tipoInteres;

	/**
	 * Constructor de clase Cuenta vacio 
	 */
	public CCuenta() {
	}

	/**
	 * Constructor de clase Cuenta con parámetros múltiples
	 * 
	 * @param nom  Nombre
	 * @param cue  Cuenta
	 * @param sal  Saldo
	 * @param tipo Tipo
	 */
	public CCuenta(String nom, String cue, double sal, double tipo) {
		nombre = nom;
		cuenta = cue;
		saldo = sal;
	}

	/**
	 * Getter de Estado que existía de antemano
	 * 
	 * @return Devuelve el estado
	 */
	public double estado() {
		return saldo;
	}

	/**
	 * Ingresa una cantidad en la cuenta
	 * 
	 * @param cantidad Cantidad a ingresar
	 * @throws Exception Excepción que forzaremos en caso de que el saldo sea
	 *                   negativo
	 */
	public void ingresar(double cantidad) throws Exception {
		if (cantidad < 0)
			throw new Exception("No se puede ingresar una cantidad negativa");
		saldo = saldo + cantidad;
	}

	/**
	 * Retira una cantidad de la cuenta
	 * 
	 * @param cantidad Cantidad a retirar
	 * @throws Exception Excepción que forzaremos en condiciones de negatividad o
	 *                   insuficiencia de saldo
	 */
	public void retirar(double cantidad) throws Exception {
		if (cantidad <= 0)
			throw new Exception("No se puede retirar una cantidad negativa");
		if (estado() < cantidad)
			throw new Exception("No hay suficiente saldo");
		saldo = saldo - cantidad;
	}

	/**
	 * Getter del nombre
	 * 
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * Setter del nombre
	 * 
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * Getter de la cuenta
	 * 
	 * @return the cuenta
	 */
	public String getCuenta() {
		return cuenta;
	}

	/**
	 * Setter de la cuenta
	 * 
	 * @param cuenta the cuenta to set
	 */
	public void setCuenta(String cuenta) {
		this.cuenta = cuenta;
	}

	/**
	 * Getter del saldo
	 * 
	 * @return the saldo
	 */
	public double getSaldo() {
		return saldo;
	}

	/**
	 * Setter del saldo
	 * 
	 * @param saldo the saldo to set
	 */
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	/**
	 * Getter del tipo de interés
	 * 
	 * @return the tipoInteres
	 */
	public double getTipoInteres() {
		return tipoInteres;
	}

	/**
	 * Setter del tipo de interés
	 * 
	 * @param tipoInteres the tipoInteres to set
	 */
	public void setTipoInteres(double tipoInteres) {
		this.tipoInteres = tipoInteres;
	}

}
