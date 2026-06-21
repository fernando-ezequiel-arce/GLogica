package arreglo.b2;

public class Main {

	public static void main(String[] args) {
		
		int[] lecturas = {4, 0, 7, 0, 0, 3, 9, 0, 2, 6, 0, 1};
		
		Depuracion lecturas1 = new Depuracion(lecturas);
		lecturas1.imprimirArreglo();
		lecturas1.imprimirArregloDepurado();
		lecturas1.imprimirLecturasErroneas();

	}

}
