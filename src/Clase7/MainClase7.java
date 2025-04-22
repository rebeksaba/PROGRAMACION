package Clase7;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Scanner;

public class MainClase7 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[] numeros = new int[5];
        int indice = 0;

        for (int i = 0; i < numeros.length; i++){
            System.out.println("Introduce el número " + (i+1) + ":");
            numeros[i] = sc.nextInt();

        }

        System.out.println("CONTENIDO: ");

        for (int i = 0; i < numeros.length; i++){
            System.out.println("Número " + (i + 1) + ": " + numeros[i]);

        }

        for (int num : numeros ) {
            System.out.println("Elemento:" + num);


        }

        while (indice < numeros.length) {

            System.out.println("Posición" + (indice+1) + ":" + numeros[indice]);

            indice++;
        }

        Arrays.stream(numeros).forEach( num -> System.out.println("Elemento: " + num ) ); //Esto es una biblioteca que te permite recorrer un vector sin necesidad de usar un for each


    //2. Sumar elementos
        //Suma todos los valores de un array de enteros y muestra el total.



    }
}
