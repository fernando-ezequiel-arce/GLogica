package micropatrones;

public class Logica {
	
	private final int []a;

	private int pos;
	
	public Logica(int []a) {
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
 
}
	
	 


