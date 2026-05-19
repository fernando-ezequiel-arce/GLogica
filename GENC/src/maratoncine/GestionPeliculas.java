package maratoncine;

public class GestionPeliculas {
	
	private Pelicula [] a;
	
	public GestionPeliculas(Pelicula [] a) {
		this.a = a.clone();
	}


    public void imprimePeliculasDeMas100() {
    	   System.out.println("Peliculas de mas de 100 min:");

	       for (Pelicula p : a) {
           if (p.getDuracion() > 100) {
             System.out.println(p.getTitulo() + " - " + p.getDuracion() + " min");
             }  
            }
	       
    }	
    
}
