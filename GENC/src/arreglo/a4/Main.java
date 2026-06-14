package arreglo.a4;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Producto[] productos = {
			    new Producto("leche", 150.0),
			    new Producto("pan", 80.0),
			    new Producto("queso", 420.0),
			    new Producto("yogur", 95.0)
			};
		Comercio arreglo = new Comercio(productos);
		arreglo.recorreArreglo();
		arreglo.imprimirSumaTotal();
		arreglo.imprimirProductoMasCaro();
		arreglo.cambiarPrecioPan(90);
		arreglo.recorreArreglo();
		arreglo.imprimirSumaTotal();

	}

}
