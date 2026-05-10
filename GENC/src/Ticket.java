
// 7.	Implementar la clase Ticket a partir de la siguiente interfaz

public class Ticket {
	
	private double importe;
	private boolean abierto;
	private boolean descuentoAplicado;
	private int contadorProductos;
	

    /**
     * post: el Ticket se inicializa con importe 0.
     */
    public Ticket() {
    	this.importe = 0;
    	this.abierto = true;
    	this.descuentoAplicado = false;
    	this.contadorProductos = 0;
    }

    /**
     * pre : cantidad y precio son mayores a cero. El ticket está abierto.
     * post: suma al Ticket un item a partir de la cantidad de
     *       de productos y su precio unitario.
     */
    public void agregarItem(int cantidad, double precioUnitario) {
    	double item = 0;
    	if (!abierto) { 
    		throw new IllegalStateException ("El ticket esta cerrado");
    	}
    		
        if (cantidad <= 0  || precioUnitario <= 0) { 
    			throw new IllegalArgumentException("cantidad y precio son mayores a cero");
    			
    	}
        
    	item = cantidad * precioUnitario;
	
    	importe += item;
    	
    	contadorProductos += cantidad;
    	
    }

    /**
     * pre : está abierto y no se ha aplicado un descuento previamente.
     * post: aplica un descuento sobre el total del importe.
     */
    public void aplicarDescuento(double porcentaje) {
    	
    	
    	if (!abierto) {
    		throw new IllegalStateException("El ticket esta cerrado");
       	}
    	
    	if (porcentaje <= 0 || porcentaje > 100) {
    		throw new IllegalArgumentException("El descuento es mayor a 0 y menor o igual que 100");
    	}
    	if (descuentoAplicado) {
    		throw new IllegalStateException("El descuento ya fue aplicado");
    	}
    	descuentoAplicado = true;
    	importe -=  (importe * porcentaje / 100);
    }

    /**
     * post: devuelve el importe acumulado hasta el momento,
     *       sin cerrar el Ticket.
     */
    public double calcularSubtotal() {
    	 	return importe;
    }
	
    /**
     * post: cierra el Ticket y devuelve el importe total.
     */
    public double calcularTotal() {
    	if(!abierto) {
    		throw new IllegalStateException("El ticket esta cerrado");
       	}
    	abierto = false;
    	return importe;
    }

    /**
     * post: devuelve la cantidad total de productos.
     */
    public int contarProductos() {
    	return contadorProductos;
    } 
}


