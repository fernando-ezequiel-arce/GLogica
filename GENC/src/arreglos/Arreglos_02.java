package arreglos;

public class Arreglos_02 {

    private String[] nombresFrutas;

    /**
     * PRE: el arreglo de nombresFrutas no puede ser null y sus elementos deben ser Strings válidos.
     * POST: se crea un objeto Arreglos_02 con una copia defensiva del arreglo recibido,
     *       normalizando y validando cada elemento.
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

    private String normalizar(String texto) {
        if (texto == null) return null;
        return texto.trim().replaceAll("\\s+", " ");
    }

    private boolean esNombreValido(String texto) {
        if (texto == null) return false;
        return texto.matches("[a-zA-Z ]+");
    }

    /**
     * PRE: el nombre no puede ser null y debe ser válido.
     * POST: devuelve true si la fruta existe en el arreglo, false en caso contrario.
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
     * PRE: el nombre no puede ser null.
     * POST: imprime si la fruta fue encontrada o no.
     */
    public void existeLaFruta(String nombre) {

        if (contieneFruta(nombre)) {
            System.out.println("La fruta fue encontrada");
        } else {
            System.out.println("La fruta no fue encontrada");
        }
    }

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

    public void imprimeArreglo() {
        System.out.println(obtenerFrutasFormateadas());
    }

    private String obtenerFrutas() {
        return java.util.Arrays.toString(nombresFrutas);
    }

    public void imprime() {
        System.out.println(obtenerFrutas());
    }

    /**
     * PRE: el arreglo debe estar inicializado.
     * POST: devuelve la posición de la primera "naranja" o -1 si no existe.
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
     * PRE: el arreglo debe estar inicializado.
     * POST: imprime la posición de la primera naranja encontrada.
     */
    public void imprimePosicionDeLaPrimerNaranjaEncontrada() {

        int posicion = buscarNaranja();

        if (posicion != -1) {
            System.out.println("La posición de la primera naranja encontrada es: " + posicion);
        }
    }

    /**
     * PRE: el arreglo debe estar inicializado.
     * POST: devuelve un arreglo con todas las posiciones de "naranja".
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

        return posiciones;
    }

    /**
     * PRE: el arreglo debe estar inicializado.
     * POST: imprime todas las posiciones de "naranja".
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
     * PRE: el nombre debe ser válido.
     * POST: devuelve un arreglo con todas las posiciones donde aparece la fruta.
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
     * PRE: el nombre debe ser válido.
     * POST: imprime las posiciones donde aparece la fruta o informa si no existe.
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