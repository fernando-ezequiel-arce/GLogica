package encapsulamiento;
public class Nota {
	private int valorInicial;

    /**
     * pre : valorInicial está comprendido entre 0 y 10.
     * post: inicializa la Nota con el valor indicado.
     */
    public Nota(int valorInicial) {
    	validar(valorInicial,"valorInicial está comprendido entre 0 y 10");
    	this.valorInicial = valorInicial;
    }
    
    /**
     * post: devuelve el valor numérico de la Nota,
     *       comprendido entre 0 y 10.
     */
    public int obtenerValor() {
    	return valorInicial;
    }
    
    /**
     * post: indica si la Nota permite o no la aprobación.
     */
    public boolean aprobado() {
    	return valorInicial >= 4;
    }
    
    /**
     * post: indica si la Nota implica desaprobación.
     */
    public boolean desaprobado() {
    	return valorInicial < 4;
    }
    
    
    private void validar(int valor, String mensaje) {
    	if (valor < 0 || valor > 10) {
    		throw new IllegalArgumentException(mensaje);
    	}
    	
    }
    
    


//2.	Agregar a la clase Nota el método:

    /**
     * pre : nuevoValor está comprendido entre 0 y 10.
     * post: modifica el valor numérico de la Nota, cambiándolo
     *       por nuevoValor, siempre y cuando nuevoValor sea superior al
     *       valor numérico actual de la Nota.
     */
    public void recuperar(int nuevoValor) {
    	validar( nuevoValor,"Esta comprendido entre 0 y 10");
    	if (nuevoValor > valorInicial) {
    		valorInicial = nuevoValor;
    	}
    	
    	
    }


}