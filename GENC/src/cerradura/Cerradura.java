package cerradura;

// 9.	Implementar la clase Cerradura con los siguientes métodos. Indique axiomas de la clase, pre y post condiciones de los métodos.
// Cuando una Cerradura se bloquea no puede volver a abrirse nunca más. 

/** Estos deben cumplirse siempre (Axiomas):

La clave es válida:
0 ≤ claveDeApertura ≤ 9999
La cantidad de fallos consecutivos para bloquear es válida:
1 ≤ cantidadDeFallosConsecutivosQueLaBloquean ≤ 5
Consistencia de estados:
Estado inicial:
estaAbierta = false
bloqueada = false
Consistencia de estados:
estaAbierta = true, false
estaCerrada = !estaAbierta
contadorDeFallosConsecutivos ≥ 0
contarAperturasExitosas ≥ 0
contarAperturasFallidas ≥ 0
Irreversibilidad del bloqueo:
bloqueada entonces siempre bloqueada
(una vez true, nunca vuelve a false)
**/

public class Cerradura {
	
	private int claveDeApertura; //Variables Instancias o Atributos	
	private int cantidadDeFallosConsecutivosQueLaBloquean;
	private boolean estaAbierta;
	private int contadorDeFallosConsecutivos;
	private boolean bloqueada;
	private int contarAperturasExitosas;
	private int contarAperturasFallidas;
	
	/**Pre: claveDeApertura  hasta 4 digitos mayores o iguales que cero y menores 10000.
	 *      la cantidad de fallos consecutivos es numero mayor a cero y menor a 6.
	 *      La cerradura se inicializa cerrada.
	 * Post:
	 * estaAbierta = false
     * estaCerrada = true
     * bloqueada = false
     * contadorDeFallosConsecutivos = 0
     * contarAperturasExitosas = 0
     *  contarAperturasFallidas = 0
	 *      
	 * @param claveDeApertura
	 * @param cantidadDeFallosConsecutivosQueLaBloquean
	 */

    public Cerradura(int claveDeApertura,
                     int cantidadDeFallosConsecutivosQueLaBloquean) {
    	
    	if (!esClaveValida(claveDeApertura)) {
    	    throw new Error("Clave inválida");
    	}
    	
    	
    	if (cantidadDeFallosConsecutivosQueLaBloquean >= 6 || cantidadDeFallosConsecutivosQueLaBloquean <= 0) {
    		throw new Error ("la cantidad de fallos consecutivos es numero mayor a cero y menor a 6");
    	}
    	// para lanzar excepciones tratarlas y no la hacemos, entonces lanzo error
    	this.claveDeApertura = claveDeApertura;
    	this.cantidadDeFallosConsecutivosQueLaBloquean = cantidadDeFallosConsecutivosQueLaBloquean;
    	this.estaAbierta = false;
    	this.bloqueada = false;
    	this.contadorDeFallosConsecutivos = 0;
    	this.contarAperturasExitosas = 0;
    	this.contarAperturasFallidas = 0;
    	
    	
    }
    
    private boolean esClaveValida(int clave) {
    	boolean esValida = true;
    	if (clave > 9999 || clave < 0) {
    		//throw new Error("hasta 4 digitos mayores o iguales que cero y menores 10000.");
    	    esValida = false;
    	}
    	return esValida;
    	
    } //para validar uso booleano tratar de usar un solo return
    // pinto / boton derecho / refactor / rename "me lo cambia en todos lados"
    // me cambia toda la semantica
    
    //un booleano para validar una clave
    /**
     * pre: La cerradura no debe estar bloqueada
     * La cerradura no debe estar abierta
     * 0 ≤ clave ≤ 9999 //esto fue invento 
     * 
     * post: 
     * Si la clave es correcta:
     * estaAbierta = true
     * estaCerrada = !estaAbierta
     * contadorDeFallosConsecutivos = 0
     * contarAperturasExitosas++
     * 
     * Si la clave es incorrecta:
     * estaAbierta no cambia
     * estaCerrada no cambia
     * contadorDeFallosConsecutivos++
     * contarAperturasFallidas++
     * 
     * Si se alcanza el límite de intentos fallidos consecutivos que la bloquean
     * bloqueada = true
     * 
     * @param clave
     * @return
     */
    

    public boolean abrir(int clave) {
    	
    	if (bloqueada) {
    		throw new Error("La cerradura esta bloqueada");   		
    	}
    	if (estaAbierta) {
    		throw new Error("La cerradura ya esta abierta");
    	}   	  	
    	    	
    	
    	if (!esClaveValida(clave)) {
    		throw new Error ("La clave es invalida"); //El error lo lanzo en el metodo
    	}
    	if (claveDeApertura != clave) {
    	    contadorDeFallosConsecutivos++;
    	    contarAperturasFallidas++;

    	    if (contadorDeFallosConsecutivos == cantidadDeFallosConsecutivosQueLaBloquean) {
    	        bloqueada = true;
    	    }

    	    return false;
    	}
    	
    	
    	contarAperturasExitosas++;
    	contadorDeFallosConsecutivos = 0;
    	estaAbierta = true;
        		return true;   	 
    	    	
    }
    /**
     * pre: La cerradura no debe estar bloqueada
     * La cerradura debe estar abierta (estaAbierta = true)
     * 
     * post: estaAbierta = false
     * estaCerrada = true
     */

    public void cerrar() {
    	if (bloqueada) {
    		throw new Error("La cerradura fue bloqueda");
    	}
    	
    	if (!estaAbierta) {
    		throw new Error("La cerradura ya esta cerrada");
    	}
    	estaAbierta = false;
    	}
    
    /**
     * 
     * @return 
     */

    public boolean estaAbierta() {
    	return estaAbierta;
    }
    
    /**
     * 
     * @return
     */

    public boolean estaCerrada() {
    	return !estaAbierta();
    }
    
    /**
     * 
     * @return
     */

    public boolean fueBloqueada() {
    	
    	
    	return bloqueada;
    		
    	
    }
    
    /**
     * 
     * @return
     */

    public int contarAperturasExitosas() {
    	return contarAperturasExitosas;
    }
    
    /**
     * 
     * @return
     */

    public int contarAperturasFallidas() {
    	return contarAperturasFallidas;
    }

}

