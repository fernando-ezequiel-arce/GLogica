package parteA4arreglos;

class Producto {
    String nombre;
    double precio;

    Producto(String nombre, double precio) {
    	
    	String normalizado = normalizar(nombre);
    	
    	if (!esTextoValido(normalizado)){
    		throw new Error ("Texto invalido");   	
    	}
    	
    	if (!esPrecioValido(precio)) {
    		throw new Error ("El precio es mayor a 0");
    	}
    	
        this.nombre = nombre;
        this.precio = precio;
    }
    
    private String normalizar(String texto) {
    	if (texto == null) return null;
    	 return texto.trim().replaceAll("\\s+", " ");    	
    }    
     
    private boolean esTextoValido(String texto) {
    	if (texto == null) return false;
    	return texto.matches("[a-zA-Z]+");
    }
    
    private boolean esPrecioValido(double valor) {
    	return valor > 0;
    }
    
} 