
//5.	Implementar la clase Cubo a partir de la siguiente interfaz:

public class Cubo {
	
	private double longitudLado;

    /**
     * pre : longitudLado es un valor mayor a 0.
     * post: inicializa el cubo a partir de la longitud de lado dada
     */
    public Cubo (double longitudLado) {
    	validar(longitudLado);
    	this.longitudLado = longitudLado;
    }

    /**
     * post: devuelve la longitud de todos los lados del cubo
     */
    public double obtenerLado() {
    	return longitudLado;
    	
    }
    
    /**
     * pre : longitudLado es un valor mayor a 0.
     * post: cambia la longitud de todos los lados del cubo
     */
    public void cambiarLado(double longitudLado) {
    	validar(longitudLado);
    	this.longitudLado = longitudLado;
    }
    
    /**
     * post: devuelve el área de la superficie de las caras del cubo
     */
    public double obtenerAreaCara() {
    	return longitudLado * longitudLado;
    }
    
    /**
     * pre: areaCara es un valor mayor a 0.
     * post: cambia el área de las caras del cubo
     */
    public void cambiarAreaCara(double areaCara) { 
    	validar(areaCara);
    	longitudLado = Math.sqrt(areaCara); 
    }

    /**
     * post: devuelve el volumen que encierra el cubo
     */
    public double obtenerVolumen() {
       return longitudLado * longitudLado * longitudLado;
    }

    /**
     * pre: volumen es un valor mayor a 0.
     * post: cambia el volumen del cubo
     */
    public void cambiarVolumen(double volumen) {
    	validar(volumen);
    	longitudLado = Math.cbrt(volumen);
    	
    }
    
    private void validar(double valor) {
    	if (valor <= 0) {
    		throw new IllegalArgumentException("El valor debe ser mayor a 0");
    	}
    }
}

