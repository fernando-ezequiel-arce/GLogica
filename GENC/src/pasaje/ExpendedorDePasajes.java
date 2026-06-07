package pasaje;

class ExpendedorDePasajes {
	
	private double precioPorKm;
	private int cantidadPasajesVendidos;
	private double distanciaMaxima;
	private double distanciaTotal;

    public ExpendedorDePasajes(double precioPorKm) {
    	if(!validar(precioPorKm)) {
    		throw new Error ("El precio por km debe ser mayor a 0");
    	}
    	
    	this.precioPorKm = precioPorKm;
    	this.cantidadPasajesVendidos = 0;
    	this.distanciaMaxima = 0;
    }
 
    public double venderPasaje(double distanciaEnKm) {
    	if (!validar(distanciaEnKm)) {
    		throw new Error ("La distancia en km debe ser mayor a 0");
    	}
    	if (distanciaEnKm > distanciaMaxima) {
    		distanciaMaxima = distanciaEnKm;
    	}
    	cantidadPasajesVendidos++;
    	distanciaTotal += distanciaEnKm;
    	return precioPorKm * distanciaEnKm;
    }

    public double venderPasajes(int cantidad, double distanciaEnKm) {
    	if(!validarEnteros(cantidad)){
    		throw new Error ("La cantidad de pasajes debe ser mayor a 0");
    	}
    	if (!validar(distanciaEnKm)) {
    		throw new Error ("La distancia en km debe ser mayor a 0");
    	}
    	if (distanciaEnKm > distanciaMaxima) {
    		distanciaMaxima = distanciaEnKm;
    	}
    	cantidadPasajesVendidos += cantidad;
    	distanciaTotal += (cantidad * distanciaEnKm);
    	return cantidad * precioPorKm * distanciaEnKm;
    	
    }

    public int contarPasajesVendidos() {    	
    	return cantidadPasajesVendidos;
    }

    public double obtenerDistanciaMaxima(){
    	return distanciaMaxima;
    }

    public double calcularDistanciaPromedio() {
    	if (cantidadPasajesVendidos == 0) {
    		throw new Error ("No se puede aplicar metodo si no se vendieron pasajes");
    	}
    	return distanciaTotal / cantidadPasajesVendidos;
    }

    public double calcularVentaTotal() {
    	return distanciaTotal * precioPorKm;
    }
    
    private boolean validar(double valor) {
    	return valor > 0; 
    	
    }
     private boolean validarEnteros(int valor) {
    	 return valor > 0;
     }
}
