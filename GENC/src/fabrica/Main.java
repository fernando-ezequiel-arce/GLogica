package fabrica;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] pesos = {102, 98, 100, 87, 105, 100, 111, 99, 103, 94, 100, 101};
		
		ControlCalidad arregloDePesos = new ControlCalidad(pesos);
		
		arregloDePesos.informe();
		

	}

}
