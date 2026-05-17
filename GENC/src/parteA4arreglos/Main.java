package parteA4arreglos;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Producto[] productos = {
			    new Producto("leche", 150.0),
			    new Producto("pan", 80.0),
			    new Producto("queso", 420.0),
			    new Producto("yogur", 95.0)
			};
		
		Inventario lista = new Inventario(productos);
		
		lista.imprimirProductos();
		lista.imprimirTotalTicket();
		lista.imprimirProductoMasCaro();
		
		productos[1].precio = 90.0;
		
		// accediendo por índice directamente en el  main
		
		lista.imprimirProductos();
		lista.imprimirTotalTicket();
	}

}
