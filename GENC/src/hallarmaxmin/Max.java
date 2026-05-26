package hallarmaxmin;

import java.util.Arrays;


public class Max {
	
	private int[] a;
	
	public Max() {
		
		this.a = new int [] { 42, 17, 85, 23, 85, 61, 4, 99, 38, 55 }; 
		
	}
	
    public void imprimir() {   	
    	System.out.println(Arrays.toString(a));
    	
    }
    
    private Datos hallarMinimoMaximo() {
    	int min = a[0];
    	int max = a[0];
    	for ( int i = 1; i < a.length; i++) {
    		min = Math.min(min, a[i]);
    		max = Math.max(max, a[i]);
    	}
    	
    	return new Datos(min,max);
    }
    
    public void imprimirMinimoMaximo() {
    	
    	Datos arr = hallarMinimoMaximo();
    	
    	System.out.println("El arreglo tiene como elemento minimo "+ arr.getMin());
    	System.out.println("El arreglo tiene como elemento maximo "+ arr.getMax());
    }
	
    
	

}
