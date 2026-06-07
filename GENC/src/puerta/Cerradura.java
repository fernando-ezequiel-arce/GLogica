package puerta;


class Cerradura {

	private String claveDeApertura;
	private int cantidadDeFallosConsecutivosQueLaBloquean;
	private boolean abierta;
	private boolean bloqueada;
	private int aperturasExitosas;
	private int aperturasFallidas;
	private int fallosConsecutivos;
	
    public Cerradura(String claveDeApertura,
                     int cantidadDeFallosConsecutivosQueLaBloquean) {
    	
    		if (!claveValida(claveDeApertura)) {    			
    			throw new IllegalArgumentException("Debe ser tres digitos entre 000 y 999");
    		}
    		if (!aperturasValidas(cantidadDeFallosConsecutivosQueLaBloquean)) {
    			throw new IllegalArgumentException("Se puede optar entre 2 a 5 fallos");
    		}
    		
    	
    	this.claveDeApertura = claveDeApertura;
    	this.cantidadDeFallosConsecutivosQueLaBloquean = cantidadDeFallosConsecutivosQueLaBloquean;
    	this.abierta = false;
    	this.bloqueada = false;
    	
    }

    public boolean abrir(String clave) {

        if (!claveValida(clave)) {
            throw new IllegalArgumentException("Debe ser tres digitos entre 000 y 999");
        }

        if (abierta) {
            throw new IllegalStateException("La cerradura ya esta abierta");
        }

        if (bloqueada) {
            throw new IllegalStateException("La cerradura esta bloqueada");
        }

        if (claveDeApertura.equals(clave)) {
            abierta = true;
            aperturasExitosas++;
            fallosConsecutivos = 0; // vuelve a cero
            return true;
        }

        //  falló
        aperturasFallidas++;
        fallosConsecutivos++;

        if (fallosConsecutivos >= cantidadDeFallosConsecutivosQueLaBloquean) {
            bloqueada = true;
        }

        return false;
    }

   public void cerrar() {
	   if (!abierta) {
		   throw new IllegalStateException("La cerradura ya esta cerrada");
	   }
	   abierta = false;
   }

    public boolean estaAbierta() {
    	return abierta;
    }

    public boolean estaCerrada() {
    	return !abierta;
    }

    public boolean fueBloqueada(){
    	return bloqueada;
    }
    
    

   public int contarAperturasExitosas() {
	   return aperturasExitosas;
   }

  public int contarAperturasFallidas() {
	  return aperturasFallidas;
	  
  }
    

   private boolean claveValida(String clave) {
    	        return clave != null && clave.matches("\\d{3}");
    	    }
    
   private boolean aperturasValidas(int aperturas) {
	    return aperturas >= 2 && aperturas <= 5;
	}
   
   public static void main (String [] args) {
	   Cerradura puerta = new Cerradura("876",2);
	   puerta.abrir("876");
   }
   
}



