package implementacion;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] ventas = { 42, 17, 85, 23, 85, 61, 4, 99, 38, 55 };
		
		double[] temperaturas = { 18.5, 22.0, 31.0, 27.3, 15.0, 29.0, 24.1, 20.8 };
		
		Busqueda arr1 = new Busqueda(ventas);
		
		arr1.imprimir();
		arr1.imprimePosicionDeValorPredeterminadoSiExiste(85);
		arr1.imprimePosicionDeValorPredeterminadoSiExiste(100);
		arr1.imprimirContarValores(85);
		arr1.imprimirContarValores(100);
		arr1.imprimeElementosMayores(50);
		arr1.imprimeSiEstaOrdenadoDeMenorAMayor();
		
		Acumulacion arr2 = new Acumulacion(temperaturas);
		
		arr2.imprime();
		arr2.imprimeSuma();
		arr2.imprimeProductoAcumulado();
		arr2.imprimirPromedio();
		arr2.imprimirMaximo();
		
		

	}

}
