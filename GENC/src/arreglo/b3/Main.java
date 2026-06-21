package arreglo.b3;

public class Main {

	public static void main(String[] args) {
		
		int[] ganancias = {120, -45, 300, -10, 85, -200, 60, 40, -5};
		
		Reporte financiero = new Reporte(ganancias);
		financiero.imprimirArreglo(ganancias);
		financiero.imprimirArreglo(financiero.ordenamiento());

	}

}
