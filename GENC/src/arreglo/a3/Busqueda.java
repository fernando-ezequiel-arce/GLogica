package arreglo.a3;

public class Busqueda {
	
	private String [] frutas;
	private boolean encontrado;
	private int posicion;
	
	public Busqueda() {
		frutas = new String []  {
			    "manzana", "banana", "naranja",
			    "uva", "pera", "mango"
			};
		
	}
	
	private int encontrar(String fruta) {
		for (int i = 0; i < frutas.length; i ++) {
	
		          if (frutas[i].equals(fruta)) {		        	  
		        	  encontrado = true;
		        	  return  i;
		        	  
		        	  
		          }         
		        		         	    
	     }
		return -1;
	}
	
	private void encuentra(String fruta) {
	    encontrado = false;
	    posicion = -1;

	    for (int i = 0; i < frutas.length; i++) {
	        if (!encontrado && frutas[i].equals(fruta)) {
	            encontrado = true;
	            posicion = i;
	        }
	    }
	}
	
	public void imprimirBusqueda(String busqueda) {
		posicion = encontrar(busqueda);
			if (posicion == -1) {
				System.out.println("La fruta no fue encontrada");
			}else
			{
				System.out.println("La "+ busqueda + " fue encontrada en la posicion: "+ posicion);
			}
		
	}
	
	public void imprimirEncuentra(String fruta) {
		encuentra(fruta);
		if (posicion == -1) {
			System.out.println("La fruta no fue encontrada");
		    }else
		    {
			System.out.println("La "+ fruta + " fue encontrada en la posicion: "+ posicion);
		    }
		}
}
