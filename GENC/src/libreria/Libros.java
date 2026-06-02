package libreria;

public class Libros {
	
	 int cantidadPaginas;
	 String nombre;
	
	public Libros(int cantidadPaginas, String nombre) {
		this.cantidadPaginas = cantidadPaginas;
		this.nombre = nombre;
	}
	
	public int obtenerNumeroPaginas() {
		return cantidadPaginas;
	}
	
	public String obtenerNombre() {
		return nombre;
	}

}
