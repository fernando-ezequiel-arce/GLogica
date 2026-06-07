package arreglo.a1;

import java.util.Arrays;

public class Temperatura {
	
	private int [] temps;
	
	public Temperatura() {
		temps = new int [] {22, 18, 31, 27, 15, 29, 24};
	}
	
	public void imprimirTemperaturaPrimerDia() {
		System.out.println("La temperatura del primer dia es " + temps[0]);
	}
	
	public void imprimirTemperaturaUltimoDia() {
		System.out.println("La temperatura del ultimo dia es " + temps[temps.length - 1]);
	}
	
	public void reemplazaValor( int pos, int valor) {
		temps[pos] = valor;		 
		
	}
	
	public void imprimeArreglo() {
		System.out.println(Arrays.toString(temps));
	}
	
	public void imprimirTamaño() { 
		System.out.println("El tamaño del arreglo es: "+ temps.length + " posiciones");
	
	}
	
	private int CantidadElementos() {
		      int contador = 0;
		for (int i = 0; i < temps.length; i++) {
			
		     if (temps [i] != 0) {
		    	 contador ++;
			
		    }
		}
		return contador;
	}
	
	public void imprimirCantidadElementos() {
		System.out.println ("El arreglo tiene "+ (CantidadElementos())+ " elementos");
	}
	
	
	
	public static void main (String [] args) {
		Temperatura t = new Temperatura();
		t.imprimirTemperaturaPrimerDia();
		t.imprimirTemperaturaUltimoDia();
		t.reemplazaValor(3, 99);
		t.imprimeArreglo();
		t.imprimirTamaño();
		t.imprimirCantidadElementos();
	}
	
	

}
