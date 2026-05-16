package arreglos;

public class Arreglos_02 {
	
	private String[] nombresFrutas;
	
	public Arreglos_02(String[] nombresFrutas) {
	    
	    if (!sonFrutasValidas(nombresFrutas)) {
	        throw new Error("Frutas inválidas");
	    }

	    this.nombresFrutas = nombresFrutas;
	}
	
	private boolean sonFrutasValidas(String[] frutas) {
	    if (frutas == null) return false;

	    for (String fruta : frutas) {
	        if (fruta == null || !fruta.matches("[a-zA-Z]+")) {
	            return false;
	        }
	    }
	    return true;
	}
	
	
	
	
	

}
