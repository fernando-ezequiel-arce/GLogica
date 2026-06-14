package arreglo.a4;

public class Comercio {
	
	private Producto [] a;
	
	public Comercio(Producto[] a) {
		this.a = a;
		
	}
	
	public void recorreArreglo() {
		 for (Producto producto : a) {
		        System.out.println(
		            "Nombre: " + producto.obtenerNombre() +
		            ", Precio: " + producto.obtenerPrecio()
		        );
		    }
		}
	private double sumaCarrito() {
		double suma = 0;
		for (Producto producto : a) {
			suma += producto.obtenerPrecio();
		}
		return suma;
	}
	
	public void imprimirSumaTotal() {
		System.out.println("La suma del carrito es: "+ sumaCarrito());
	}
	
	private Producto precioMasCaro() {
		Producto productoMasCaro = a [0];
		for (Producto producto : a) {
			if (producto.obtenerPrecio() > productoMasCaro.obtenerPrecio()) {
				productoMasCaro = producto;
			}
		}
		return productoMasCaro;
	}
	
	public void imprimirProductoMasCaro() {
	    Producto p = precioMasCaro();
	    System.out.println("El producto mas caro es: " + p.obtenerNombre());
	}
	
	public void cambiarPrecioPan(double nuevoPrecio) {
		 if (!validarPrecio(nuevoPrecio)) {
	            throw new IllegalArgumentException("El precio debe ser mayor que cero");
	        }
	    for (Producto producto : a) {
	        if (producto.obtenerNombre().equalsIgnoreCase("pan")) {
	            producto.cambiarPrecio(nuevoPrecio);
	            return;
	        }
	    }
	}
	
	 private boolean validarPrecio(double precio) {
		 return precio > 0;
	       
	    }
	
}
	


