package arreglo.b2;

import java.util.Arrays;

public class Depuracion {
	
	private int [] a;
	
		
		public Depuracion(int [] a) {
	
		this.a = a;
	}
	
		private int[] arregloDepurado() {

		    int contador = 0;

		    // 1) contar válidos
		    for (int i = 0; i < a.length; i++) {
		        if (a[i] != 0) {
		            contador++;
		        }
		    }

		    // 2) crear arreglo nuevo
		    int[] depurado = new int[contador];

		    // 3) llenarlo
		    int j = 0;
		    for (int i = 0; i < a.length; i++) {
		        if (a[i] != 0) {
		            depurado[j] = a[i];
		            j++;
		        }
		    }

		    return depurado;
		}
	
	public void imprimirArreglo() {
		System.out.println(Arrays.toString(a));
	}
	
	public void imprimirArregloDepurado() {
		System.out.println(Arrays.toString(arregloDepurado()));
		
	}
	
	private int cantidadDeErroneas () {
		
		return a.length - arregloDepurado().length;
		
	}
	 public void imprimirLecturasErroneas() {
		 System.out.println("La cantidad de lecturas erroneas es: "+ cantidadDeErroneas());
	 }
}
