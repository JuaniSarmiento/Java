import java.util.Locale;
import java.util.Scanner;
import java.util.Random;
public class   Condicionales {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        //Ejercicio 1: Sistema de Recomendación de Películas

        // System.out.println("Cual es tu genero de peliculas preferido?");
        //System.out.println("Accion");
        // System.out.println("Comedia");
        //System.out.println("Drama");
        //System.out.println("Ficción");
        //String genero = scanner.nextLine().toLowerCase();
        //switch (genero) {
        //  case "accion":
        //      System.out.println("Te recomiendo ver: 'Mad Max: Fury Road'");
        //      break;
        //  case "comedia":
        //      System.out.println("Te recomiendo ver: 'Superbad'");
        //       break;
        //  case "drama":
        //      System.out.println("Te recomiendo ver: 'La La Land'");
        //      break;
        //  case "ficcion":
        //      System.out.println("Te recomiendo ver: 'Inception'");
        //      break;
        //  default:
        //      System.out.println("Género no válido. Por favor elige entre Acción, Comedia, Drama o Ficción.");
        //      break;

        //Ejercicio 2: Calculadora de Descuentos

        // System.out.println("Ingresa el precio del producto");
        //double precio = scanner.nextDouble();
        //scanner.nextLine();
        //System.out.println("Ingresa si sos Estudiante, Adulto, Jubilado");
        //String edad = scanner.nextLine().toLowerCase();
        //if (edad.equals("estudiante")) {
        //  System.out.println("El precio con descuento para estudiantes es: " + precio*0.90);
        //} else if (edad.equals("adulto")) {
        //    System.out.println("El precio con descuento para adultos es: " + precio*0.95);
        //} else if (edad.equals("jubilado")) {
        //    System.out.println("El precio con descuento para jubilados es: " + precio*0.85);

        //Ejercicio 3: Sistema de Recomendación de Libros

        // System.out.println("Cual es tu genero de libroa preferido?");
        //System.out.println("Fantasía");
        //System.out.println("Misterio");
        //System.out.println("Romance");
        //System.out.println("Ciencia Ficción");
        //String genero_pelicula = scanner.nextLine().toLowerCase();
        //switch (genero_pelicula) {
        //  case "fantasia":
        //      System.out.println("Recomendación de libro de Fantasía: 'El Señor de los Anillos' de J.R.R. Tolkien");
        //      break;
        //  case "misterio":
        //       System.out.println("Recomendación de libro de Misterio: 'El Código Da Vinci' de Dan Brown");
        //      break;
        //  case "romance":
        //      System.out.println("Recomendación de libro de Romance: 'Orgullo y Prejuicio' de Jane Austen");
        //      break;
        //  case "ciencia ficcion":
        //      System.out.println("Recomendación de libro de Ciencia Ficción: 'Dune' de Frank Herbert");
        //      break;
        //  default:
        //      System.out.println("Género no válido. Por favor, elige entre Fantasía, Misterio, Romance o Ciencia Ficción.");
        //      break;

        //Ejercicio 4: Calculadora de IMC con Recomendaciones

        // System.out.println("Ingresa su peso");
        //double peso = scanner.nextDouble();
        //System.out.println("Ingresa su altura en metros");
        //double altura = scanner.nextDouble();
        //double imc=peso/(altura*altura);
        //if (imc<18.5 && imc>0) {
        //    System.out.println("El imc es: "+imc);
        //  System.out.println("El imc es muy bajo");
        //  System.out.println("Consulta a un profesional de salud para obtener un plan de alimentación que te ayude a ganar peso de forma saludable." );
        //} else if (imc>=18.5 && imc<25) {
        //  System.out.println("El imc es: "+imc);
        //  System.out.println("El imc es normal");
        //  System.out.println("Mantén tu peso actual mediante una dieta equilibrada y continua actividad física regular.");
        //} else if (imc>=25 && imc<30) {
        //  System.out.println("El imc es: "+imc);
        //  System.out.println("El imc es alto");
        //  System.out.println("Considera hacer ajustes en tu dieta, reduciendo la ingesta de alimentos ricos en grasas y azúcares");

        //}else if (imc>=30) {
        // System.out.println("El imc es: "+imc);
        //  System.out.println("El imc es muy alto");
        //  System.out.println("Es recomendable consultar a un médico o un nutricionista para obtener un plan adecuado que incluya una dieta controlada y un programa de ejercicios");
        //}else {
        //  System.out.println("Algun dato ingresado es incorrecto");

        //Ejercicio 5: Juego de Piedra, Papel o Tijera

        //System.out.println("Juego Piedra, Papel y Tijeras");
        //System.out.print("Elije entre \n 1:Piedra\n 2:Papel \n 3:Tijeras \n");
        //int eleccion_usuario = scanner.nextInt();
        //int eleccion_cpu = (int) (Math.random() *3)+1;
        //System.out.println(eleccion_cpu);
        //if (eleccion_usuario==1) {
        //  if (eleccion_cpu==1) {
        //      System.out.println("Empate");
        //  }else if (eleccion_cpu==2) {
        //      System.out.println("Gano la CPU");
        //  }else if (eleccion_cpu==3) {
        //      System.out.println("Gano el Usuario");
        //  }
        // }
        //if (eleccion_usuario==2) {
        //  if (eleccion_cpu==1) {
        //      System.out.println("Gano el Usuario");

        //  }else if (eleccion_cpu==2) {
        //      System.out.println("Empate");
        //  }else if (eleccion_cpu==3) {
        //      System.out.println("Gano la CPU");
        //    }
        //}
        //if (eleccion_usuario==3) {
        //  if (eleccion_cpu==1) {
        //      System.out.println("Gano La CPU");

        //          }else if (eleccion_cpu==2) {
        //      System.out.println("Gano el Usuario");

        //  }else if (eleccion_cpu==3) {
        //      System.out.println("Empate");
        //  }
        //}

        //Ejercicio 6: Evaluador de Hábitos Saludables

        //System.out.println("Cuantas horas duermes?");
        //int dormir = scanner.nextInt();
        //System.out.println("Cuantos horas haces ejercicio?");
        //int ejercicio= scanner.nextInt();
        //System.out.println("Cuantas comidas saludables consumes al dia");
        //int comidas = scanner.nextInt();
        // int total_habitos = dormir + ejercicio + comidas;
        //if (total_habitos >= 20) {
        //   System.out.println("¡Excelente! Tienes muy buenos hábitos saludables.");
        //} else if (total_habitos >= 12) {
        //  System.out.println("Estás en el camino correcto, pero podrías mejorar algunos aspectos.");
        //} else {
        //  System.out.println("Deberías mejorar tus hábitos saludables.");
        //}

        //Ejercicio 7: Sistema de Recomendación de Actividades

        System.out.println("¿Cómo te sientes hoy? (feliz, triste, enérgico, relajado)");
        String estadoAnimo = scanner.nextLine().toLowerCase();  // Convertimos a minúsculas para evitar errores por mayúsculas
        if (estadoAnimo.equals("feliz")) {
            System.out.println("¡Qué bueno que te sientes feliz! ¿Por qué no sales a pasear con amigos o escuchas tu música favorita?");
        }else if (estadoAnimo.equals("triste")) {
            System.out.println("Siento que te sientas triste. Quizás te ayude ver una película que te guste o hablar con alguien cercano.");
        }else if (estadoAnimo.equals("energico")) {
            System.out.println("¡Estás lleno de energía! Sería genial que hicieras ejercicio o comenzaras un proyecto que te entusiasme.");

        } else if (estadoAnimo.equals("relajado")) {
            System.out.println("Estás relajado. Tal vez te gustaría leer un buen libro o disfrutar de un baño caliente.");

        }
        else {
            System.out.println("No reconozco ese estado de ánimo. Por favor, elige entre feliz, triste, enérgico o relajado.");
        }
    }



    }





