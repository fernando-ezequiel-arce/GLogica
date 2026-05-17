package arreglos;

/**
 * Clase que permite almacenar y operar sobre un conjunto de nombres de frutas.
 * Los nombres se normalizan y validan al momento de la construcción del objeto.
 */
public class Arreglos_02 {

    private String[] nombresFrutas;

    /**
     * Constructor de la clase.
     *
     * PRE: 
     * - nombresFrutas != null
     * - cada elemento del arreglo debe ser un String válido (solo letras y espacios)
     * 
     * POST:
     * - se crea una copia defensiva del arreglo recibido
     * - todos los elementos quedan normalizados (sin espacios extra)
     * - todos los elementos cumplen con el formato válido
     * 
     * @param nombresFrutas arreglo de nombres de frutas
     */
    public Arreglos_02(String[] nombresFrutas) {

        if (nombresFrutas == null) {
            throw new Error("El array es null");
        }

        this.nombresFrutas = new String[nombresFrutas.length];

        for (int i = 0; i < nombresFrutas.length; i++) {

            String normalizada = normalizar(nombresFrutas[i]);

            if (!esNombreValido(normalizada)) {
                throw new Error("El texto es inválido");
            }

            this.nombresFrutas[i] = normalizada;
        }
    }

    /**
     * Normaliza un texto eliminando espacios innecesarios.
     *
     * PRE:
     * - texto puede ser null
     * 
     * POST:
     * - si texto == null → devuelve null
     * - elimina espacios al inicio y al final
     * - reemplaza múltiples espacios internos por uno solo
     * 
     * @param texto texto a normalizar
     * @return texto normalizado o null
     */
    private String normalizar(String texto) {
        if (texto == null) return null;
        return texto.trim().replaceAll("\\s+", " ");
    }

    /**
     * Verifica si un nombre es válido.
     *
     * PRE:
     * - texto puede ser null
     * 
     * POST:
     * - devuelve true si el texto contiene solo letras y espacios
     * - devuelve false en caso contrario
     * 
     * @param texto texto a validar
     * @return true si es válido, false si no
     */
    private boolean esNombreValido(String texto) {
        if (texto == null) return false;
        return texto.matches("[a-zA-Z ]+");
    }

    /**
     * Indica si una fruta se encuentra en el arreglo.
     *
     * PRE:
     * - nombre != null
     * - nombre debe ser válido
     * 
     * POST:
     * - devuelve true si existe al menos una coincidencia
     * - devuelve false en caso contrario
     * 
     * @param nombre nombre de la fruta a buscar
     * @return true si existe, false si no
     */
    private boolean contieneFruta(String nombre) {

        String buscada = normalizar(nombre);

        if (!esNombreValido(buscada)) {
            throw new Error("Nombre inválido");
        }

        for (String fruta : nombresFrutas) {
            if (fruta.equalsIgnoreCase(buscada)) {
                return true;
            }
        }

        return false;
    }

    /**
     * Informa por consola si una fruta existe en el arreglo.
     *
     * PRE:
     * - nombre != null
     * 
     * POST:
     * - imprime si la fruta fue encontrada o no
     * 
     * @param nombre nombre de la fruta a buscar
     */
    public void existeLaFruta(String nombre) {

        if (contieneFruta(nombre)) {
            System.out.println("La fruta fue encontrada");
        } else {
            System.out.println("La fruta no fue encontrada");
        }
    }

    /**
     * Genera un String con las frutas formateadas por índice.
     *
     * PRE:
     * - el arreglo está inicializado
     * 
     * POST:
     * - devuelve un String con cada fruta y su índice correspondiente
     * 
     * @return String formateado
     */
    private String obtenerFrutasFormateadas() {

        StringBuilder resultado = new StringBuilder();

        for (int i = 0; i < nombresFrutas.length; i++) {
            resultado.append("Indice: ")
                     .append(i)
                     .append(" Nombre: ")
                     .append(nombresFrutas[i])
                     .append("\n");
        }

        return resultado.toString();
    }

    /**
     * Imprime el arreglo formateado.
     *
     * PRE:
     * - el arreglo está inicializado
     * 
     * POST:
     * - imprime todas las frutas con su índice
     */
    public void imprimeArreglo() {
        System.out.println(obtenerFrutasFormateadas());
    }

    /**
     * Devuelve una representación simple del arreglo.
     *
     * PRE:
     * - el arreglo está inicializado
     * 
     * POST:
     * - devuelve un String con el contenido del arreglo
     * 
     * @return String con las frutas
     */
    private String obtenerFrutas() {
        return java.util.Arrays.toString(nombresFrutas);
    }

    /**
     * Imprime el arreglo en formato simple.
     *
     * PRE:
     * - el arreglo está inicializado
     * 
     * POST:
     * - imprime el contenido del arreglo
     */
    public void imprime() {
        System.out.println(obtenerFrutas());
    }

    /**
     * Busca la primera aparición de "naranja".
     *
     * PRE:
     * - el arreglo está inicializado
     * 
     * POST:
     * - devuelve el índice de la primera ocurrencia de "naranja"
     * - devuelve -1 si no existe
     * 
     * @return índice o -1
     */
    private int buscarNaranja() {

        for (int i = 0; i < nombresFrutas.length; i++) {
            if (nombresFrutas[i].equalsIgnoreCase("naranja")) {
                return i;
            }
        }

        return -1;
    }

    /**
     * Imprime la posición de la primera naranja encontrada.
     *
     * PRE:
     * - el arreglo está inicializado
     * 
     * POST:
     * - imprime la posición si existe al menos una "naranja"
     */
    public void imprimePosicionDeLaPrimerNaranjaEncontrada() {

        int posicion = buscarNaranja();

        if (posicion != -1) {
            System.out.println("La posición de la primera naranja encontrada es: " + posicion);
        }
    }

    /**
     * Busca todas las posiciones donde aparece "naranja".
     *
     * PRE:
     * - el arreglo está inicializado
     * 
     * POST:
     * - devuelve un arreglo con las posiciones de todas las ocurrencias
     * - si no hay coincidencias, devuelve un arreglo vacío
     * 
     * @return arreglo de posiciones
     */
    private int[] buscarTodasLasNaranjas() {

        int[] temp = new int[nombresFrutas.length];
        int j = 0;

        for (int i = 0; i < nombresFrutas.length; i++) {

            if (nombresFrutas[i].equalsIgnoreCase("naranja")) {
                temp[j] = i;
                j++;
            }
        }

        int[] posiciones = new int[j];

        for (int k = 0; k < j; k++) {
            posiciones[k] = temp[k];
            
        }
        
        //  

        return posiciones;
    }

    /**
     * Imprime todas las posiciones donde aparece "naranja".
     *
     * PRE:
     * - el arreglo está inicializado
     * 
     * POST:
     * - imprime todas las posiciones o informa si no existen
     */
    public void imprimePosicionDeTodasLasNaranjasEncontradas() {

        int[] posiciones = buscarTodasLasNaranjas();

        if (posiciones.length == 0) {
            System.out.println("No se encontraron naranjas");
            return;
        }

        System.out.println("Posiciones de las naranjas: " + java.util.Arrays.toString(posiciones));
    }

    /**
     * Busca todas las posiciones donde aparece una fruta dada.
     *
     * PRE:
     * - nombre != null
     * - nombre debe ser válido
     * 
     * POST:
     * - devuelve un arreglo con todas las posiciones donde aparece la fruta
     * - si no hay coincidencias, devuelve un arreglo vacío
     * 
     * @param nombre fruta a buscar
     * @return arreglo de posiciones
     */
    private int[] buscarTodasLasFrutas(String nombre) {

        String buscada = normalizar(nombre);

        if (!esNombreValido(buscada)) {
            throw new Error("Nombre inválido");
        }

        int[] temp = new int[nombresFrutas.length];
        int j = 0;

        for (int i = 0; i < nombresFrutas.length; i++) {

            if (nombresFrutas[i].equalsIgnoreCase(buscada)) {
                temp[j] = i;
                j++;
            }
        }

        int[] posiciones = new int[j];

        for (int k = 0; k < j; k++) {
            posiciones[k] = temp[k];
        }

        return posiciones;
    }

    /**
     * Imprime las posiciones donde aparece una fruta dada.
     *
     * PRE:
     * - nombre != null
     * - nombre debe ser válido
     * 
     * POST:
     * - imprime las posiciones encontradas
     * - si no existe, informa por consola
     * 
     * @param nombre fruta a buscar
     */
    public void imprimePosicionesDeFruta(String nombre) {

        int[] posiciones = buscarTodasLasFrutas(nombre);

        if (posiciones.length == 0) {
            System.out.println("No se encontró la fruta: " + nombre);
            return;
        }

        System.out.println("Posiciones de " + nombre + ": " + java.util.Arrays.toString(posiciones));
    }
}