package arreglos;

public class Arreglos_02 {
    
    private String[] nombresFrutas;
  
    public Arreglos_02(String[] nombresFrutas) {
    	
        if (nombresFrutas == null) {
            throw new Error("El array es null");
        }

        this.nombresFrutas = new String[nombresFrutas.length];
        /** Se realiza una copia defensiva creando un nuevo arreglo con el mismo tamaño que el recibido. 
         * Esto evita que el arreglo externo modifique el estado interno del objeto.
         */

        for (int i = 0; i < nombresFrutas.length; i++) {

            String normalizada = normalizar(nombresFrutas[i]);
            
            // Se declara una variable local y se le asigna el valor retornado por el método normalizar
            
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
    
    private int buscarNaranja() {

        int posicion = -1;
        boolean encontrado = false;

        for (int i = 0; i < nombresFrutas.length && !encontrado; i++) {

            if (nombresFrutas[i].equalsIgnoreCase("naranja")) {
                encontrado = true;
                posicion = i;
            }
        }

        return posicion;
    }
    
    public void imprimePosicionDeLaPrimerNaranjaEncontrada() {

        int posicion = buscarNaranja();

        if (posicion != -1) {
            System.out.println("La posición de la primera naranja encontrada es: " + posicion);
        }
    }
    
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
    
    public void imprimePosicionDeTodasLasNaranjasEncontradas() {

        int[] posiciones = buscarTodasLasNaranjas();

        if (posiciones.length == 0) {
            System.out.println("No se encontraron naranjas");
            return;
        }

        System.out.println("Posiciones de las naranjas: " + java.util.Arrays.toString(posiciones));
    }
    
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
    
    public void imprimePosicionesDeFruta(String nombre) {

        int[] posiciones = buscarTodasLasFrutas(nombre);

        if (posiciones.length == 0) {
            System.out.println("No se encontró la fruta: " + nombre);
            return;
        }

        System.out.println("Posiciones de " + nombre + ": " + java.util.Arrays.toString(posiciones));
    }
}