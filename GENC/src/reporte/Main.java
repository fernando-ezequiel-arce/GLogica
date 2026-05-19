package reporte;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] ganancias = {120, -45, 300, -10, 85, -200, 60, 40, -5};
		
		FinancieroSucursales f = new FinancieroSucursales(ganancias);

		int[] reorganizado = f.reorganizar();

		f.imprime(ganancias);
		f.imprime(reorganizado);

	}

}
