package Clase9;

public class MainClase9 {
    public static void main(String[] args) {

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






    }


}
