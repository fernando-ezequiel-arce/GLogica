package pasajes;

class ExpendedorDePasajes {
	
	private double precioPorKm;
	private int contador;
	private double sumaDistancia;
	private double distanciaMaxima;

    public ExpendedorDePasajes(double precioPorKm) {
    	if (!valido(precioPorKm)) {
    	    throw new IllegalArgumentException("Tiene que ser mayor que 0");
    	}
    	this.precioPorKm = precioPorKm;
    	this.contador = 0;
    	this.sumaDistancia = 0;
    	this.distanciaMaxima = 0;
    	
    }
    
    public double venderPasaje(double distanciaEnKm) { 
    	if (!valido (distanciaEnKm)) {
    		 throw new IllegalArgumentException("Tiene que ser mayor que 0");
    	}    	
    	contador++;
    	sumaDistancia += distanciaEnKm;
    	if (distanciaEnKm > distanciaMaxima ) {
    		distanciaMaxima = distanciaEnKm;
    	}
    	return precioPorKm * distanciaEnKm;
    }

    public double venderPasajes(int cantidad, double distanciaEnKm) {
    	if (!valido (distanciaEnKm)) {
   		 throw new IllegalArgumentException("Tiene que ser mayor que 0");
   	     }
    	if (!cantidadValida(cantidad)) {
    		throw new IllegalArgumentException("Tiene que ser mayor que 0");	
    	}
    	contador += cantidad ;
    	sumaDistancia += (cantidad * distanciaEnKm);
    	if (distanciaEnKm > distanciaMaxima ) {
    		distanciaMaxima = distanciaEnKm;
    	}
    	return cantidad * distanciaEnKm * precioPorKm;
    }

    public int contarPasajesVendidos() {
    	return contador;
    }

    public double obtenerDistanciaMaxima() {
    	return distanciaMaxima;
    	
    }

    public double calcularDistanciaPromedio() {
    	if (contador == 0) {
    		throw new IllegalStateException("No puede ser 0");
    	}
    	return sumaDistancia / contador;
    	
    }

    public double calcularVentaTotal() {
    	return sumaDistancia * precioPorKm;
    }
    
    private boolean cantidadValida(int valor) {
    	return valor > 0;
  }          
    
    private boolean valido(double valor) {
        return valor > 0;
    }
}
