package arreglo.b1;

public class Main {

	public static void main(String[] args) {
		
		int[] pesos = {102, 98, 100, 87, 105, 100, 111, 99, 103, 94, 100, 101};
		int[] pesos2 = {
			    90, 92, 88, 110, 112,
			    100, 101, 102, 103, 104,
			    100, 100, 99, 98, 97
			};
		
		ControlCalidad informe = new ControlCalidad(pesos);
		informe.imprimeCantidadPiezasDefectuosas();
		informe.imprimirCantidadPiezasPerfectas();
		informe.imprimirPromedioDePiezasNoDefectuosas();
		informe.imprimirAlertaPorcentaje();
		ControlCalidad informe2 = new ControlCalidad(pesos2);
		informe2.imprimirAlertaPorcentaje();
	}

}
