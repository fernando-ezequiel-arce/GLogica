package arreglos;
public class Main {


	    public static void main(String[] args) {
	    String[] frutas = {
	    		    "manzana", "banana", "naranja",
	    		    "uva", "pera", "mango"
	    		     };
	    String buscar = "naranja";
	    	
	    int []temps = {22, 18, 31, 27, 15, 29, 24};
	    int[] notas = {7, 5, 8, 4, 9, 6, 5};
	    int[] notas2 = {3, 5, 3, 2};
	    
	    Arreglos_01 array01 = new Arreglos_01(temps);
	     
	     array01.imprime_indice0();
	     array01.imprime_ultimo_id();
	     array01.reemplaza_indice_03();
	     array01.imprime();
	     array01.imprime_tamaño();
	     
	     Arreglos_01 array02 = new Arreglos_01(notas);
	     
	     array02.imprime();	     
	     array02.imprime_suma();
	     array02.imprime_promedio();
	     array02.imprime_aprobacion();
	     
	     
	     Arreglos_01 array03 = new Arreglos_01(notas2);
	     
	     array03.imprime_aprobacion();
	     array03.imprime_promedio();
	     array03.imprimir_suma_for_each();
	     
	     
	    }
	}


