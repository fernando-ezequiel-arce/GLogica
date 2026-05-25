package implementacion;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] ventas = { 42, 17, 85, 23, 85, 61, 4, 99, 38, 55 };
		
		Busqueda arr1 = new Busqueda(ventas);
		
		arr1.imprimir();
		arr1.imprimePosicionDeValorPredeterminadoSiExiste(85);
		arr1.imprimePosicionDeValorPredeterminadoSiExiste(100);
		arr1.imprimirContarValores(85);
		arr1.imprimirContarValores(100);
		arr1.imprimeElementosMayores(50);
		arr1.imprimeSiEstaOrdenadoDeMenorAMayor();
		
		
		
		

	}

}
