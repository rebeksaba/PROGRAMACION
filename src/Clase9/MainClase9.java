package Clase9;

import java.util.ArrayList;

public class MainClase9 {
    public static void main(String[] args) {

       //MATRICES//

        int[][] matriz1 = new int[3][4];

        int[] vector1 = {1,2,3};

        int[][] matriz2 = {
                {1, 2, 3, 50},
                {4, 5, 6, 64},
                {7, 8, 9, 12}
        };

        System.out.println("Número de filas: " + matriz2.length);
        System.out.println("Número de columnas: " + matriz2[1].length);

        for (int i = 0; i < matriz2.length; i++){

            for ( int j = 0; j < matriz2[i].length; j++){

                System.out.print(matriz2[i][j] + " ");
            }
            System.out.println();

        }

        matriz2[1][1] = 30;

        for (int[] fila : matriz2) {
            for (int valor : fila) {
                System.out.print(valor + " ");
            }
            System.out.println();
        }

        //MAPAS//

        ArrayList<ArrayList<String>> estudiantes = new ArrayList<>();

        ArrayList<String> estudiante1 = new ArrayList<>();
        estudiante1.add("Juan");
        estudiante1.add("9");
        estudiante1.add("8");

        ArrayList<String> estudiante2 = new ArrayList<>();
        estudiante2.add("Raquel");
        estudiante2.add("10");
        estudiante2.add("6");
        estudiante2.add("8");

        estudiantes.add(estudiante1);
        estudiantes.add(estudiante2);

        for (ArrayList<String> estudiante : estudiantes){

            int contador = 0;

            for (String valor : estudiante){

                if (contador == 0) {
                    System.out.print("Nombre: ");
                }else {
                    System.out.print("Nota" + contador + ": ");
                }
                System.out.print(valor + " ");
                contador++;
            }
            System.out.println();

        }

    }


}
