package Clase8;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Scanner;

public class MainClase8 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        ArrayList<String> nombres = new ArrayList<>();

        System.out.println("Introduce nombres (escribe salir para finalizar" );
        String nombre;

        do{
            System.out.println("Nombre: ");
            nombre= entrada.nextLine();
            if (!nombre.equalsIgnoreCase("salir")){
                nombres.add(nombre);
            }

        }while(!nombre.equalsIgnoreCase("salir"));

        int opcion;
        do {
            System.out.println("\n MENÚ DE OPCIONES");
            System.out.println("1. Mostrar todos los nombres");
            System.out.println("2. Obtener nombre por posición ");

            System.out.println("0. Salir");
            opcion = entrada.nextInt();
            entrada.nextLine(); //esto es para limpiar el boofer para que el scanner esté limpio

            switch (opcion) {

                case 1 -> {

                    if (nombre.isEmpty()) {
                        System.out.println("No hay nombres");
                    } else {

                        for (String nom : nombres){
                        System.out.println(" - " + nom);

                        }
                    }
                }
                case 2 -> {
                    System.out.println("Introduce la posición");
                    int pos = entrada.nextInt();

                    if (pos >= 0 && pos < nombres.size()) {
                        System.out.println("Nombre en la posición elegida: " + nombres.get(pos));
                    }else {
                        System.out.println("Introduce una posición válida");
                    }
                }


                case 0 -> System.out.println("Fin");
                default -> System.out.println("Opción no válida");
            }

    }while ( opcion != 0);

    entrada.close();

    }
}
