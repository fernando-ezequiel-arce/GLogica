package depuradora;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] lecturas = {4, 0, 7, 0, 0, 3, 9, 0, 2, 6, 0, 1};
		
		RegistroSismico ultimoRegistro = new RegistroSismico(lecturas);
		ultimoRegistro.informe();

	}

}
