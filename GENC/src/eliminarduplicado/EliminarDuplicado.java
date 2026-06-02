package eliminarduplicado;

import java.util.Arrays;

public class EliminarDuplicado {

    private int[] a;

    public EliminarDuplicado() {
        this.a = new int[]{1, 3, 5, 3, 7, 1, 9, 5, 3};
    }

    // Getter para acceder al array original
    public int[] getA() {
        return a;
    }

    // Método para imprimir cualquier array
    public void imprimir(int[] arr) {
        System.out.println(Arrays.toString(arr));
    }

    // Método que elimina duplicados
    private int[] eliminarDuplicados() {
        int[] resultado = new int[a.length];
        int tam = 0;

        for (int i = 0; i < a.length; i++) {
            boolean yaEsta = false;

            for (int j = 0; j < tam && !yaEsta; j++) {
                if (a[i] == resultado[j]) {
                    yaEsta = true;
                }
            }

            if (!yaEsta) {
                resultado[tam] = a[i];
                tam++;
            }
        }

        // Crear array final con tamaño exacto
        int[] finalResultado = new int[tam];
        for (int i = 0; i < tam; i++) {
            finalResultado[i] = resultado[i];
        }

        return finalResultado;
    }

    public static void main(String[] args) {

        EliminarDuplicado obj = new EliminarDuplicado();

        // imprimir array original
        obj.imprimir(obj.getA());

        // eliminar duplicados
        int[] sinDuplicados = obj.eliminarDuplicados();

        // imprimir resultado
        obj.imprimir(sinDuplicados);
    }
}
		
		
		
		

