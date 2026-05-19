package maratoncine;
 // titulo:String, genero:String y duracion:int
public class Pelicula {
	
	private String titulo;
	private String genero;
	private int duracion;
	
	public Pelicula(String titulo, String genero, int duracion) {
		
		String tituloNormalizado = normalizar(titulo);
		String generoNormalizado = normalizar(genero);
		
		if (!esTextoValido(tituloNormalizado)){
    		throw new Error ("Es titulo invalido");   	
    	}
		
		if (!esTextoValido(generoNormalizado)){
    		throw new Error ("Es genero invalido");   	
    	}
		if (!esDuracionValida(duracion)) {
    		throw new Error ("La duracion debe ser mayor a 0");
    	}
		
		this.titulo = tituloNormalizado;
		this.genero = generoNormalizado;
		this.duracion = duracion;
		
	}
	
	private String normalizar(String texto) {
		
		if (texto == null) return null;
		return texto.trim().replaceAll("\\s+", " ");
		
	    } 	    
	     
	    private boolean esTextoValido(String texto) {
	    	if (texto == null) return false;
	    	return texto.matches("[a-zA-ZáéíóúñÑ ]+");
	    }
	    
	    private boolean esDuracionValida(int valor) {
	    	return valor > 0;
	    }
	    
	    public String getTitulo() {
	        return titulo;
	    }

	    public String getGenero() {
	        return genero;
	    }

	    public int getDuracion() {
	        return duracion;
	    }        	
    
}


