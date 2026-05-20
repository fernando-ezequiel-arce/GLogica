package micropatrones;

public class Logica {
	
	private final int []a;
	private int numero;
	private int pos;
	
	public Logica(int []a) {
		this.a = a.clone();
		this.pos = -1;
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
		return pos;
	}
	
	public void imprimeEnQuePosicionSeEncuentra(int numero) {
		
		if (enQuePosicionSeEncuentra(numero) == -1) {
	        System.out.println("El arreglo no contiene al numero");
	    } else {
	    	System.out.println("El "+ numero + " tiene la posicion " + enQuePosicionSeEncuentra(numero)+ " del arreglo.");
	    }
	}
	
		
}
	
	
	 


