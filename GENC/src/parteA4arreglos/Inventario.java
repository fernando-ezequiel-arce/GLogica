package parteA4arreglos;

public class Inventario {
    
    private Producto[] productos;
    
    public Inventario(Producto[] productos) {
        this.productos = productos;
    }

    public void imprimirProductos() {
        for (Producto p : productos) {
            System.out.println(p.nombre + " - " + p.precio);
        }
    }
    
    private double calcularTotal() {
        double total = 0;

        for (Producto p : productos) {
            total += p.precio;
        }

        return total;
    }
    
    public void imprimirTotalTicket() {
    	System.out.println("El monto total del ticket es: " + calcularTotal());
    }
    
    private Producto productoMasCaro() {
        if (productos == null || productos.length == 0) {
            return null;
        }

        Producto masCaro = productos[0];

        for (Producto p : productos) {
            if (p.precio > masCaro.precio) {
                masCaro = p;
            }
        }

        return masCaro;
    }
    
    public void imprimirProductoMasCaro() {
        Producto p = productoMasCaro();

        if (p != null) {
            System.out.println(p.nombre + " - " + p.precio);
        }
    }
    
    
    
}