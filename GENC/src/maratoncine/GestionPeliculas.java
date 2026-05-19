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
    
    private int duracionTotal() {

        int total = 0;

        for (Pelicula p : a) {
            total += p.getDuracion();
        }

        return total;
    }
    
    public void imprimeDuracionMaraton() {
    	System.out.println("La duracion total de la maraton es: "+ duracionTotal() + "minutos" );
    }
    
    private Pelicula peliculaMasCorta() {

        Pelicula masCorta = a[0];

        for (int i = 1; i < a.length; i++) {
            if (a[i].getDuracion() < masCorta.getDuracion()) {
                masCorta = a[i];
            }
        }

        return masCorta;
    }
    
    public void imprimirMasCorta() {
    	  System.out.println("La película más corta es: " + peliculaMasCorta() + " min)");
    }
    
    
}
