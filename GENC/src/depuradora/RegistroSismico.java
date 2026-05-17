package depuradora;



public class RegistroSismico {
	
	private int [] a;
	
	public RegistroSismico(int []a) {
		  if (a == null) {
	            throw new Error("El arreglo no puede ser null");
	        }
	        if (a.length == 0) {
	            throw new Error("El arreglo no puede estar vacío");
	        }
	        
	        this.a = a.clone();
		
	}
	
	  public void informe() {

	        int invalidos = 0;

	        // 1. contar ceros
	        for (int i = 0; i < a.length; i++) {
	            if (a[i] == 0) {
	                invalidos++;
	            }
	        }

	        // 2. crear array sin ceros
	        int[] depurado = new int[a.length - invalidos];

	        int j = 0;
	        for (int i = 0; i < a.length; i++) {
	            if (a[i] != 0) {
	                depurado[j] = a[i];
	                j++;
	            }
	        }

	        // 3. imprimir resultados
	        System.out.println("Array original: " + java.util.Arrays.toString(a));
	        System.out.println("Array depurado: " + java.util.Arrays.toString(depurado));
	        System.out.println("Lecturas invalidas eliminadas: " + invalidos);
	    }
	}
	


