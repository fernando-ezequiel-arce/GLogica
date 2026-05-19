package maratoncine;

public class App {

	Pelicula[] cartelera = {
		    new Pelicula("Dune",         "ciencia ficción", 155),
		    new Pelicula("Alien",        "terror",          117),
		    new Pelicula("Hereditary",   "terror",          127),
		    new Pelicula("Get Out",      "terror",          104),
		    new Pelicula("Parasite",     "thriller",        132),
		    new Pelicula("Clue",         "thriller",         94),
		    new Pelicula("Interstellar", "ciencia ficción", 169)
		};
	
	public static void main(String[] args) {

	    App app = new App();

	    GestionPeliculas cine = new GestionPeliculas(app.cartelera);

	    cine.imprimePeliculasDeMas100();
	}

}
