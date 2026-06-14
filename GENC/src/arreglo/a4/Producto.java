package arreglo.a4;

public class Producto{
	
	private String nombre;
	private double precio;

   public Producto(String nombre, double precio) {

    if (nombre == null) {
        throw new IllegalArgumentException("El nombre no puede ser null");
    }

    if (!validarPrecio(precio)) {
        throw new IllegalArgumentException("El precio debe ser mayor que cero");
    }

    String nombreNormalizado = normalizarTexto(nombre);

    if (!validarTexto(nombreNormalizado)) {
        throw new IllegalArgumentException(
            "El texto solo recibe letras y un espacio entre palabras"
        );
    }

    this.nombre = nombreNormalizado;
    this.precio = precio;
   }

       
       private String normalizarTexto(String texto) {
    
    	   return  texto.trim().replaceAll("\\s+", " ");
       }
    	   
      
       
       private boolean validarTexto(String texto){
    	   return  texto.matches("[A-Za-z]+( [A-Za-z]+)*");
       }
       private boolean validarPrecio(double precio) {
    	   return precio > 0;
       }
       
       public String obtenerNombre() {
    	   return nombre;
       }
       
       public double obtenerPrecio() {
    	   return precio;
       }
       
       


}
