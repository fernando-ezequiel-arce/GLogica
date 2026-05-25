package metereologia;

public class DiasLluviosos {
	
		    private boolean[] dias;

	    public DiasLluviosos(int cantidadDias) {
	    	if (!esCantidadDiasValida(cantidadDias)) {
	    	    throw new Error("Cantidad de días inválida");
	    	}
	        this.dias = new boolean[cantidadDias];
	    }
	    
	    private boolean esCantidadDiasValida(int cantidad) {
	        return cantidad == 365 || cantidad == 366;
	    }
	    
	    public void registrarQueLlovioElDia(int diaDeAnio, boolean llovio) {
	        if (!esDiaValido(diaDeAnio)) {
	            throw new Error("Día inválido");
	        }
	        dias[diaDeAnio - 1] = llovio;
	    }
	    
	    private boolean esDiaValido(int dia) {
	        return dia >= 1 && dia <= dias.length;
	    }
	    
	    public boolean consultarSiLlovioElDia(int diaDelAnio) {
	        if (!esDiaValido(diaDelAnio)) {
	            throw new Error("Día inválido");
	        }
	        
	        return dias[diaDelAnio - 1];
	    }
	    
	    public int contarDiasLluviosos() {
	        int contador = 0;

	        for (boolean llovio : dias) {
	            contador += llovio ? 1 : 0;
	        }

	        return contador;   
	    }
	    
	  private int consultarCuatrimestreMasLluvioso() {

		        int corte1 = (dias.length == 365) ? 120 : 121;
			    int corte2 = (dias.length == 365) ? 243 : 244;

			    int c1 = 0;
			    int c2 = 0;
			    int c3 = 0;

			    for (int i = 0; i < dias.length; i++) {
			        if (dias[i]) {
			            if (i < corte1) {
			                c1++;
			            } else if (i < corte2) {
			                c2++;
			            } else {
			                c3++;
			            }
			        }
			    }

			   
			    if (c1 >= c2 && c1 >= c3) {
			        return 1;
			    } else if (c2 >= c1 && c2 >= c3) {
			        return 2;
			    } else {
			        return 3;
			    }
			}
	   public void imprimirCuatrimestreMasLluvioso() {
		   System.out.println("El:" + (consultarCuatrimestreMasLluvioso()) + "  cuatrimestre del año fue el mas lluviso");
	   }
	   
	   private int consultarPrimerDiaConLluvia() {
		   for (int i = 0; i < dias.length; i++) {
			    if (dias[i]) {
			        return i + 1;
			    }
			}
		   return -1;
	   }
	   
	   public void imprimirPrimerDiaConLluvia() {
		    int dia = consultarPrimerDiaConLluvia();

		    if (dia == -1) {
		        System.out.println("No hubo días con lluvia en el año");
		    } else {
		        System.out.println("El dia " + dia + " fue el primer dia con lluvia");
		    }
		}
	  
}

    

	
	
	


