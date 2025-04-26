package Clase6;

import java.nio.channels.ScatteringByteChannel;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

//public class MainClase6 {
//
//    public static void main(String[] args) {

//        Scanner scanner = new Scanner(System.in);
//
//        System.out.println("1. Saludar\n2. Salir");
//
//        System.out.println("Elige una opción");
//
//    try {
//        int opcion = scanner.nextInt();
//
//        int resultado = 5 / opcion;
//
//        switch (opcion) {
//            case 1 -> System.out.println("Hola");
//
//            case 2 -> System.out.println("Saliendo...");
//
//            default -> System.out.println("Opción incorrecta");
//        }
//
//
//    } catch (InputMismatchException e) {
//        System.out.println("Debes escribir un número");
//    } catch (ArithmeticException e) {
//        System.out.println("División invalida");
//
//    } finally {
//        System.out.println("Fin");
//    }
//        scanner.close();

        // EJERCICIO 1: División segura
        //Objetivo: Añadir manejo de ArithmeticException y InputMismatchException
        //Instrucción: Añade try-catch-finally para evitar que el programa falle si el divisor es cero o si se introduce texto.

//        Scanner sc1= new Scanner(System.in);
//        System.out.println("Introduce el divisor:");
//
//    try {
//        int a = sc1.nextInt();
//        System.out.println("Introduce el dividendo");
//        int b = sc1.nextInt();
//
//        int resultado1 = a / b;
//
//        System.out.println("Resultado:" + resultado1);
//
//    }catch (ArithmeticException e) {
//            System.out.println("El divisor no puede ser 0");
//    }catch (InputMismatchException e) {
//        System.out.println("Tienes que introducir un número entero");
//
//    } finally {
//        System.out.println("Fin");
//            }
//
//        sc1.close();


        //EJERCICIO 2. Convertidor de texto a número.
        //Objetivo: Añadir manejo de NumerFormatException.
        //Instrucción: Añade un bloque try-catch para evitar que el programa se rompa si el usuario escribe letras.
//
//        Scanner sc2 = new Scanner(System.in);
//
//        System.out.println("Escribe un número en texto: ");
//
//        try {
//
//            String texto = sc2.nextLine();
//            int numero = Integer.parseInt(texto);
//            System.out.println("Número x 10: " + (numero * 10));
//
//        } catch (NumberFormatException e) {
//            System.out.println("Tienes que escribir el número con letras");
//        } finally {
//            System.out.println("Fin");
//        }
//        sc2.close();
//        // no me deja escribir el número con letra...creo que ese es el objetivo del ejercicio pero solo funciona bien si pongo el numero.
//
//
//        //EJERCICIO 3. Acceso a un Array.
//        //Objetivo: Añadir manejo de ArrayIndexOutOfBoundsException.
//        //Instrucción: Usa try-catch para evitar error si se ingresa una posición incorrecta (como 5 o -1).
//
//        String[] frutas = {"Manzana", "Banana", "Naranja"};
//
//        Scanner sc3 = new Scanner(System.in);
//
//        System.out.println("Introduce un número entre 0 y 2: ");
//
//        try {
//
//            int posicion = sc3.nextInt();
//
//            System.out.println("Fruta seleccionada: " + frutas[posicion]);
//
//
//        } catch (ArrayIndexOutOfBoundsException e) {
//            System.out.println("Error. Introduce un número entre 0 y 2");
//        } finally {
//            System.out.println("Fin");
//        }
//        sc3.close();

        //EJERCICIO 4. Adivina el número aleatorio.
        //Objetivo: Añadir manejo de NumberFormatException al convertir texto a número.
        //Instrucción: Añade manejo de NumerFormatException y un finally que diga "Juego finalizado".

//        Random random = new Random();
//        int secreto = random.nextInt(10) + 1;
//
//        Scanner sc4 = new Scanner(System.in);
//        System.out.println("Adivina el número (1-10): ");
//
//        String intentoTexto = sc4.nextLine();
//        int intento = Integer.parseInt(intentoTexto);
//
//
//        try {
//
//
//            intento = Integer.parseInt(intentoTexto);
//
//            if (intento == secreto) {
//                System.out.println("Correcto!");
//
//            }
//        }catch (NumberFormatException e) {
//            System.out.println("Tienes que introducir un número");
//
//
//
//        }finally {
//                System.out.println("Juego Finalizado");
//        }
//
//        sc4.close();



        //EJERCICIO 5. Longitud de un nombre
        //Objetivo: Añadir manejo de NullPointerException
        //Instrucción: Usa try-catch para evitar que el programa se detenga si nombre es null.

//            String nombre = null;
//
//        try {
//
//            if (nombre == null) {
//             throw new NullPointerException();
//
//            }
//            System.out.println("La longitud del nombre es: " + nombre.length());
//        }catch (NullPointerException e) {
//            System.out.println("Tienes que introducir un nombre válido.");
//        }finally {
//            System.out.println("Fin");
//        }
//
//
//    }
//
//}
//
























