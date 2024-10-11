package Funciones;
import java.util.Scanner;
public class Ejercicio8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.println("¿Cuántos empleados desea ingresar?");
        int n = sc.nextInt();
        sc.nextLine();


        String[] empleados = new String[n];

        int[] horasTrabajadas = new int[n];


        for (int i = 0; i < n; i++) {
            System.out.println("Ingrese el nombre del empleado " + (i + 1) + ":");
            empleados[i] = sc.nextLine();
            System.out.println("Ingrese las horas trabajadas por " + empleados[i] + ":");
            horasTrabajadas[i] = sc.nextInt();
            sc.nextLine();
        }


        calcularPagoSemanal(empleados, horasTrabajadas);
    }

    public static void calcularPagoSemanal(String[] empleados, int[] horasTrabajadas) {
        final int salarioPorHora = 15;

        System.out.println("\n--- Pagos Semanales ---");
        for (int i = 0; i < empleados.length; i++) {
            int pago = horasTrabajadas[i] * salarioPorHora;
            System.out.println(empleados[i] + ": $" + pago);
        }
    }
}

