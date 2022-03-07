package Cuentas;

/**
 * Esta clase sirve para hacer operaciones con una cuenta
 * 
 * @author Jen
 * @version 1.0
 *
 */
public class CCuenta {


    private String nombre;
    private String cuenta;
    private double saldo;
    private double tipoInteres;

    public CCuenta()
    {
    }

    public CCuenta(String nom, String cue, double sal, double tipo)
    {
        setNombre(nom);
        setCuenta(cue);
        setSaldo(sal);
    }

    /**
     * Devuelve el saldo
     * @return saldo de la cuenta
     */
    public double estado()
    {
        return getSaldo();
    }
	/**
	 * Ingresa dinero
	 * @param cantidad Cantidad a ingresar
	 * @throws Exception 
	 */
    public void ingresar(double cantidad) throws Exception
    {
        if (cantidad<0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        setSaldo(getSaldo() + cantidad);
    }
	/**
	 * Retira dinero
	 * @param cantidad Cantidad a retirar
	 * @throws Exception
	 */
    public void retirar(double cantidad) throws Exception
    {
        if (cantidad <= 0)
            throw new Exception ("No se puede retirar una cantidad negativa");
        if (estado()< cantidad)
            throw new Exception ("No se hay suficiente saldo");
        setSaldo(getSaldo() - cantidad);
    }
    /**
     * Devuelve el nombre del titular
     * @return El nombre
     */

	public String getNombre() {
		return nombre;
	}
	/**
	 * Nombra al titular
	 * @param nombre Nombrr
	 */

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * Devuelve cuenta
	 * @return Cuenta
	 */
	public String getCuenta() {
		return cuenta;
	}
	/**
	 * Introduce cuenta
	 * @param cuenta Cuenta
	 */
	public void setCuenta(String cuenta) {
		this.cuenta = cuenta;
	}

	/**
	 * Devuelve saldo
	 * @return saldo
	 */
	public double getSaldo() {
		return saldo;
	}
	/**
	 * Introduce saldo
	 * @param saldo Saldo
	 */

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	/**
	 * Devuelve el tipo de interes
	 * @return interes
	 */

	public double getTipoInteres() {
		return tipoInteres;
	}
	/**
	 * Introduce el tipo de interes
	 * @param tipoInteres interes
	 */

	public void setTipoInteres(double tipoInteres) {
		this.tipoInteres = tipoInteres;
	}
}
