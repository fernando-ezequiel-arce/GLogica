package encapsulamiento;

//6.	Implementar la clase TarjetaBaja a partir de la siguiente declaración:

public class TarjetaBaja {
    private double saldoInicial;
    private int contador;
    private int contadorViajesEnColectivo;
    private int contadorViajesEnSubte;
    /**
     * post: saldo de la Tarjeta en saldoInicial.
     */
    public TarjetaBaja(double saldoInicial) {
    	this.saldoInicial = saldoInicial;
    	this.contador = 0;
    	this.contadorViajesEnColectivo = 0;
    	this.contadorViajesEnSubte = 0;
    	
    }

    /**
     * post: devuelve el saldo actual de la Tarjeta
     */
    public double obtenerSaldo() {
    	return saldoInicial;
    } 

    /**
     * post: agrega el monto al saldo de la Tarjeta.
     */
    public void cargar(double monto) { 
    	if (monto <= 0) {
    		throw new IllegalArgumentException("Este metodo permite agregar saldo no puede ser negativo ni 0");
    	}
    	 saldoInicial += monto;
    }

    /**
     * pre : saldo suficiente.
     * post: utiliza 21.50 del saldo para un viaje en colectivo.
     */
    public void pagarViajeEnColectivo() {    	
    	if (saldoInicial < 21.50) {
    		throw new IllegalStateException("Saldo insuficiente");
    	}
    	saldoInicial -= 21.50;
    	contador++;
    	contadorViajesEnColectivo++;
    }

    /**
     * pre : saldo suficiente.
     * post: utiliza 19.50 del saldo para un viaje en subte. 
     */
    public void pagarViajeEnSubte() {    
    	if (saldoInicial < 19.50) {
    		throw new IllegalStateException("Saldo insuficiente");
    	}
    	saldoInicial -= 19.50;
    	contador++;
    	contadorViajesEnSubte++;
    }

    /**
     * post: devuelve la cantidad de viajes realizados.
     */
    public int contarViajes() {
    	return contador;
    }

    /**
     * post: devuelve la cantidad de viajes en colectivo.
     */
    public int contarViajesEnColectivo() {
    	return contadorViajesEnColectivo;
    }

    /**
     * post: devuelve la cantidad de viajes en subte.
     */
    public int contarViajesEnSubte() { 
    	return contadorViajesEnSubte;
    }
}


