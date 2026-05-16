
public class Punto {
	
	private double x;
	private double y;
	
	public Punto (double x, double y) {
		this.x = x;
		this.y = y;
		
		}
	
	public double obtenerValorX() {
		return x;
	}
	
	public double obtenerValorY() {
		return y;
	}
	
	public  boolean estaSobreEjeX() {
		return y == 0;
	}
	
	public boolean estaSobreEjeY() {
		return x == 0;
	}
	
	public boolean esElOrigen() {
		return x == 0 && y == 0;
	}
	
	
}
