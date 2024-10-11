package Funciones;

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    String[] clientes = new String[5];
    Integer[] facturasPendientes = new Integer[5];
    for (int i = 0; i < 5; i++) {
        System.out.println("Ingrese el nombre del cliente: ");
         clientes[i] = sc.nextLine();
         System.out.println("Ingrese el monto de la factura: ");
         facturasPendientes[i] = sc.nextInt();

        sc.nextLine();
    }
        enviarFacturas(clientes,facturasPendientes);
    }
    public static void enviarFacturas(String[] clientes,Integer[] facturasPendientes) {
        int j=0;
        for (j=0;j<5;j++){
            if (facturasPendientes[j]>500){
                System.out.println(clientes[j] +" debe facturas de montos mayores a 500$");
            }
        }
    }
}

