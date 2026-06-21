package estacionamiento;

/**
 * Un Estacionamiento con cierta cantidad de lugares disponibles
 */
public class Estacionamiento {
	
	private boolean[] ocupados;
	private int[] usos;
	private int cantidadDeLugares;

	/**
	 * Se construye con la cantidad de lugares disponibles
	 * @param cantidadDeLugares
	 * @throws Error si la cantidad no es válida
	 * @post Se construye el estacionamiento
	 */
	public Estacionamiento(int cantidadDeLugares) {
		if (!validarCantidadDeLugares(cantidadDeLugares)) {
			throw new Error("Cantidad de lugares debe ser mayor a cero");
		}

		this.cantidadDeLugares = cantidadDeLugares;
		ocupados = new boolean[cantidadDeLugares];
		usos = new int[cantidadDeLugares];
	}

	/**
	 * Permite ocupar un lugar.
	 * @param lugar indicado con números de 1 a cantidadDeLugares
	 * @throws Error si el lugar no es válido
	 * @throws Error si el lugar ya está ocupado
	 * @pre el lugar existe y está desocupado
	 * @post se ocupa el lugar
	 */
	public void ocupar(int lugar) {

		if (!validarLugar(lugar)) {
			throw new Error("Lugar invalido");
		}

		if (ocupados[lugar - 1]) {
			throw new Error("El lugar ya esta ocupado");
		}

		ocupados[lugar - 1] = true;
		usos[lugar - 1]++;
	}

	/**
	 * Permite desocupar un lugar.
	 * @param lugar indicado con números de 1 a cantidadDeLugares
	 * @throws Error si el lugar no es válido
	 * @throws Error si el lugar ya está desocupado
	 * @pre el lugar existe y está ocupado
	 * @post se desocupa el lugar
	 */
	public void desocupar(int lugar) {

		if (!validarLugar(lugar)) {
			throw new Error("Lugar invalido");
		}

		if (!ocupados[lugar - 1]) {
			throw new Error("El lugar ya esta desocupado");
		}

		ocupados[lugar - 1] = false;
	}

	/**
	 * Permite conocer el estado de un lugar.
	 * @param lugar indicado con números de 1 a cantidadDeLugares
	 * @throws Error si el lugar no es válido
	 * @return true si el lugar está ocupado, false en caso contrario
	 */
	public boolean estaOcupado(int lugar) {

		if (!validarLugar(lugar)) {
			throw new Error("Lugar invalido");
		}

		if (ocupados[lugar - 1]) {
			return true;
		}

		return false;
	}

	/**
	 * @return el porcentaje de ocupación actual
	 */
	public double porcentajeOcupados() {

		int ocupadosCount = 0;

		for (int i = 0; i < cantidadDeLugares; i++) {
			if (ocupados[i]) {
				ocupadosCount++;
			}
		}

		return ((double) ocupadosCount * 100) / cantidadDeLugares;

		//return 0.0;
	}

	/**
	 * Permite conocer las veces que se utilizó un lugar
	 * @param lugar indicado con números de 1 a cantidadDeLugares
	 * @return cantidad de veces que se utilizó el lugar
	 */
	public int vecesQueSeUso(int lugar) {

		if (!validarLugar(lugar)) {
			throw new Error("Lugar invalido");
		}

		return usos[lugar - 1];
	}

	/**
	 * Permite conocer cuántos lugares se usaron más de X veces
	 * @param veces cantidad de usos a comparar
	 * @throws Error si veces es un valor inválido
	 * @return cantidad de lugares que superan ese uso
	 */
	public int lugaresQueSeUsaronMasDeTantasVeces(int veces) {

		if (veces < 0) {
			throw new Error("Veces invalido");
		}

		int contador = 0;

		for (int i = 0; i < cantidadDeLugares; i++) {
			if (usos[i] > veces) {
				contador++;
			}
		}

		return contador;
	}

	/**
	 * Valida que la cantidad de lugares sea mayor a cero.
	 * @param cantidadDeLugares cantidad ingresada en el constructor
	 * @return true si es válida, false en caso contrario
	 */
	private boolean validarCantidadDeLugares(int cantidadDeLugares) {
		return cantidadDeLugares > 0;
	}

	/**
	 * Valida que el lugar esté dentro del rango permitido (1..cantidadDeLugares).
	 * @param lugar número de lugar a validar
	 * @return true si el lugar es válido, false en caso contrario
	 */
	private boolean validarLugar(int lugar) {
		return lugar >= 1 && lugar <= cantidadDeLugares;
	}
}