package Glogica;

/**
 * Representa la evaluación de aprobación de una materia.
 * 
 *   La aprobación depende de:
 * - Parciales aprobados o recuperados
 * - Trabajo práctico aprobado
 * - Condición de final aprobado
 * - Puede recuperar hasta 2 parciales
 */

public class AprobarMateria {
	private boolean aproboPrimerParcial;
	private boolean aproboSegundoParcial;
	private boolean aproboTercerParcial;
	private boolean aproboCuartoParcial;
	private boolean aproboRecuperatorio1;
	private boolean aproboRecuperatorio2;
	private boolean aproboTrabajoPractico;
	private boolean aproboFinal;
	
    /**
     * Constructor que inicializa el estado de aprobación de la materia.
     * 
     * @param aproboPrimerParcial indica si aprobó el primer parcial
     * @param aproboSegundoParcial indica si aprobó el segundo parcial
     * @param aproboTercerParcial indica si aprobó el tercer parcial
     * @param aproboCuartoParcial indica si aprobó el cuarto parcial
     * @param aproboRecuperatorio1 indica si aprobó el primer recuperatorio
     * @param aproboRecuperatorio2 indica si aprobó el segundo recuperatorio
     * @param aproboTrabajoPractico indica si aprobó el trabajo práctico
     * @param aproboFinal indica si aprobó el examen final
     */
	

	public AprobarMateria(
		    boolean aproboPrimerParcial,
		    boolean aproboSegundoParcial,
		    boolean aproboTercerParcial,
		    boolean aproboCuartoParcial,
		    boolean aproboRecuperatorio1,
		    boolean aproboRecuperatorio2,
		    boolean aproboTrabajoPractico,
		    boolean aproboFinal)
		  
		{
		    this.aproboPrimerParcial = aproboPrimerParcial;
		    this.aproboSegundoParcial = aproboSegundoParcial;
		    this.aproboTercerParcial = aproboTercerParcial;
		    this.aproboCuartoParcial = aproboCuartoParcial;
		    this.aproboRecuperatorio1 = aproboRecuperatorio1;
		    this.aproboRecuperatorio2 = aproboRecuperatorio2;
		    this.aproboTrabajoPractico = aproboTrabajoPractico;
		    this.aproboFinal = aproboFinal;
		
		}
	
	  /**
     * Determina si el alumno aprueba la materia según las reglas establecidas:
     * 
     * <p>Reglas:</p>
     * <ul>
     *   <li>Debe aprobar el trabajo práctico</li>
     *   <li>No puede desaprobar más de 2 parciales</li>
     *   <li>Si desaprueba 1 parcial, debe aprobar el recuperatorio 1</li>
     *   <li>Si desaprueba 2 parciales, debe aprobar ambos recuperatorios</li>
     *   <li>Debe aprobar el examen final</li>
     * </ul>
     * 
     * @pre Los atributos de la clase deben estar correctamente inicializados
     * @post No modifica el estado del objeto, solo evalúa la condición
     * @return true si aprueba la materia, false en caso contrario
     */
	
	
	
	public boolean aproboMateria() {

	    int desaprobados = 0;
	    
	    //Si el parcial fue aprobado es Verdadero, el if lo transforma en Falso y no incrementa

	    if (!aproboPrimerParcial) desaprobados++;
	    if (!aproboSegundoParcial) desaprobados++;
	    if (!aproboTercerParcial) desaprobados++;
	    if (!aproboCuartoParcial) desaprobados++;

	    // No aprobo el trabajo practico no se puede aprobar
	    if (!aproboTrabajoPractico) { 
	        return false;
	    }

	    // Mas de 2 desaprobados no se puede aprobar
	    if (desaprobados > 2) {
	        return false;
	    }

	   

	    // 1 desaprobado  se necesita al menos 1 recuperatorio aprobado
	    /* Si desaprobe un parcial el desaprobado == 1 es Verdadero
	    * Si aprobe el recuperatorio es Verdadero. por lo tanto el ~V lo transforma en Falso 
	    * entonces el if es falso y no entra el return, en cambio si es Falso que aprobe, el ~F,
	      se trasnforma en V, entonces el if es verdadero y retorna el false*/
	    
	    if (desaprobados == 1 && !aproboRecuperatorio1) {
	        return false;
	    }
	    

	    // 2 desaprobados se necesitan ambos recuperatorios aprobados
	    if (desaprobados == 2 && !(aproboRecuperatorio1 && aproboRecuperatorio2)) {
	    	return false;
	        
	    }
       // No aprobo final
	    if (!aproboFinal) { 	
           return false;
	    }
	    
	   	    
	    return true;
	}
}
