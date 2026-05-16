import java.util.Arrays;

class Arreglos_01 {
	
	private int[] a;
	double promedio;
	
	public Arreglos_01(int[]a) {
		this.a = a.clone();	
		this.promedio = 0.0;
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
	
	//Recorrelo con un for clásico y acumulá la suma en una variable entera
	
	private int sumador(){ 
		int suma = 0;
		for (int i = 0; i < a.length; i++) {
			suma += a [i];
		}
		
		return suma;
		
	}
		
	public void imprime_suma() {
		System.out.println("La suma del array es: " + sumador());
	}
	
	private double promedio_metodo() {
		
		 promedio = (double) sumador() / a.length;
		 return promedio;
	}

	public void imprime_promedio() {
		System.out.println("El promedio del array es: "+ promedio_metodo());
	}
	
	private boolean aprueba() {
		return (promedio_metodo()) > 4;
	}
	
	public void imprime_aprobacion()
	{  if (aprueba()) {
		System.out.println("Aprobo la materia");
		return;
	}
	
	System.out.println("Reprobo la materia");
	
	
	}
	
	private int sumador_for_each(){ 
	    int suma = 0;

	    for (int valor : a) {
	        suma += valor;
	    }

	    return suma;
	}
	
	public void imprimir_suma_for_each() {
		System.out.println("La suma con for_each da: "+ sumador_for_each());
	}
	
}
	
	

