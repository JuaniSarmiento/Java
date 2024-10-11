import java.util.Scanner;

public class Bucles {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Ejercicio 1: Cálculo del tiempo dedicado a cada actividad

        //String[] act = {"Estudiar", "Hacer ejercicios", "Leer", "Tiempo libre"};
        //int totalHoras = 0;


        //for (String actividad : act) {
        //    System.out.print("Ingrese las horas dedicadas a " + actividad + ": ");
        //  int horas = scanner.nextInt();
        //  totalHoras += horas;
        //}

        // System.out.println("El tiempo total dedicado a las actividades es: " + totalHoras + " horas.");


        //Ejercicio 2: Cálculo de salarios semanales
        // System.out.println("Ingrese la cantidad de empleados");
        //int cantidad = scanner.nextInt();
        //String empleado="Empleado";

        //for (int i = 1; i <= cantidad; i++) {
        //   System.out.println("Ingrese las horas que trabajo el empleado "+i);
        //  int horas = scanner.nextInt();
        //  System.out.println("El "+empleado+ " cobro "+horas*15);

        //}

        //Ejercicio 3: Control de inventario
        // int i=1;
        //int j=5;
        //while (i<=j) {
        //  System.out.println("Producto "+i);
        //  System.out.println("Ingrese el numero de productos");
        //  int productos = scanner.nextInt();
        //  if(productos<5){
        //      System.out.println("Es necesario realizar un pedido");
        //  }
        //  i=i+1;
        //}

        //Ejercicio 4: Registro de ventas diarias
        // int dia = 1;
        //double totalVentas = 0;

        //      while (dia <= 7) {
        //          System.out.print("Ingrese las ventas del día " + dia + ": ");
        //          double ventasDiarias = scanner.nextDouble();
        //          totalVentas += ventasDiarias;
        //          dia++;
        //      System.out.println("El total de ventas de la semana es: $" + totalVentas);
        //  }
        //}



        //Ejercicio 5: Cálculo de horas extras
        System.out.print("Ingrese el numero de empleados ");
        int empleados = scanner.nextInt();
        int i=1;

        do {
            System.out.println("Ingrese las horas trabajadas del empelado "+i);
            int horas = scanner.nextInt();
            i=i+1;
            if (horas>40) {
                System.out.println("El numero de horas extras trabajadas son: "+(horas - 40));
            }
        }while (i<=empleados);
    }
}
