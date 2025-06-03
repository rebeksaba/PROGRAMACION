package Clase11;

import java.util.ArrayList;
import java.util.Scanner;

public class EjerciciosClase11_Funciones {
    public static void main(String[] args) {

        //EJERCICIOS DE FUNCIONES EN JAVA//

        //1. Crear una función que calcule el doble de un número

        //Crea una función llamada double que reciba un número entero y devuelva su doble.
        //Ejemplo esperado:
            //int resultado = double(4); // resultado = 8


        System.out.println(doble(5));

        //2. Función que indique si un número es par

        //Crea una función esPar(int n) que devuelva true si el número es par y false en caso contrario.
        //Prueba la función en el main.

        if (esPar(3)){
            System.out.println("Es par");
        }else {
            System.out.println("No es par");
        }

        //3. Función que imprima un saludo personalizado

        //Escribe una función saludar (String nombre, int edad) que imprima "Hola, [nombre], que bien llevas tus [edad] años".

        saludar("Rebeca", 31);

        //4. Reorganiza este código en funciones
        //Convierte este código en un programa que use mínimo dos funciones: una para cargar datos, y otra para imprimirlos.

        //Scanner sc = new Scanner(System.in);
        //String nombre;
        //int edad;
        //
        //System.out.print("Introduce tu nombre: ");
        //nombre = sc.nextLine();
        //
        //System.out.print("Introduce tu edad: ");
        //edad = sc.nextInt();
        //
        //System.out.println("Hola " + nombre + ", tienes " + edad + " años.");


        String[] datos = cargarDatos();
        imprimirMensaje(datos[0], Integer.parseInt(datos[1]));

    }

    //EJERCICIO 1.//
    public static int doble (int n1){

        return n1 * 2;

    }

    //EJERCICIO 2.//
    public static boolean esPar (int n2){

        return n2 % 2 == 0;


    }

    //EJERCICIO 3.//
    public static void saludar (String nombre, int edad){
        System.out.println("Hola, " + nombre + ", qué bien llevas tus " + edad + " años.");

    }

    //EJERCICIO 4//
    public static String[] cargarDatos(){
        Scanner sc = new Scanner(System.in);
        String[] datos = new String[2];

        System.out.println("Introduce tu nombre: ");
        datos[0] = sc.nextLine();

        System.out.println("Introduce tu edad: ");
        datos[1] = sc.nextLine();

        return datos;


    }

    public static void imprimirMensaje (String nombre, int edad){
        System.out.println("Hola " + nombre + " tiene " + edad + " años. ");


    }







}
