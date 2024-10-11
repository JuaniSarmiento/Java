import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("¿Cuántas facturas desea ingresar?");
        int n = sc.nextInt();
        double[] facturas = new double[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Ingrese el monto de la factura " + (i + 1) + ":");
            facturas[i] = sc.nextDouble();
        }
        double[] impuestos = calcularImpuesto(facturas);
        System.out.println("\n--- Detalle de facturas con impuestos ---");
        for (int i = 0; i < n; i++) {
            System.out.println("Factura " + (i + 1) + ": Monto original = $" + facturas[i] + ", Impuesto aplicado = $" + impuestos[i]);
        }
    }
    public static double[] calcularImpuesto(double[] facturas) {
        double[] impuestos = new double[facturas.length];

        for (int i = 0; i < facturas.length; i++) {
            impuestos[i] = facturas[i] * 0.21;
        }

        return impuestos;
    }
}
