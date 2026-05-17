package fabrica;

public class ControlCalidad {

    private final int[] a;

    public ControlCalidad(int[] a) {
        if (a == null) {
            throw new Error("El arreglo no puede ser null");
        }
        if (a.length == 0) {
            throw new Error("El arreglo no puede estar vacío");
        }
        this.a = a.clone(); 
    }

    private int cantidadDePiezasDefectuosas() {
        int piezasDefectuosas = 0;

        for (int i = 0; i < a.length; i++) {
            if (a[i] < 95 || a[i] > 105) {
                piezasDefectuosas++;
            }
        }

        return piezasDefectuosas;
    }

    private int cantidadDePiezasPerfectas() {
        int piezasPerfectas = 0;

        for (int i = 0; i < a.length; i++) {
            if (a[i] == 100) {
                piezasPerfectas++;
            }
        }

        return piezasPerfectas;
    }

    private double pesoPromedioPiezasNoDefectuosas() {
        int suma = 0;
        int contador = 0;

        for (int i = 0; i < a.length; i++) {
            if (a[i] >= 95 && a[i] <= 105) {
                suma += a[i];
                contador++;
            }
        }

        if (contador == 0) {
            return 0;
        }

        return (double) suma / contador;
    }

    private boolean hayAlerta() {
        return cantidadDePiezasDefectuosas() > a.length * 0.2;
    }

    public void informe() {
        int defectuosas = cantidadDePiezasDefectuosas();
        int perfectas = cantidadDePiezasPerfectas();
        double promedio = pesoPromedioPiezasNoDefectuosas();

        System.out.println("Cantidad de piezas defectuosas: " + defectuosas);
        System.out.println("Cantidad de piezas perfectas: " + perfectas);
        System.out.println("Peso promedio de piezas no defectuosas: " + promedio);

        if (hayAlerta()) {
            System.out.println("ALERTA: revisar linea de produccion");
        }
    }
}