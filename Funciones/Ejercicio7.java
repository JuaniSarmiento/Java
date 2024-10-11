package Funciones;
import java.util.Scanner;
public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("¿Cuántas compras desea ingresar?");
        int n = sc.nextInt();
        double[] compras = new double[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Ingrese el monto de la compra " + (i + 1) + ":");
            compras[i] = sc.nextDouble();
        }
        aplicarDescuento(compras);

        System.out.println("\n--- Detalle de compras con posibles descuentos ---");
        for (int i = 0; i < n; i++) {
            System.out.println("Compra " + (i + 1) + ": Monto final = $" + compras[i]);
        }
    }

    public static void aplicarDescuento(double[] compras) {
        for (int i = 0; i < compras.length; i++) {
            if (compras[i] > 500) {
                compras[i] = compras[i] * 0.85;
            }
        }
    }
}

