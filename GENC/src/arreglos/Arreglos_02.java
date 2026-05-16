package arreglos;

public class Arreglos_02 {
	
	private String[] nombresFrutas;
	
	public Arreglos_02(String[] nombresFrutas) {
	    
	    if (!sonFrutasValidas(nombresFrutas)) {
	        throw new Error("Frutas inválidas");
	    }

	    this.nombresFrutas = nombresFrutas.clone();
	}
	
	private boolean sonFrutasValidas(String[] frutas) {
	    if (frutas == null) return false;

	    for (String fruta : frutas) {
	        if (fruta == null || !fruta.matches("[a-zA-Z]+")) {
	            return false;
	        }
	    }
	    return true;
	    
	    // En arreglos no es necesario .trim(), ni .strip()
	}
	
	private String obtenerFrutasFormateadas() {
	    String resultado = "";
	    
	    for (int i = 0; i < nombresFrutas.length; i++) {
	        resultado += "Indice: " + i + 
	                     " Nombre: " + nombresFrutas[i] + "\n";
	    }
	    
	    return resultado;
	}
	
	
	public void imprimieArreglo() {
	    System.out.println(obtenerFrutasFormateadas());
	}
	

}
