package micropatrones;

import java.util.Arrays;

public class Logica {
	
	private final int []a;

	
	public Logica(int []a) {
		    if (a == null || a.length == 0) {
		        throw new Error("El arreglo no puede ser null ni vacío");
		    }
		    this.a = a.clone();
		}

	private boolean existe (int numero) {
			
		for (int i = 0; i < a.length; i++) {
			if (a[i] == numero) {
				return true;
			}
		}
		
		return false;	
		
	}
	
	public void imprimeExistencia(int numero) {
	    if (existe(numero)) {
	        System.out.println("El arreglo contiene al: " + numero);
	    } else {
	    	System.out.println("El "+ numero + " no esta en el arreglo.");
	    }
	}
	
	private int enQuePosicionSeEncuentra(int numero){		
			
		for (int i = 0; i < a.length; i++) {
			if (a[i] == numero) {
				
				return i;
			}	
				
	    }
		return -1;
	}
	
	public void imprimeEnQuePosicionSeEncuentra(int numero) {
		int posicion = enQuePosicionSeEncuentra(numero);

		if (posicion == -1) {
		    System.out.println("El numero " + numero + " no esta en el arreglo.");
		} else {
		    System.out.println("El " + numero + " tiene la posicion " + posicion + " del arreglo.");
		}
	}
	
	private int contarCondicion() {
		int contador = 0;				
	
		for ( int num : a) {
			if (  num % 2 == 0 ) {
				contador++;	
      			}			 
	     }
		return contador;
    }
	
	public void imprimirCantidadDeNumerosPares() {
		System.out.println("El array tiene: "+ contarCondicion()+" elementos pares");
	
  }
	
 private int sumarPosicionesImpares() {
	 int suma = 0;
	 
	 for (int i = 0; i < a.length; i++) {
		 if ( i % 2 != 0 ) {
			 suma += a[i];
		 }
	 }
	 
	 return suma;	 
	 
 }
 
 public void imprimirSumaDePosicionesImpares() {
	 System.out.println("La suma de las posiciones impares es: "+ sumarPosicionesImpares());	
 }
 
 private int maximo() {
        int max = a[0];
        for (int i = 1; i < a.length; i++) {
	    max = Math.max(max, a[i]);
        }
 
      return max;
 
      }
 
 private int maximoConIf() {
	 int max = a[0];
	 for (int i = 1; i < a.length; i++) {
	     if (a[i] > max)
	         max = a[i];
	 }
	 return max;
 
 }
 
 public void imprimirMaximio() {
	 System.out.println("El numero "+ maximo()+" es el maximo del arreglo.");
 }
 
 public void imprimirMaximioConIf() {
	 System.out.println("El numero "+ maximoConIf()+" es el maximo del arreglo.");
 }
 
 private MinimoYMaximo maxMin() {
	 int min = a[0];
	 int max = a[0];
	 for (int i = 1; i < a.length; i++) {
	     min = Math.min(min, a[i]);
	     max = Math.max(max, a[i]);
	 }
	 return new MinimoYMaximo(min, max); 
}
 
 public void imprimirMinimoYMaximo() {
	 MinimoYMaximo r = maxMin(); 

	 System.out.println("Min: " + r.getMin());
	 System.out.println("Max: " + r.getMax());
 
}
 
 private int[] filtrarMayoresA10() {
	    int[] resultado = new int[a.length];
	    int tam = 0;

	    for (int x : a) {
	        if (x > 10) {
	            resultado[tam++] = x;
	        } //x me da el valor, tam me dice dónde guardarlo, porque al usar for each no tengo i.
	    }

	   
	    int[] arregloFinal = new int[tam];
	    for (int i = 0; i < tam; i++) {
	        arregloFinal[i] = resultado[i];
	    }

	    return arregloFinal;
	}
 
 public void imprimirMayoresA10() {
	 System.out.println(Arrays.toString(filtrarMayoresA10()));
	 
 }
 
}
	
	 


