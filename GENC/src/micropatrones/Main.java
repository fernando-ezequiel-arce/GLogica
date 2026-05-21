package micropatrones;

public class Main {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {7, 12, 3, 25, 8, 19, 4, 10, 6}; 
		
		Logica array = new Logica(arr);
		
		array.imprimeExistencia(19);
		array.imprimeExistencia(13);
		
		array.imprimeEnQuePosicionSeEncuentra(25);
		array.imprimeEnQuePosicionSeEncuentra(13);
		
		array.imprimeEnQuePosicionSeEncuentra(7);
		array.imprimirCantidadDeNumerosPares();
		array.imprimirSumaDePosicionesImpares();
		
		
	
			
		

	}

}
