package implementacion;

import java.util.Arrays;

public class Busqueda {
	
	private final int[] a; 
	
	public Busqueda(int[]a) {
		this.a = a.clone();
	}
	
	public void imprimir() {
		System.out.println(Arrays.toString(a));
	}
	
	/**
	 * Encontrá la posición de la primera ocurrencia del valor 85.
	 * ¿Qué se devuelve si el valor no existe?
	 */
	
	private int posicionDeValorPredeterminadoSiExiste( int valorDeBusqueda) {
		
		int valor = valorDeBusqueda;
		
		for (int i = 0; i < a.length; i++) {
			
			if ( a[i] == valor) {
				return i;
			}
		}
		
		return -1;
		
	}
	
	public void imprimePosicionDeValorPredeterminadoSiExiste(int valorABuscar) {
		int posicion = posicionDeValorPredeterminadoSiExiste(valorABuscar); 
		
		if ( posicion == -1) {
		System.out.println("El numero predeterminado no se encuentra en el arreglo");}
	    
	    else {
	    	System.out.println("La posicion del arreglo: "+ posicion + " contiene al numero predeterminado");
	    }
		
	}
	
	//Contá cuántas veces aparece el valor 85.
	
	private int contarElemento(int valor) {
		int contador = 0;
		for ( int contar : a ) {
			if (contar == valor) {
				contador++;}
		}
		return contador;
	}
	
	public void imprimirContarValores(int valor) {
		System.out.println("El elemento " + valor + " se encontro " + contarElemento(valor));
	}
	
	//Contá cuántos elementos son mayores a 50.
	
	private int contarElementosMayores( int valor) {
		int contador = 0;
		for ( int contar : a) {
			if (contar > valor) {
				contador++;
			}
		}
		return contador;
	}
	
	public void imprimeElementosMayores(int valor) {
		System.out.println("El arreglo contiene "+ contarElementosMayores(valor) + " mayores a " + valor);
	}
	
	//Verificá si el arreglo está ordenado de menor a mayor
	
	private boolean estaOrdenadoMenorAMayor() {
	    boolean ordenado = true;
	    for (int i = 0; i < a.length - 1 && ordenado; i++) {
	        if (a[i] > a[i + 1]) {
	            ordenado = false; 
	            }
	    }
	    return ordenado;
	   
       }
	
	public void imprimeSiEstaOrdenadoDeMenorAMayor() {
	           boolean estaOrdenado = estaOrdenadoMenorAMayor();
	           if (estaOrdenado) {
	        	   System.out.println("El arreglo esta ordenado");
	        	   
	           } else {
	           System.out.println("El arreglo no esta ordenado");
	        	
	           }
	}
	
} 


	



