package Clase9;

import java.lang.classfile.attribute.RuntimeInvisibleAnnotationsAttribute;
import java.util.ArrayList;
import java.util.concurrent.LinkedTransferQueue;
import java.util.Random;
import java.util.Scanner;

public class EjerciciosClase9 {
    public EjerciciosClase9() {
    }

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

        //5. Multiplicación de matrices
        //Crea dos matrices de 2x2 y multiplícalas.
        //Imprime el resultado de la multiplicación.

        int[][] matriz5 = {
                {6, 9},
                {2, 10}

        };

        int[][] matriz6 = {
                {8, 4},
                {3, 5}
        };

        int[][] ResultadoMultiplicacion = new int[2][2];

        for (int i = 0; i < 2; i++){
            for (int j = 0; j < 2; j++){
                ResultadoMultiplicacion[i][j] = 0;
                for (int k = 0; k < 2; k++){
                    ResultadoMultiplicacion[i][j] += matriz5[i][k] * matriz6[k][j];


                }
                System.out.print(ResultadoMultiplicacion[i][j] + " ");


            }
            System.out.println();
        }


        //EJERCICIOS DE ARRAYLIST//

        //1. Lista de lista de estudiantes:
        //Crea un ArrayList<ArrayList<String>> que contenga información sobre 3 estudiantes:
        //nombre, apellido y edad.
        //Imprime la información de todos los estudiantes.

        ArrayList<ArrayList<String>> infoalumno = new ArrayList<>();

        ArrayList<String> estudiante1 = new ArrayList<>();
        estudiante1.add("Antonio");
        estudiante1.add("González");
        estudiante1.add("15");

        infoalumno.add(estudiante1);

        ArrayList<String> estudiante2 = new ArrayList<>();
        estudiante2.add("Elena");
        estudiante2.add("Pérez");
        estudiante2.add("16");

        infoalumno.add(estudiante2);

        ArrayList<String> estudiante3 = new ArrayList<>();
        estudiante3.add("Sofía");
        estudiante3.add("Sánchez");
        estudiante3.add("14");

        infoalumno.add(estudiante3);

        for (ArrayList<String> Estudiante : infoalumno){
            System.out.println("Estudiante: ");
            for (String dato : Estudiante) {
                System.out.println(dato);
            }
            System.out.println();
        }

        //2. Agregar una lista a una lista de listas:
        //Crea un ArrayList<ArrayList<String>> y agrega 3 listas internas.
        //Cada lista interna debe contener un nombre y dos apellidos de un estudiante.
        //Imprime la lista de listas.

        ArrayList<ArrayList<String>> listaestudiantes = new ArrayList<>();

        ArrayList<String> alumno1 = new ArrayList<>();
        alumno1.add("Jaime");
        alumno1.add("Hernández");
        alumno1.add("Gómez");

        listaestudiantes.add(alumno1);

        ArrayList<String> alumno2 = new ArrayList<>();
        alumno2.add("Roberto");
        alumno2.add("Sánchez");
        alumno2.add("Fuentes");

        listaestudiantes.add(alumno2);

        ArrayList<String> alumno3 = new ArrayList<>();
        alumno3.add("Eva");
        alumno3.add("Novero");
        alumno3.add("Bayón");

        listaestudiantes.add(alumno3);

        for (ArrayList<String> Alumno : listaestudiantes){
            System.out.println("Alumno: ");
            for (String dato2 : Alumno) {
                System.out.println(dato2);
            }
            System.out.println();
        }

        //3. Búsqueda de un Elemento en una Lista interna:
        //Crea un ArrayList<ArrayList<String>> que almacene nombres de ciudades en cada lista interna.
        //Permite al usuario ingresar una ciudad para buscar en qué lista se encuentra.
        //Imprime la lista que contiene la ciudad.

        ArrayList<ArrayList<String>> ciudades = new ArrayList<>();

        ArrayList<String> CiudadesEuropeas = new ArrayList<>();
        CiudadesEuropeas.add("Londres");
        CiudadesEuropeas.add("París");
        CiudadesEuropeas.add("Berlín");
        CiudadesEuropeas.add("Madrid");
        CiudadesEuropeas.add("Roma");
        CiudadesEuropeas.add("Ámsterdam");
        CiudadesEuropeas.add("Lisboa");
        CiudadesEuropeas.add("Praga");
        CiudadesEuropeas.add("Budapest");
        CiudadesEuropeas.add("Viena");

        ciudades.add(CiudadesEuropeas);

        ArrayList<String> CiudadesAmericanas = new ArrayList<>();
        CiudadesAmericanas.add("Ontario");
        CiudadesAmericanas.add("Whasington");
        CiudadesAmericanas.add("México DF");
        CiudadesAmericanas.add("Lima");
        CiudadesAmericanas.add("Bogotá");
        CiudadesAmericanas.add("Caracas");
        CiudadesAmericanas.add("Quito");
        CiudadesAmericanas.add("Buenos Aires");
        CiudadesAmericanas.add("Santiago de Chile");
        CiudadesAmericanas.add("Brasilia");

        ciudades.add(CiudadesAmericanas);

        ArrayList<String> CiudadesAfricanas = new ArrayList<>();
        CiudadesAfricanas.add("Rabat");
        CiudadesAfricanas.add("Argel");
        CiudadesAfricanas.add("El Cairo");
        CiudadesAfricanas.add("Nairobi");
        CiudadesAfricanas.add("Pretoria");
        CiudadesAfricanas.add("Abuya");
        CiudadesAfricanas.add("Luanda");
        CiudadesAfricanas.add("Dakar");
        CiudadesAfricanas.add("Maputo");
        CiudadesAfricanas.add("Dodoma");

        ciudades.add(CiudadesAfricanas);

        ArrayList<String> CiudadesAsiaticas = new ArrayList<>();
        CiudadesAsiaticas.add("Tokio");
        CiudadesAsiaticas.add("Pekín");
        CiudadesAsiaticas.add("Nueva Delhi");
        CiudadesAsiaticas.add("Bangkok");
        CiudadesAsiaticas.add("Seúl");
        CiudadesAsiaticas.add("Hanói");
        CiudadesAsiaticas.add("Riad");
        CiudadesAsiaticas.add("Islamabad");
        CiudadesAsiaticas.add("Manila");
        CiudadesAsiaticas.add("Abu Dabi");

        ciudades.add(CiudadesAsiaticas);

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce una capital del mundo: ");
        String ciudadIntroducida = sc.nextLine();

        boolean encontrada = false;

        for (ArrayList<String> continente : ciudades) {
            if (continente.contains(ciudadIntroducida)) {
                System.out.println("La ciudad se encuentra en esta lista: " + continente);
                encontrada = true;
                break;
            }
        }
        if (!encontrada) {
            System.out.println("La ciudad no se encuentra en ninguna lista. ");
        }
        sc.close();















    }
}



















































