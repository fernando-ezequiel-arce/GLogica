package reporte;

import java.util.Arrays;

/**
 * Clase que representa el reporte financiero de sucursales.
 * Permite reorganizar las ganancias colocando primero las sucursales rentables
 * (valores no negativos) y luego las que tuvieron pérdidas (valores negativos),
 * manteniendo el orden original en cada grupo.
 */
public class FinancieroSucursales {
	
	private int [] a;
	
	/**
	 * Constructor de la clase.
	 * 
	 * @param a arreglo de enteros que representa las ganancias de las sucursales
	 */
	public FinancieroSucursales(int []a) {
		this.a = a;	
	
	}
	
	/**
	 * Reorganiza el arreglo de ganancias.
	 * Primero ubica los valores no negativos y luego los negativos,
	 * manteniendo el orden original de aparición.
	 * 
	 * @return un nuevo arreglo con las ganancias reorganizadas
	 */
	public int[] reorganizar() {
	
	int[] nuevo = new int[a.length];
	int j = 0;

	// 1. copiar positivos y ceros
	for (int i = 0; i < a.length; i++) {
	    if (a[i] >= 0) {
	        nuevo[j] = a[i];
	        j++;
	    }
	}

	// 2. copiar negativos
	for (int i = 0; i < a.length; i++) {
	    if (a[i] < 0) {
	        nuevo[j] = a[i];
	        j++;
	    }
	}
	
	return nuevo;

   }
	
	/**
	 * Imprime por consola el contenido de un arreglo.
	 * 
	 * @param a arreglo a imprimir
	 */
	public void imprime(int[] a) {
		System.out.println(Arrays.toString(a));
	}
	
}