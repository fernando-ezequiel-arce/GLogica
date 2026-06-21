package arreglo.b1;

public class ControlCalidad {
	
	private int[] a;
	
	public ControlCalidad(int [] a) {
		this.a = a;
	}
	
	private int cantidadPiezasDefectuosas() {
		int contador = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i]<95 || a[i]> 105) {
				contador++;
			}
		}
		return contador;
	}
	
	public void imprimeCantidadPiezasDefectuosas() {
		System.out.println("La cantidad de piezas defectuosas es: "+ cantidadPiezasDefectuosas());
	}
	
	private int piezasPerfectas() {
		int contador = 0;
		for(int i = 0; i < a.length; i++) {
			if (a[i] == 100) {
				contador ++;
			}
		}
		return contador;
	}
	
	public void imprimirCantidadPiezasPerfectas() {
		System.out.println("La cantidad de piezas perfectas es: "+ piezasPerfectas());
	}
	
	private int contarPiezasNoDefectuosas() {
		int contador = 0;
		for (int num : a) {
			if (num >= 95 && num <= 105) {
				contador++;
			}
		}
		return contador;
	}
	
	private int sumarPesoDePiezasNoDefectuosas() {
		int suma = 0;
		for (int num : a) {
			if (num >= 95 && num <= 105) {
				suma += num;
			}
		}
		return suma;
		
	}
	
	private double promedioDePiezasNoDefectuosas() {
		if (contarPiezasNoDefectuosas() <= 0) {
			throw new IllegalArgumentException ("La cantidad de piezas es Cero no se puede calcular el promedio");
		}
		return (double) sumarPesoDePiezasNoDefectuosas() / contarPiezasNoDefectuosas();
	}
	
	public void imprimirPromedioDePiezasNoDefectuosas() {
		System.out.println("El peso promedio de piezas no defectuosas es: "+ promedioDePiezasNoDefectuosas());
	
	}
	
	private int cantidadTotalDePiezas() {
		return a.length;
	}
	
	private double porcentajeDePiezasDefectuosas() {
		if (cantidadTotalDePiezas() <= 0) {
			throw new IllegalArgumentException("El arreglo no puede estar sin piezas");
		}
		return (double) (cantidadPiezasDefectuosas() * 100 ) / cantidadTotalDePiezas();		
		
	}
	
	public void imprimirAlertaPorcentaje() {
		if (porcentajeDePiezasDefectuosas() > 20) {
			System.out.println("Alerta hay mas del 20 % de piezas defectuosas");
		}
	}


}
