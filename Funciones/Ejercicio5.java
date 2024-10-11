package Funciones;
import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int total=0;

        System.out.println("Ingresa las puntuaciones (1-10)");
        for (int i=0;i<5;i++){
            int puntuacion=sc.nextInt();
            total=puntuacion+total;

        }
        calcularPromedioSatisfaccion(total);
    }
    public static void calcularPromedioSatisfaccion(int total){
        double promedio= (double) total /5;
        if (promedio<=3){
            System.out.println("La satisfaccion es baja");
        } else if (promedio<=7) {
            System.out.println("La satisfaccion es media");
        } else if (promedio<=10) {
            System.out.println("La satisfaccion es la mas alta");
        }else {
            System.out.println("Error");
        }
    }
}
