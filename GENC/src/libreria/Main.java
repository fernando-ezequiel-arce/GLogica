package libreria;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	
		Estante e = new Estante();

		e.agregarLibro(new Libros(120, "Martin Fierro"));   // ✔️ notable
		e.agregarLibro(new Libros(30, "Sol"));              // ❌ pocas páginas
		e.agregarLibro(new Libros(200, "Matematica"));      // ✔️ notable
		e.agregarLibro(new Libros(80, "Historia"));         // ❌ no empieza con M
		e.agregarLibro(new Libros(60, "Mapa"));             // ✔️ notable
		e.agregarLibro(new Libros(300, "Mundo"));           // ❌ supera max (depende)
		e.agregarLibro(new Libros(55, "Ma"));               // ❌ nombre corto
		e.imprime();
		
		e.imprimePosicionLibrosNotables(40, 200);
		e.imprimePosicionYValor();
		e.imprimeTamañoArreglo();
		e.agregarLibro(new Libros(100, "Millenian"));
		e.imprimeTamañoArreglo();
		e.imprimirLibros();
		
		
	
		
		

	}

}
