package Clase5;

import java.util.Scanner;// sin esto no vas a poder pedirle al usuario algún dato

public class MainClase5 {
    public static void main(String[] args) {


        //Scanner scanner = new Scanner(System.in);
        //System.out.println("Dame un número");
        //int numero = scanner.nextInt();// con esto, leo el número del usuario

//        //Estructura del if-else
//        //if (numero > 0) {
//        System.out.println("El número es positivo");
//        //} else if (numero < 0) {
//        System.out.println("El número es negativo");
//        //} else {
//        System.out.println("El número es cero");
//        // }
//        // scanner.close();// cierra el scanner.
//        //  }

//}

//2. Créame un menú interactivo donde el usuario eloja una opción y muetre un

//        Scanner scanner = new Scanner(System.in);
//
//Menú de opciones
//        System.out.println("*Menú de opciones*");
//        System.out.println("1. Saludar");
//        System.out.println("2. Mensaje motivacional");
//        System.out.println("3. Salir");
//
//        System.out.println("Selecciona una opción");
//        int opcion = scanner.nextInt();//Leermos la opción del usuario
//
//
//        //Evaluar opciones con el switch
//        switch (opcion){
//            case 1:
//                System.out.println("Hola, bienvenido");
//                break;
//            case 2:
//                System.out.println("Bro, esto es masivo!");
//                break;
//            case 3:
//                System.out.println("Saliendo del programa");
//                break;
//            default:
//                System.out.println("Macho, me has dado algo que no entiendo");
//        }
//        scanner.close();

        //Imprimir los números del 1 al 10 con un for
        //Usar un bucle para contar del 1 al 10
//            for (int i=1;i<=10;i++){
//                System.out.println("Numero: " + i);
//                //Así muestro cada interacción
//            }

        //Ejercicio 4.
        //Usa el while para pedir numeros hasta que ponga 0

//        Scanner scanner = new Scanner(System.in);
//        int numero;
//
//        System.out.println("Dame un número y pon 0 para salir");
//        numero = scanner.nextInt();
//        //Mientras que no sea 0 sigue pidiendo
//
//        while(numero!=0){
//            System.out.println("Has introducido: " + numero);
//            System.out.println("Introduce otro numero.");
//            numero = scanner.nextInt();
//
//        }
//        System.out.println("Programa finalizado.");
//        scanner.close();




        //Ejercicio 5.
        //Pide contraseña y que no pueda entrar el usuaario hasta que ponga java123

//        Scanner scanner = new Scanner(System.in);
//        String password;

        //Bucle do-while

//        do {
//            System.out.println("Introduce tu contraseña:");
//            password = scanner.nextLine();
//        }while (!password.equals("java123"));
//
//        System.out.println("Acceso concedido");
//        scanner.close();

      //EJERCICIOS EXTRA

      //EJERCICIO 1: Clasificación de edad.
        // Pide al usuario su edad e imprime si es menor de edad, adulto o adulto mayor.

//        Scanner scanner = new Scanner(System.in);
//
//        System.out.println("Dime tu edad");
//        int edad = scanner.nextInt(); // Con esto, leo la edad del usuario
//
//        if (edad < 18) {
//            System.out.println("Eres menor de edad");
//        } else if (edad >= 18 && edad < 50) {
//            System.out.println("Eres adulto");
//        } else if (edad >= 50) {
//            System.out.println("Eres adulto mayor");
//        }
//
//        scanner.close(); // Cierra el scanner


        //EJERCICIO 2: Contador de vocales.
          //Pide al usuario una palabra y cuenta cuántas vocales tiene.

        Scanner scanner = new Scanner(System.in);

        System.out.println("Escribe una palabra");




    }

}

