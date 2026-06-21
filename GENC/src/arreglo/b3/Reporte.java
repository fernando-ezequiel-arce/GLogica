package arreglo.b3;

import java.util.Arrays;

public class Reporte {
	
	private int [] a;
	
	public Reporte(int [] a) {
		this.a = a;
	}
	
	public void imprimirArreglo(int [] arreglo) {
		System.out.println(Arrays.toString (arreglo));
	}
	public int[] ordenamiento() {

	    int[] nuevo = new int[a.length];
	    int indice = 0;

	    // Primero los no negativos
	    for (int i = 0; i < a.length; i++) {
	        if (a[i] >= 0) {
	            nuevo[indice] = a[i];
	            indice++;
	        }
	    }

	    // Después los negativos
	    for (int i = 0; i < a.length; i++) {
	        if (a[i] < 0) {
	            nuevo[indice] = a[i];
	            indice++;
	        }
	    }

	    return nuevo;
	}
	
	}

