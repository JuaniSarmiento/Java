import java.util.Scanner;
public class BuclesAnidados {
    public static void main(String[] args) {

        //Mostrar los números perfectos entre 1 y 1000.
        //   int i, j, suma;
        //  System.out.println("Números perfectos entre 1 y 1000: ");
        //  for(i=1;i <= 1000;i++){
        //      suma = 0;
        //      for(j = 1;j < i;j++){
        //          if(i % j==0){
        //              suma = suma + j;
        //          }
        //      }
        //      if(i == suma){
        //          System.out.println(i);
        //      }
        //  }


        //Leer un número N y calcular el factorial de los números desde 0 hasta N.
        //int N;
        //double factorial;
        //Scanner sc = new Scanner(System.in);


        //do {
        //  System.out.print("Introduce un número > 0: ");
        //  N = sc.nextInt();
        //} while (N < 0);
        // for (int i = 0; i <= N; i++) {

        //  factorial = 1;
        //  for (int j = 1; j <= i; j++) {
        //      factorial = factorial * j;
        //  }
        //  System.out.printf("%2d! = %.0f %n", i, factorial);
        //}


        //Leer un número N y calcular la suma de los factoriales de los números desde 0 hasta N.
        // int sumatotal=0;
        //int fact=1;
        //int j=0;
        //Scanner sc = new Scanner(System.in);
        // System.out.println("Hasta que numero quieres sumar su factorial");
        //int n = sc.nextInt();
        //for (int i = 1; i <= n; i++) {
        //  for ( j = i; j > 0; j--) {
        //      fact = fact * j;
        //  }

        //  System.out.println("El factorial del numero " + i + " es " + fact);
        //  sumatotal=sumatotal+fact;
        //  fact=1;
        //}
        //System.out.println("La suma total de todos los factoriales es "+sumatotal);


        //Programa que muestre en lineas separadas lo siguiente: ZYWXVUTSRQPONMLKJIHGFEDCBA, YWXVUTSRQPONMLKJIHGFEDCBA, WXVUTSRQPONMLKJIHGFEDCBA..................
        //   for (char x = 'Z'; x >= 'A'; x--) {
        //          for (char y = x; y >= 'A'; y--) {
        //              System.out.print(y);
        //          }
        //          System.out.println();
        //      }


        //Mostrar un contador de 5 dígitos. En lugar del dígito 3 se debe mostrar E
        //  for (int i = 0; i <= 9; i++) {
        //  for (int j = 0; j <= 9; j++) {
        //      for (int k = 0; k <= 9; k++) {
        //          for (int l = 0; l <= 9; l++) {
        //              for (int m = 0; m <= 9; m++) {
        //                  System.out.print(i != 3 ? i : "E");
        //                  System.out.print(j != 3 ? j : "E");
        //                  System.out.print(k != 3 ? k : "E");
        //                  System.out.print(l != 3 ? l : "E");
        //                  System.out.println(m != 3 ? m : "E");
        //              }
        //          }
        //      }
        //  }
        //}

//Mostrar los números primos desde 2 hasta N
        int N, i, j;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.print("Introduce un numero > 0: ");
            N = sc.nextInt();
        } while (N <= 0);
        System.out.println("Números primos desde 1 hasta " + N);

        for (j = 2; j <= N; j++) {    // j es el número que se comprueba si es primo
            i = 2;                // i son los divisores
            while (j % i != 0) {
                i++;
            }
            if (i == j) { // si se ha dividido por el propio número entonces es primo
                System.out.println(j);
            }
        }
    }
}


