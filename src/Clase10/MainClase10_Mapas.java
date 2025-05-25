package Clase10;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class MainClase10_Mapas {

    public static void main(String[] args) {

        //MAPAS//

        //HASHMAP//

        Scanner scanner = new Scanner(System.in);
        HashMap<String, Double> notas = new HashMap<>();

        notas.put("Ana", 8.5);
        notas.put("Ana", 7.0);
        notas.put("Eva", 7.75);
        notas.put("Rebeca", 9.5);
        notas.put("Paco", 10.0);
        notas.put("Antonio", 2.5);
        notas.put("Laura", 5.4);
        notas.put("Javier", 6.5);
        notas.put("Jose", 6.8);

        for ( Map.Entry<String, Double> entrada : notas.entrySet()){

            System.out.println(entrada.getKey() + "->" + entrada.getValue());
        }


        System.out.println("Introduce un nombre: ");
        String nombre = scanner.nextLine();

        if (notas.containsKey(nombre)){
            System.out.println(nombre + " tiene una nota de :" + notas.get(nombre));

        }else{
            System.out.println("Estudiante no encontrado");
        }


        //TREEMAP//

        TreeMap<String, Double> ordenado =new TreeMap<>(notas);


        for (Map.Entry<String, Double> entrada : ordenado.entrySet()){
            System.out.println(entrada.getKey() + "->" + entrada.getValue());
        }


    }

}
