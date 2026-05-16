package encapsulamiento;

// 8.	Implementar la clase  CajaDeAhorro con la siguiente interfaz:

public class CajaDeAhorro {
	
	private double saldo;
	private String titularDeLaCuenta;

    /**
     * post: la instancia queda asignada al titular indicado
     *   	    y con saldo igual a 0.
     */
    public CajaDeAhorro(String titularDeLaCuenta) {
    	validarString(titularDeLaCuenta);
    	saldo = 0;
    	this.titularDeLaCuenta = titularDeLaCuenta.trim();
    }
    	
    
    /**
     * post: devuelve el nombre del titular de la Caja de Ahorro.
     */
    public String obtenerTitular() {
    	return titularDeLaCuenta;
    }

    /**
     * post: devuelve el saldo de la Caja de Ahorro.
     */
    public double consultarSaldo() { 
    	return saldo;
    }

    /**
     * pre : monto es un valor mayor a 0.
     * post: aumenta el saldo de la Caja de Ahorro según el monto
     *       depositado.  
     */
    public void depositar(double monto) {
    	if (monto <= 0) {
    		throw new IllegalArgumentException("monto es un valor mayor a 0");
    	}
    	saldo += monto;
    	
    }
 
    /**
     * @monto: la cantidad de dinero a extraer de la cuenta.
     * pre : monto es mayor a 0 y menor o igual que el saldo de la
     *       Caja de Ahorro.
     * post: disminuye el saldo de la Caja de Ahorro según el monto
     *       extraído.
     */
    public void extraer(double monto) {
    	if(monto <= 0) {
    		throw new IllegalArgumentException("El monto debe ser mayor a 0");
       	}
    	if ( monto > saldo) {
    		throw new IllegalStateException("El saldo no puede ser negativo");
    	}
    	saldo -= monto;
    }
    
    private void validarString(String titularDeLaCuenta) {
	    if (titularDeLaCuenta == null || !titularDeLaCuenta.trim().matches("[a-zA-Z]+ [a-zA-Z]+")) {
	        throw new IllegalArgumentException
	        ("Es valido letras [a-zA-Z] y un solo espacio, no puede no haber dato");
	    }
	}
}




