package reporte;

import java.util.Arrays;

public class FinancieroSucursales {
	
	private int [] a;
	
	public FinancieroSucursales(int []a) {
		this.a = a;	
	
	}
	
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
	
	public void imprime(int[] a) {
		System.out.println(Arrays.toString(a));
	}
	
}
