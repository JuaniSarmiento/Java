
import java.util.Scanner;

public class Secuenciales {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Ejercicio 1: Generador de Horóscopo

        //System.out.println("Ingresa tu fecha de nacimiento (DD/MM/AAAA):");
        //String fechaNacimiento = scanner.nextLine();
        //String[] partes = fechaNacimiento.split("/");
        //int dia = Integer.parseInt(partes[0]);
        //int mes = Integer.parseInt(partes[1]);
        //String signo = "";
        //String mensajeHoroscopo = "";
        //if ((dia >= 21 && mes == 3) || (dia <= 19 && mes == 4)) {
            //signo = "Aries";
            //mensajeHoroscopo = "Hoy es un buen día para tomar la iniciativa en un proyecto nuevo.";
            //} else if ((dia >= 20 && mes == 4) || (dia <= 20 && mes == 5)) {
            //signo = "Tauro";
            //mensajeHoroscopo = "Relájate y disfruta de los pequeños placeres de la vida.";
            //} else if ((dia >= 21 && mes == 5) || (dia <= 20 && mes == 6)) {
            //signo = "Géminis";
            //mensajeHoroscopo = "Es un buen día para la comunicación y la conexión con los demás.";
            //} else if ((dia >= 21 && mes == 6) || (dia <= 22 && mes == 7)) {
            //signo = "Cáncer";
            //mensajeHoroscopo = "Hoy te sentirás especialmente conectado con tus emociones.";
            //} else if ((dia >= 23 && mes == 7) || (dia <= 22 && mes == 8)) {
            //signo = "Leo";
            //mensajeHoroscopo = "Es un día para brillar y mostrar tu creatividad al mundo.";
            //} else if ((dia >= 23 && mes == 8) || (dia <= 22 && mes == 9)) {
            // signo = "Virgo";
            //mensajeHoroscopo = "Organiza tu entorno y verás cómo mejora tu productividad.";
            // } else if ((dia >= 23 && mes == 9) || (dia <= 22 && mes == 10)) {
            //signo = "Libra";
            //mensajeHoroscopo = "Busca el equilibrio en tus relaciones y en tu vida diaria.";
            //} else if ((dia >= 23 && mes == 10) || (dia <= 21 && mes == 11)) {
            //signo = "Escorpio";
            //mensajeHoroscopo = "Hoy es un buen día para profundizar en tus emociones y tus deseos.";
            //} else if ((dia >= 22 && mes == 11) || (dia <= 21 && mes == 12)) {
            //signo = "Sagitario";
            //mensajeHoroscopo = "La aventura te llama, aprovecha la oportunidad de algo nuevo.";
            //} else if ((dia >= 22 && mes == 12) || (dia <= 19 && mes == 1)) {
            //signo = "Capricornio";
            //mensajeHoroscopo = "El trabajo duro dará sus frutos, mantén el enfoque.";
            // } else if ((dia >= 20 && mes == 1) || (dia <= 18 && mes == 2)) {
            //signo = "Acuario";
            //mensajeHoroscopo = "Hoy es un buen día para pensar de manera creativa y original.";
            //} else if ((dia >= 19 && mes == 2) || (dia <= 20 && mes == 3)) {
            // signo = "Piscis";
            //mensajeHoroscopo = "Conéctate con tu lado artístico y deja volar tu imaginación.";
            // }
        //System.out.println("Tu signo del zodiaco es: " + signo);
        //  System.out.println("Horóscopo: " + mensajeHoroscopo);


        //Ejercicio 2: Calculadora de Calorías Quemadas

        //System.out.println("Ingresa tu peso");
        //float peso = scanner.nextFloat();
        //System.out.println("Cuanto tiempo vas a hacer ejercicio? en minutos");
        //double tiempo = scanner.nextDouble();
        //System.out.println("Elije el tipo de ejercicio para realizar \n 1:Correr \n 2:Nadar \n 3:Andar en bicicleta");
        //int tipo = scanner.nextInt();
        //switch (tipo){
        //    case 1:
        //        System.out.println("Las calorias quemadas por correr son "+tiempo*2);
        //        break;
        //    case 2:
        //        System.out.println("Las calorias quemadas por nadar son "+tiempo*3);
        //        break;
        //    case 3:
        //        System.out.println("Las calorias quemadas por andar en bicicleta son "+tiempo*2.5);
                   //break;
        //     default:
        //        System.out.println("Entrenamiento no válido. Por favor, selecciona 1, 2 o 3.");



        //Ejercicio 3: Generador de Rutinas de Ejercicio

        //System.out.println("Ingrese su nivel fisico");
        //System.out.println("1. Principiante");
        //System.out.println("2. Intermedio");
        // System.out.println("3. Avanzado");
        //int nivelFisico = scanner.nextInt();
        //switch (nivelFisico) {
        //        case 1:
        //            System.out.println("Rutina para Principiante:");
        //            System.out.println("- 3 series de 10 flexiones");
        //            System.out.println("- 3 series de 15 sentadillas");
        //            System.out.println("- 3 series de 20 abdominales");
        //            System.out.println("- 15 minutos de caminata rápida o bicicleta");
        //            break;

        //         case 2:
        //            System.out.println("Rutina para Intermedio:");
        //            System.out.println("- 4 series de 15 flexiones");
        //            System.out.println("- 4 series de 20 sentadillas");
        //            System.out.println("- 4 series de 25 abdominales");
        //            System.out.println("- 20 minutos de trote o bicicleta");
        //            System.out.println("- 3 series de 10 burpees");
        //            break;

        //        case 3:
        //            System.out.println("Rutina para Avanzado:");
        //            System.out.println("- 5 series de 20 flexiones");
        //            System.out.println("- 5 series de 25 sentadillas");
        //            System.out.println("- 5 series de 30 abdominales");
        //            System.out.println("- 30 minutos de correr o bicicleta a alta intensidad");
        //            System.out.println("- 4 series de 15 burpees");
        //            System.out.println("- 4 series de 10 saltos en caja");
        //            break;

        //        default:
        //            System.out.println("Nivel no válido. Por favor, selecciona 1, 2 o 3.");



        //Ejercicio 4: Generador de Listas de Reproducción

        //System.out.println("Ingresa el estado de animo \n 1:Feliz \n 2:Triste \n 3:Energico \n 4:Relajado");
        //int estado = scanner.nextInt();
        //switch (estado) {
        //    case 1:
        //        System.out.println("Lista de reproducción para cuando estás Feliz:");
        //        System.out.println("- 'Party' de Bad Bunny ft. Rauw Alejandro");
        //      System.out.println("- 'Peppas' de Farruko");
        //      System.out.println("- 'Feliz Cumpleaños Ferxxo' de Feid");
        //      System.out.println("- 'Baila Baila Baila' de Ozuna");
        //      break;

        //  case 2:
        //      System.out.println("Lista de reproducción para cuando estás Triste:");
        //      System.out.println("- 'Amorfoda' de Bad Bunny");
        //      System.out.println("- 'Te Vas' de Ozuna");
        //      System.out.println("- 'La Inocente' de Mora ft. Feid");
        //      System.out.println("- 'Secreto' de Anuel AA ft. Karol G");
        //      break;

        //  case 3:
        //      System.out.println("Lista de reproducción para cuando estás Enérgico:");
        //      System.out.println("- 'Tití Me Preguntó' de Bad Bunny");
        //      System.out.println("- 'Relación (Remix)' de Sech ft. Rosalía, Daddy Yankee, J Balvin, Farruko");
        //      System.out.println("- 'Normal' de Feid");
        //      System.out.println("- 'China' de Anuel AA, Daddy Yankee, Karol G, Ozuna, J Balvin");
        //      break;

        //  case 4:
        //      System.out.println("Lista de reproducción para cuando estás Relajado:");
        //      System.out.println("- 'Un Verano Sin Ti' de Bad Bunny");
        //      System.out.println("- 'A Solas' de Mora");
        //      System.out.println("- 'Hey Mor' de Ozuna ft. Feid");
        //      System.out.println("- 'Antes' de Anuel AA ft. Ozuna");
        //      break;

        //  default:
        //      System.out.println("Opción no válida. Por favor, selecciona 1, 2, 3 o 4.");
        //      break;


        //Ejercicio 5: Calculadora de Costo de Viaje

        //System.out.println("Ingresa la distancia del viaje en Km");
        //int distancia = scanner.nextInt();
        //System.out.println("Ingresa el consumo del vehiculo en litros por Km");
        //int consumo = scanner.nextInt();
        //System.out.println("Ingresa el precio por litro del combustible");
        //int precio = scanner.nextInt();
        //System.out.println("El costo del viaje es " +(distancia*consumo) * precio);


        //Ejercicio 6: Generador de Planes de Estudio

        //System.out.println("Cuantas horas puedes estudiar");
        //int horas = scanner.nextInt();
        //if  (horas >= 1 && horas < 3){
        //   System.out.println("Plan de estudio para 1-2 horas:");
        //  System.out.println("- Dedica 30 minutos a la lectura de conceptos.");
        //  System.out.println("- Realiza 30 minutos de ejercicios prácticos.");
        //  System.out.println("- Repasa lo aprendido en 1 hora.");
        //} else if (horas >= 3 && horas < 5) {
        //  System.out.println("Plan de estudio para 3-4 horas:");
        //  System.out.println("- Dedica 1 hora a la lectura de conceptos.");
        //  System.out.println("- Realiza 1 hora de ejercicios prácticos.");
        //  System.out.println("- Estudia ejemplos adicionales durante 1 hora.");
        //  System.out.println("- Reserva 30 minutos para un repaso final.");
        //}else {
        //  System.out.println("Plan de estudio para 5 horas o más:");
        //  System.out.println("- Dedica 2 horas a la lectura de conceptos.");
        //  System.out.println("- Realiza 2 horas de ejercicios prácticos.");
        //  System.out.println("- Estudia ejemplos adicionales durante 30 minutos.");
        //  System.out.println("- Reserva 30 minutos para resolver dudas.");
        //}

        //Ejercicio 7: Calculadora de Índice de Felicidad

        System.out.println("Ingresa tu indice de felicidad en la escala del 1-10");
        int felicidad = scanner.nextInt();
        if (felicidad >= 1 && felicidad <= 3 ) {
            System.out.println("El nivel de felicidad es bajo");
        } else if (felicidad > 3 && felicidad <= 6) {
            System.out.println("El nivel de felicidad es medio");
        } else if (felicidad > 6 && felicidad <= 9) {
            System.out.println("El nivel de felicidad es alto");
        } else if (felicidad==10) {
            System.out.println("El nivel de felicidad es el maximo");
        }else {
            System.out.println("Los datos son incorrectos");

        }
    }
    }









