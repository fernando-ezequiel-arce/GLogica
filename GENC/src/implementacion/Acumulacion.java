package implementacion;

import java.util.Arrays;

public class Acumulacion {
    
    private double[] a;
    
    public Acumulacion(double[] a) {
        this.a = a.clone();
    }
    
    public void imprime() {
        System.out.println(Arrays.toString(a));
    }
    
    // Calculá la suma de todos los elementos
    private double suma() {
        double sumador = 0;
        for (double num : a) {
            sumador += num;
        }
        return sumador;
    }
    
    public void imprimeSuma() {
        System.out.println("La suma de arreglo es: " + suma());
    }
    
    /**
     * Calculá el producto acumulado de todos los elementos. 
     * ¿Qué pasa si inicializás el acumulador en 0 en lugar de 1?
     */
    private double productoAcumulado() {
        double productoAcumulado = 1;
        for (double num : a) {
            productoAcumulado *= num;
        }
        return productoAcumulado;
    }
    
    public void imprimeProductoAcumulado() {
        System.out.println("El producto acumulado es: " + productoAcumulado());
    }
    
    /**
     * Calculá el promedio. ¿Qué tipo de dato debe tener el acumulador
     * para no perder la parte decimal?
     */
    private double promedio() {
        return suma() / a.length;
    }
    
    public void imprimirPromedio() {
        System.out.println("El promedio es: " + promedio());
    }
    
    // Encontrá el máximo usando una comparación explícita con if.
    private double hallarMaximo() {
        double max = a[0]; 
        for (double num : a) {
            if (num > max) {
                max = num; 
            }
        }
        return max;
    }
    
    public void imprimirMaximo() {
        System.out.println("El maximo del arreglo es: " + hallarMaximo());
    }
    
    // Repetí el ítem anterior usando Math.max. ¿Cuál te parece más legible?
    private double hallarMaximoMath() {  
        double max = a[0];
        for (int i = 1; i < a.length; i++) {
            max = Math.max(max, a[i]);
        }
        return max;
    }

    public void imprimirMaximoMath() {
        System.out.println("El maximo del arreglo (usando Math.max) es: " + hallarMaximoMath());
    }
}