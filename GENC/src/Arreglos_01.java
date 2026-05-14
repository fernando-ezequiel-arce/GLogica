import java.util.Arrays;

class Arreglos_01 {
	
	private int[] a;
	
	public Arreglos_01(int[]a) {
		this.a = a.clone();	
	}
	
	// Post: Imprimí la temperatura del primer día.
	
	public void imprime_indice0() {
		System.out.println("Este es la temperatura del primer dia: " + a[0]);
		}
	
	// Post: Imprimí la temperatura del último día (usá .length, no el índice literal).
	
	public void imprime_ultimo_id() {
		System.out.println("Este es la temperatura del ultimo dia de la semana: "+ a[a.length - 1]);
	}
		
	// Post: Reemplazá el valor del día central (índice 3) por 99.
	
	public void reemplaza_indice_03() {
		a[3] = 99;
	}
	
	public void imprime() {
		System.out.println(Arrays.toString(a));
	}
	
	// ¨Post: Imprimí cuántos elementos tiene el array.
	
	public void imprime_tamaño() {
		System.out.println(a.length);
		
	}	
	
	// Intentá acceder al índice 10, java lanza "ArrayIndexOutOfBoundsException"
	
	
}
