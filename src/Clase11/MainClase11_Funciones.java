package Clase11;


public class MainClase11_Funciones {
    public static void main(String[] args) {

        String name = "María";

        saludar();

        saludar(name);
        saludar("Juan");

        saludar2(name);
        System.out.println(saludar2(name));

        System.out.println(sumar(5,7));

        System.out.println(sumar());
        System.out.println(sumar(20,10,50,87,5,2,5,33,20));

        if (esPar(3)){
            System.out.println("Es par");
        }else {
            System.out.println("No es par");
        }

        int[] numeros = {4, 5, 7, 8, 10};

        System.out.println("La media es: " + calcularMedia(numeros));


        //substring(inicio, fin)//

        String email = "pepe@gmail.com";

        String nombreUsuario = email.substring(0, email.indexOf("@"));
        System.out.println(nombreUsuario);

        String servidor = email.substring(email.indexOf("@") + 1);
        System.out.println(servidor);
    }

    //FUNCIONES//
    //Recomendación -> efectuar las funciones en la parte de abajo.

    //1. Imprime saludo
    public static void saludar(){
        System.out.println("Hola");

    }

    public static void saludar(String nombre){
        System.out.println("Hola, " + nombre + "!");
    }

    public static String saludar2(String nombre){
        return ("Hola, " + nombre + "!");
    }

    public static int sumar(int n1, int n2){
        return n1 + n2;

    }
        //Función indefinida// se crea un array porque no sabemos cuántos valores van a usarse//
    public static int sumar (int... numeros){

        int suma = 0;
        for (int n: numeros){
            suma += n;
        }
        return suma;
    }

    public static boolean esPar (int n1){
        if (n1 % 2 == 0){
            return true;
        }else {
            return false;
        }
    }

    public static double calcularMedia(int[] numeros){
        int suma = 0;
        for (int n : numeros){
            suma += n;
        }
        return (double) suma / numeros.length;
    }






}
