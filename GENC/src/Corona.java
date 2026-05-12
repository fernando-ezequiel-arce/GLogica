public class Corona {

	private Circulo circuloInterno;
	private Circulo circuloExterno;

	public Corona(double radioInterno, double radioExterno) {
		validar(radioInterno, radioExterno);
		this.circuloInterno = new Circulo(radioInterno);
		this.circuloExterno = new Circulo(radioExterno);
	}

	private void validar(double r1, double r2) {
		if (r1 >= r2) {
			throw new IllegalArgumentException("El radio interno debe ser menor al externo");
		}
	}

	public double obtenerArea() {
		return circuloExterno.obtenerArea() - circuloInterno.obtenerArea();
	}

}
