package geometria;

//4.	Implementar una clase que modele un círculo, del que se desea manipular (obtener y cambiar): 

// ●	radio
// ●	diámetro
// ●	perímetro
// ●	área	 


public class Circulo {
	
	private double radio;
	
	public Circulo(double radio) {
		validar(radio);
		this.radio = radio;
		
	}
	
	private void validar(double valor)
	{
		if (valor <= 0) {
			throw new IllegalArgumentException("El valor debe ser mayor a 0");
		}
	}
	
	public double obtenerRadio() {
		return radio;
	}
	
	public void cambiarRadio(double nuevoRadio) {
		validar(nuevoRadio);
		radio = nuevoRadio;
	}
	
	public double obtenerDiametro() {
		return radio * 2;
		
	}
	
	public void cambiarDiametro(double nuevoDiametro) {
		validar(nuevoDiametro);
		radio = nuevoDiametro / 2;
		
	}
	
	public double obtenerPerimetro() {
		return 2 * radio * Math.PI;
	}
	
	public void cambiarPerimetro(double nuevoPerimetro) {
	   validar(nuevoPerimetro);
	   radio = nuevoPerimetro/ (2 * Math.PI);
	}
	
	public double obtenerArea() {
		return radio * radio * Math.PI;
	}
	
	public void cambiarArea(double nuevaArea) {
		validar(nuevaArea);
		radio = Math.sqrt(nuevaArea/Math.PI);
		
	}
	
	
	

}
