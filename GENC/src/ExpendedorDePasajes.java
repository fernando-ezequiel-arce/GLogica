// 10.	Implementar la clase ExpendedorDePasajes con los siguientes métodos. Indique axiomas de la clase, pre y post condiciones de los métodos.}

 /** Aximoas:
 * precioPorKm > 0
 * contadorPasajesVendidos ≥ 0
 * distanciaMaxima ≥ 0
 * sumadorDeDistancia ≥ 0
 * Si contadorPasajesVendidos == 0 entonces:
 * distanciaMaxima == 0
 * sumadorDeDistancia == 0
 * distanciaMaxima es la mayor distancia registrada entre todos los pasajes vendidos
 * sumadorDeDistancia es la suma de todas las distancias vendidas
 * @author Windbaires
 *
 */

public class ExpendedorDePasajes {
	
	private double precioPorKm;
	private int contadorPasajesVendidos;
	private double distanciaMaxima;
	private double sumadorDeDistancia;
	
	/**
	 * Pre: precioPorKm > 0
	 * Post: this.precioPorKm = precioPorKm
	 * contadorPasajesVendidos = 0
	 *  distanciaMaxima = 0sumadorDeDistancia = 0
	 *  
	 * @param precioPorKm
	 */
	 

    public ExpendedorDePasajes(double precioPorKm) {
    	validar(precioPorKm, "El precio por km es mayor a 0");
    	this.precioPorKm = precioPorKm;
    
    	contadorPasajesVendidos = 0;
    	distanciaMaxima = 0;
    	sumadorDeDistancia = 0;
    }
    
   /**
    * Pre: distanciaEnKm > 0
    * Post: contadorPasajesVendidos aumenta en 1
    * sumadorDeDistancia aumenta en distanciaEnKm
    * distanciaMaxima se actualiza si distanciaEnKm es mayor
    * Retorna: precioPorKm * distanciaEnKm
    * 
    * @param distanciaEnKm
    * @return
    */
    

    public double venderPasaje(double distanciaEnKm) {
    	validar(distanciaEnKm, "La distancia en km es mayor a 0");
    	contadorPasajesVendidos++;
    	if (  distanciaEnKm > distanciaMaxima ) {
    		distanciaMaxima = distanciaEnKm;
    	}
    	sumadorDeDistancia += distanciaEnKm;
    	return precioPorKm * distanciaEnKm;
    	
    }
    
    /**
     * 
     * Pre: cantidad > 0
     * distanciaEnKm > 0
     * 
     * Post:
     * contadorPasajesVendidos aumenta en cantidad
     * sumadorDeDistancia aumenta en cantidad * distanciaEnKm
     * distanciaMaxima se actualiza si corresponde
     * Retorna: cantidad * precioPorKm * distanciaEnKm
     * 
     * @param cantidad
     * @param distanciaEnKm
     * @return
     */

    public double venderPasajes(int cantidad, double distanciaEnKm){
    	validar(cantidad, "La cantidad de pasajes vendidos es mayor a 0"); 
    	validar(distanciaEnKm, "La distancia en km es mayor a 0");
    	
    	contadorPasajesVendidos += cantidad;
    	if ( distanciaEnKm > distanciaMaxima) {
    		distanciaMaxima = distanciaEnKm;
    	}
    	sumadorDeDistancia += (distanciaEnKm * cantidad);
    	return cantidad * distanciaEnKm * precioPorKm;
    			
    }
    
    /**
     * Pre:contadorPasajesVendidos > 0
     * 
     * Post:
     * Retorna contadorPasajesVendidos
     *   
     * @return
     */

    public int contarPasajesVendidos() {
    	if (contadorPasajesVendidos == 0) {
    		throw new IllegalStateException("No hay pasajes para vendidos para contar");
    	}
    	return contadorPasajesVendidos;
    }
    
    /**
     * Pre:
     * contadorPasajesVendidos > 0
     * 
     * Post:
     * Retorna distanciaMaxima
     * 
     * @return
     */
    

    public double obtenerDistanciaMaxima() {
    	if (distanciaMaxima == 0) {
    		throw new IllegalStateException("Todavia no se vendio ningun pasaje");
    		
    	}
    	return distanciaMaxima;
    }
    
    /**
     * Pre:
     * contadorPasajesVendidos > 0
     * 
     * Post:
     * 
     * Retorna sumadorDeDistancia / contadorPasajesVendidos
     * @return
     */

    public double calcularDistanciaPromedio() {
    	if (contadorPasajesVendidos == 0) {
    		throw new IllegalStateException("Al no tener pasajes vendidos no puedo calcular el promedio");
    	}
    	return sumadorDeDistancia / contadorPasajesVendidos;
    	
    }
    
    /**
     * Post:
     * 
     * Retorna sumadorDeDistancia * precioPorKm
     * 
     * @return
     */

    public double calcularVentaTotal() {
    	return sumadorDeDistancia * precioPorKm;
    }
    
    private void validar(double valor, String mensaje) {
    	if (valor <=0) {
    		throw new IllegalArgumentException(mensaje);
    	}
    }
}

