package Clase10;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class EjerciciosClase10 {

    public static void main(String[] args) {

        //EJERCICIOS DE MAPAS (HASHMAP Y TREEMAP)//

        //1. Asociar nombres de estudiantes con notas:
        //Crea un HashMap<String, Integer> que asocie los nombres de estudiantes con sus notas.
        //Añade al menos 5 estudiantes y muestra sus nombre y notas.

        HashMap<String, Integer> notas_finales = new HashMap<>();

        notas_finales.put("Rodrigo", 9);
        notas_finales.put("Ainhoa", 4);
        notas_finales.put("Julia", 8);
        notas_finales.put("Sergio", 3);
        notas_finales.put("Víctor", 6);
        notas_finales.put("Sofía", 10);

        for (Map.Entry<String, Integer> entrada : notas_finales.entrySet()){

            System.out.println(entrada.getKey() + "->" + entrada.getValue());

        }




        //2. Buscar un valor en un Mapa:
        //Crea un HashMap<String, String> que almacene nombres de países como claves y sus capitales como valores.
        //Permite al usuario ingresar el nombre de un país para mostrar su capital.


        Scanner scanner = new Scanner(System.in);

        HashMap<String, String> capitales = new HashMap<>();

        capitales.put("España", "Madrid");
        capitales.put("Francia", "París");
        capitales.put("Italia", "Roma");
        capitales.put("Alemania", "Berlín");
        capitales.put("Inglaterra", "Londres");
        capitales.put("Irlanda", "Dublín");
        capitales.put("Marruecos", "Rabat");
        capitales.put("Egipto", "El Cairo");
        capitales.put("Estados Unidos", "Washington D.C.");
        capitales.put("Canadá", "Ontario");
        capitales.put("Colombia", "Bogotá");
        capitales.put("Argentina", "Buenos Aires");
        capitales.put("China", "Pekín");
        capitales.put("Japón", "Tokio");

        System.out.println("Introduce un país: ");
        String país = scanner.nextLine();

        if (capitales.containsKey(país)){
            System.out.println(país + " su capital es: " + capitales.get(país));

        }else{
            System.out.println("El país no se ha encontrado");
        }






    }

}
