package libreria;

import java.util.Arrays;

public class Estante {
    
    private Libros[] coleccionLibros;
    private int cantidad;

    public Estante() {
        this.coleccionLibros = new Libros[0]; // arranca vacío
        this.cantidad = 0;
    }
    
    public void agregarLibro(Libros libro) {
        if (cantidad == coleccionLibros.length) {
            Libros[] nuevo = new Libros[coleccionLibros.length + 1];

            for (int i = 0; i < coleccionLibros.length; i++) {
                nuevo[i] = coleccionLibros[i];
            }

            coleccionLibros = nuevo;
        }

        coleccionLibros[cantidad] = libro;
        cantidad++;
    }
    
    public void imprime() {
        System.out.println(Arrays.toString(coleccionLibros));
    }
    
    private boolean esNotable(Libros libro, int min, int max) {
        return libro.obtenerNumeroPaginas() >= min &&
               libro.obtenerNumeroPaginas() <= max &&
               libro.obtenerNombre().length() > 3 &&
               libro.obtenerNombre().startsWith("M");
    }
    
    private int[] posicionesLibrosNotables(int min, int max) {

        // 1️⃣ contar
        int contador = 0;

        for (int i = 0; i < cantidad; i++) {
            if (esNotable(coleccionLibros[i], min, max)) {
                contador++;
            }
        }

        // 2️⃣ crear array justo
        int[] posiciones = new int[contador];

        // 3️⃣ llenar el array
        int j = 0;

        for (int i = 0; i < cantidad; i++) {
            if (esNotable(coleccionLibros[i], min, max)) {
                posiciones[j] = i;
                j++;
            }
        }

        return posiciones;
    }
    
    public void imprimePosicionLibrosNotables(int min, int max) {
        System.out.println(Arrays.toString(posicionesLibrosNotables(min, max)));
    }
    
    public void imprimePosicionYValor () {
    	System.out.println("La posicion: " + coleccionLibros[0]);
   
    }
    
    private int tamArreglo() {
    	return coleccionLibros.length;
    }
    
    public void imprimeTamañoArreglo () {
    	System.out.println("El tamaño del arreglo es : " + tamArreglo() );
    }
    
    public void imprimirLibros() {
        for (Libros p : coleccionLibros) {
            System.out.println(p.cantidadPaginas + " - " + p.nombre);
        }
    }
    
}