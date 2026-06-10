package casino;

public class Main {

   public  static void main (String [] args) {
	   
	   Tragamonedas partida = new Tragamonedas();
	   partida.activar();
	   partida.obtenerPosicionDelTambor(0);
	   partida.obtenerPosicionDelTambor(1);
	   partida.obtenerPosicionDelTambor(2);
	   partida.imprimirResultado();
	
   }
}
