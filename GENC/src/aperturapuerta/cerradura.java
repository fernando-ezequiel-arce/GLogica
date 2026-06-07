package aperturapuerta;

class Cerradura {
	
	private int claveDeApertura;
	private int cantidadDeFallosConsecutivosQueLaBloquean;
	private boolean estaAbierta;
	private boolean estaBloqueada;
	private int contarFallosConsecutivos;
	private int contarFallos;
	private int contarExitosas;
		

    public Cerradura(int claveDeApertura,
                     int cantidadDeFallosConsecutivosQueLaBloquean) {    
    		if (!validarClave(claveDeApertura)) { 
    			throw new Error ("La clave valida debe ser mayor a 0 y menor 1000");    			
    		}
    		this.claveDeApertura = claveDeApertura;
    		if(!validarFallos(cantidadDeFallosConsecutivosQueLaBloquean)) {
    			throw new Error ("La cantidad de fallos validos esta entre 2 y 5 unicamente");
    		}
    	
    		this.cantidadDeFallosConsecutivosQueLaBloquean = cantidadDeFallosConsecutivosQueLaBloquean;
    		this.estaAbierta = false;
    		this.estaBloqueada = false;
    		this.contarFallosConsecutivos = 0;
    		this.contarFallos = 0;
    		this.contarExitosas = 0;
    }

    public boolean abrir(int clave) {
    	if (!validarClave(clave)) {
    		throw new Error ("La clave valida debe ser mayor a 0 y menor 1000");
    	}
    	if(estaAbierta) {
    		throw new Error("La cerradura ya esta abierta");
    	}
    	if(estaBloqueada) {
    		throw new Error ("La cerradura esta bloqueada");
    	}
    	if (claveDeApertura == clave) {
    		estaAbierta = true;
    		contarExitosas++;
    		contarFallosConsecutivos = 0;
    		return true;
    	} 
    	
         contarFallosConsecutivos++;
         contarFallos++;

         if (contarFallosConsecutivos >= cantidadDeFallosConsecutivosQueLaBloquean) {
                estaBloqueada = true;
         }
         return false;
        
    }

    public void cerrar() {
    	estaAbierta = false;
    }

    public boolean estaAbierta() {
    	return estaAbierta;
    }

    public boolean estaCerrada() {
    	return !estaAbierta;
    }

    public boolean fueBloqueada() {
    	return estaBloqueada;
    }

    public int contarAperturasExitosas() {
    	return contarExitosas;
    }
    

    public int contarAperturasFallidas() {
    	return contarFallos;
    }
    
    private boolean validarClave(int clave) {
    	return clave > 0 && clave < 1000;    		
    	
    }
    
    private boolean validarFallos(int fallos) {
    	return fallos > 1 && fallos < 6;
    }

}

