package Clase7;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Scanner;

public class MainClase7 {
    public static void main(String[] args) {

//        Scanner sc = new Scanner(System.in);
//        int[] numeros = new int[5];
//        int indice = 0;
//
//        for (int i = 0; i < numeros.length; i++){
//            System.out.println("Introduce el número " + (i+1) + ":");
//            numeros[i] = sc.nextInt();
//
//        }
//
//        System.out.println("CONTENIDO: ");
//
//        for (int i = 0; i < numeros.length; i++){
//            System.out.println("Número " + (i + 1) + ": " + numeros[i]);
//
//        }
//
//        for (int num : numeros ) {
//            System.out.println("Elemento:" + num);
//
//
//        }
//
//        while (indice < numeros.length) {
//
//            System.out.println("Posición" + (indice+1) + ":" + numeros[indice]);
//
//            indice++;
//        }
//
//        Arrays.stream(numeros).forEach( num -> System.out.println("Elemento: " + num ) ); //Esto es una biblioteca que te permite recorrer un vector sin necesidad de usar un for each
//
//        sc.close();



        // EJERCICIOS CON ARRAYS//

    //Ejercicio 1. Declarar y mostrar.
    //Declara un array de 5 números enteros, asígnales valores y muéstralos por la pantalla

    int[] arraynum = {12, 25, 34, 46, 58};
    for (int i = 0; i < arraynum.length; i++) {
        System.out.println("Número en la posición " + i + ":" + arraynum[i]);
    }


    //Ejercicio 2. Sumar elementos.
    //Suma todos los valores de un array de enteros y muestra el total.

    int[] arraynum2 = {10, 20, 30, 40};
    int suma = 0;

    for (int i = 0; i < arraynum2.length; i++) {
        suma += arraynum2[i];
    }
        System.out.println("Esta es la suma de los valores: " + suma);

    //Ejercicio 3. Valor máximo y mínimo
    //Dado un array de enteros, muestra el valor más alto y el más bajo.

    int[] arraynum3 = {10, 25, 15, 83, 9};
    int min = arraynum3[0];
    int max = arraynum3[0];

    for (int i = 0; i < arraynum3.length; i++) {
        if (arraynum3[i] < min) {
            min = arraynum3[i];
        }
        if (arraynum3[i] > max) {
            max = arraynum3[i];
        }
    }
        System.out.println("El número menor es: " + min);
        System.out.println("El número mayor es: " + max);

    //Ejercicio 4. Buscar un elemento.
    //Pide al usuario un número y muéstra si está presente en un array, y en qué posición.

    Scanner scanner4 = new Scanner(System.in);
    int [] arraynum4 = {3,15,74,46,100};

        System.out.println("Introduce un número: ");
        int




    }
}
