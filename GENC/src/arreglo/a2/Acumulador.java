package arreglo.a2;

/**
 * Dado un arreglo de notas enteras, calculá la suma total y el promedio. Mostrá si el promedio es promoción (>= 7.0).
 * int[] notas = {7, 5, 8, 4, 9, 6, 5};
 * 
 * Tareas:
 * 
 * Recorrelo con un for clásico y acumulá la suma en una variable entera.
Calculá el promedio como double. (Atención: división entera vs. decimal)
Imprimí suma, promedio y si aprueba.
Bonus: repetilo con for-each y verificá que el resultado es idéntico.
Cuidado con (double) suma / notas.length vs suma / notas.length. Probá ambas formas y observá la diferencia.
 * @author Windbaires
 *
 */

import java.util.Arrays;

public class Acumulador {
	
	private int [] notas;
		
	public Acumulador() {
		notas = new  int []  {7, 5, 8, 4, 9, 6, 5};
		}
	
	public void imprimirArreglo() {
		System.out.println(Arrays.toString(notas));

    }
	
	private int sumaElementos() {
		int suma = 0;		
		for (int i = 0; i < notas.length; i++) {
			suma += notas[i];
		}
		return suma;
	}
	
	private double promedio() {
		if (notas.length == 0) {
		    System.out.println("El arreglo está vacío");
		    return 0;
		}
		return (double) sumaElementos() / notas.length;
	}
	
	private boolean aprueba() {
		return promedio() >= 7.0;
	}
	
	public void imprimirSumaElementos() {
		System.out.println("La suma de los valores del arreglo es: "+ sumaElementos());
	}
	
	public void imprimirPromedio() {
		System.out.println("El promedio es: "+ promedio());
	}
	
	public void imprimiAprobacion() {
		if (aprueba()) {
		    System.out.println("Promociona");
		} else {
		    System.out.println("No promociona");
		}
	}
	
	private int sumaConForEach() {
		int suma = 0;
		for ( int num : notas) {
			suma += num;
			
		}
		return suma;
	}
	
	public void imprimirSumaConForEach() {
		System.out.println("La suma con este metodo es: "+ sumaConForEach());
	}
	
	
	public static void main (String [] args) {
		Acumulador a1 = new Acumulador();
		a1.imprimirArreglo();
		a1.imprimirSumaElementos();
		a1.imprimirPromedio();
		a1.imprimiAprobacion();
		a1.imprimirSumaConForEach();
	}
}

