import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Cuantos productos vas a ingresar?");
        int n = sc.nextInt();
        String[] productos = new String[n];
        Integer[] stocks = new Integer[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Ingrese el nombre del producto " + (i + 1) + ":");
            productos[i]=sc.next();
            System.out.println("Ingrese el stock del producto " + productos[i] + ":");
            stocks[i]=sc.nextInt();

        }
        generarReporteBajoStock( productos,  stocks, n);

    }
    public static void generarReporteBajoStock(String[] productos, Integer[] stocks, int n) {
        for (int j = 0; j < n; j++) {
            System.out.println("Producto: " + productos[j]);
            System.out.println("Stock: " + stocks[j]);
            if (stocks[j]<5) {
                System.out.println("Producto con menos de 5 unidades.");
            }
        }
    }
}

