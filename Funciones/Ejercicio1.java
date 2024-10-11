
import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Cuantos elementos vas a ingresar");
        int n = sc.nextInt();
            Integer[] ventas = new Integer[n];
            calcularIngresosMensuales(ventas,n);
        }
        public static void calcularIngresosMensuales(Integer[] ventas, int n) {
            Scanner teclado = new Scanner(System.in);
            int totalIngresos=0;
            for (int i = 0; i < n; i++){
                System.out.println("Ingrese el valor de la venta "+(i+1));
                ventas[i] = teclado.nextInt();
                totalIngresos += ventas[i];;
            }
            System.out.println("Total ingresos de la venta: "+totalIngresos);
        }
    }

