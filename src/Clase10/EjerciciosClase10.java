package Clase10;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

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
        capitales.put("Canadá", "Otawa");
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



        //3. Eliminar un elemento del Mapa:
        //Crea un TreeMap<Integer, String> con claves numéricas y valores de colores.
        //Elimina un color del mapa e imprime el mapa resultante.


        TreeMap<Integer, String> colores = new TreeMap<>();

        colores.put(1, "Blanco");
        colores.put(2, "Verde");
        colores.put(3, "Azúl");
        colores.put(4, "Amarillo");
        colores.put(5, "Rojo");
        colores.put(6, "Rosa");
        colores.put(7, "Morado");
        colores.put(8, "Negro");

        //eliminar color verde:

        colores.remove(2);

        for (Map.Entry<Integer, String> entrada : colores.entrySet()){
            System.out.println(entrada.getKey() + "->" + entrada.getValue());
        }


        //4. Actualizar el valor de una clave en un Mapa:
        //Crea un HashMap<String, Integer>que almacene prodcutos y sus cantidades.
        //Actualiza la cantidad de un producto y luego muestra el mapa actualizado.

        HashMap<String, Integer> stock = new HashMap<>();

        stock.put("Camisetas", 58);
        stock.put("Pantalones", 64);
        stock.put("Sudaderas", 71);
        stock.put("Bañadores", 41);
        stock.put("Abrigos", 20);
        stock.put("Zapatillas", 142);
        stock.put("Calcetines", 89);

        //actualizar cantidad de sudaderas:

        stock.put("Sudaderas", 95);

        for (Map.Entry<String, Integer> entrada : stock.entrySet()){
            System.out.println(entrada.getKey() + "->" + entrada.getValue());
        }


        //5.Ordenar un mapa por claves:
        //Crea un HashMap<String, Double> que almacene nombres de productos y sus precios.
        //Usa un TreeMap para ordenar los productos por nombre de forma alfabética.
        //Imprime el mapa ordenado.

        HashMap<String, Double> precios =new HashMap<>();

        precios.put("Detergente", 9.99);
        precios.put("Queso", 5.75);
        precios.put("Plátanos", 3.50);
        precios.put("Galletas", 2.99);
        precios.put("Manzanas", 3.0);
        precios.put("Servilletas", 2.50);
        precios.put("Refrescos", 1.75);

        TreeMap<String, Double> ordenado =new TreeMap<>(precios);

        for (Map.Entry<String, Double> entrada : ordenado.entrySet()){
            System.out.println(entrada.getKey() + "->" + entrada.getValue());

        }

    }

}
