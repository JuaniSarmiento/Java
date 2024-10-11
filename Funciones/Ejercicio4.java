package Funciones;

import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de clientes");
        int cantidad = sc.nextInt();
            String[] clientes = new String[cantidad];
            Integer[] compras = new Integer[cantidad];
        for (int i = 0; i < cantidad; i++) {
            System.out.println("Ingrese el nombre del cliente");
            clientes[i] = sc.next();
            System.out.println("Ingrese la cantiad de compras");
            compras[i] = sc.nextInt();
        }
            calcularDescuentos(clientes, compras, cantidad);
    }
    public static void calcularDescuentos(String[] clientes, Integer[] compras, int cantidad) {
        for (int i = 0; i < cantidad; i++) {
            if (compras[i]>10){
                System.out.println("El cliente "+clientes[i]+" recibe el descuento del 10%");
            }
        }
    }
}
