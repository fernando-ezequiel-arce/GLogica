package arreglo.a4;

public class Producto {

    private String nombre;
    private double precio;

    public Producto(String nombre, double precio) {
        this.nombre = validarYNormalizarNombre(nombre);
        validarPrecio(precio);
        this.precio = precio;
    }

    private String validarYNormalizarNombre(String nombre) {
        if (nombre == null) {
            throw new IllegalArgumentException("El nombre no puede ser null");
        }

        String normalizado = normalizarTexto(nombre);

        if (!validarTexto(normalizado)) {
            throw new IllegalArgumentException(
                "El texto solo recibe letras y un espacio entre palabras"
            );
        }

        return normalizado;
    }
    
    private String normalizarTexto(String texto) {
        return texto.trim().replaceAll("\\s+", " ");
    }
    
    private boolean validarTexto(String texto) {
        return texto.matches("[A-Za-z]+( [A-Za-z]+)*");
    }

    private void validarPrecio(double precio) {
        if (precio <= 0) {
            throw new IllegalArgumentException("El precio debe ser mayor que cero");
        }
    }

    public void cambiarNombre(String nombre) {
        this.nombre = validarYNormalizarNombre(nombre);
    }

    public void cambiarPrecio(double precio) {
        validarPrecio(precio);
        this.precio = precio;
    }
    
    public String obtenerNombre() {
        return nombre;
    }

    public double obtenerPrecio() {
        return precio;
    }
}