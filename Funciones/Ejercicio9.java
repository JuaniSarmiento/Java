package Funciones;
import java.util.Scanner;
public class Ejercicio9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.println("¿Cuántos productos desea ingresar?");
        int n = sc.nextInt();
        double[] preciosOriginales = new double[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Ingrese el precio original del producto " + (i + 1) + ":");
            preciosOriginales[i] = sc.nextDouble();
        }
        double[] preciosFinales = calcularPrecioFinal(preciosOriginales);
        System.out.println("\n--- Precios Finales con Descuento ---");
        for (int i = 0; i < n; i++) {
            System.out.println("Producto " + (i + 1) + ": Precio final = $" + preciosFinales[i]);
        }
    }
    public static double[] calcularPrecioFinal(double[] preciosOriginales) {
        double descuento = 0.10; // Descuento del 10%
        double[] preciosFinales = new double[preciosOriginales.length];


        for (int i = 0; i < preciosOriginales.length; i++) {
            preciosFinales[i] = preciosOriginales[i] * (1 - descuento);
        }

        return preciosFinales;
    }
}

