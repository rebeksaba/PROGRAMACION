package Clase9;

import java.util.ArrayList;
import java.util.concurrent.LinkedTransferQueue;
import java.util.Random;

public class EjerciciosClase9 {
    public static void main(String[] args) {


        //EJERCICIOS DE MATRICES//

        //1. Suma de dos matrices:
        //Crea dos matrices de 3x3 y suma sus elementos.
        //Imprime el resultado de la suma.

        int[][] matriz1 = {
                {15, 20, 42},
                {2, 90, 36},
                {66, 81, 5}
        };

        int[][] matriz2 = {
                {30, 21, 7},
                {11, 15, 68},
                {13, 22, 37}
        };
        int[][] matrizResultado = new int[3][3];

        for (int i = 0; i < 3; i++) {
            for(int j = 0; j < 3; j++) {
                matrizResultado[i][j] = matriz1[i][j] + matriz2[i][j];

                System.out.print(matrizResultado[i][j] + " ");
            }
            System.out.println();
        }

        //2. Rellenar una matriz con números aleatorios.
        //Crea una matriz de 4x4 y rellénala con números aleatorios entre 1 y 100.
        //Imprime la matriz.

        int[][] matrizAleatoria = new int[4][4];

        Random random = new Random();

        for (int i = 0; i < 4; i++){
            for (int j = 0; j < 4; j++){

                matrizAleatoria[i][j] = random.nextInt(100) + 1;

                System.out.print(matrizAleatoria[i][j] + " ");

            }
            System.out.println();

        }

        //3. Matriz de identidad.
        //Crea una matriz de 3x3 que sea una matriz identidad (con 1 en la diagonal principal y 0 en
        //el resto).
        //Imprime la matriz.

        int[][] matrizIdentidad = new int[3][3];

        for (int i = 0; i < 3; i++){
            for (int j = 0; j < 3; j++){
                if (i == j){
                    matrizIdentidad[i][j] = 1;
                }else {
                    matrizIdentidad[i][j] = 0;
                }
                System.out.print(matrizIdentidad[i][j] + " ");
            }
            System.out.println();
        }

        //4. Transposición de una matriz.
        //Crea una matriz de 2x3 y transponla, es decir, convierte sus filas en columnas.
        //Imprime la matriz original y la transpuesta.



        int[][] matrizOriginal = {
                {4, 8},
                {2, 6},
                {1, 5}
        };


        int[][] matrizTranspuesta = new int[2][3];


        for (int i = 0; i < 3; i++) { // Filas de la original
            for (int j = 0; j < 2; j++) { // Columnas de la original
                matrizTranspuesta[j][i] = matrizOriginal[i][j]; // Asignación correcta
            }
        }


        System.out.println("Matriz Original:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(matrizOriginal[i][j] + " ");
            }
            System.out.println();
        }


        System.out.println("Matriz Transpuesta:");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matrizTranspuesta[i][j] + " ");
            }
            System.out.println();
        }
    }
}



















































