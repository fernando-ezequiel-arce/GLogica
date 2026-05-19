package reporte;

/**
 * Clase principal que ejecuta el programa de reporte financiero.
 * Crea un arreglo de ganancias, instancia la clase FinancieroSucursales
 * y muestra por consola el arreglo original y el reorganizado.
 */
public class Main {

	/**
	 * Método principal del programa.
	 * 
	 * @param args argumentos de línea de comandos (no utilizados)
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] ganancias = {120, -45, 300, -10, 85, -200, 60, 40, -5};
		
		FinancieroSucursales f = new FinancieroSucursales(ganancias);

		int[] reorganizado = f.reorganizar();

		f.imprime(ganancias);
		f.imprime(reorganizado);

	}

}