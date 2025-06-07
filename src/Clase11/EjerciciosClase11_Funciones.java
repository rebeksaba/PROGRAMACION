package Clase11;

import org.w3c.dom.ls.LSOutput;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Scanner;

public class EjerciciosClase11_Funciones {
    public static void main(String[] args) {

        //EJERCICIOS DE FUNCIONES EN JAVA//

        //1. Crear una función que calcule el doble de un número

        //Crea una función llamada double que reciba un número entero y devuelva su doble.
        //Ejemplo esperado:
        //int resultado = double(4); // resultado = 8


        System.out.println(doble(5));

        //2. Función que indique si un número es par

        //Crea una función esPar(int n) que devuelva true si el número es par y false en caso contrario.
        //Prueba la función en el main.

        if (esPar(3)) {
            System.out.println("Es par");
        } else {
            System.out.println("No es par");
        }

        //3. Función que imprima un saludo personalizado

        //Escribe una función saludar (String nombre, int edad) que imprima "Hola, [nombre], que bien llevas tus [edad] años".

        saludar("Rebeca", 31);

        //4. Reorganiza este código en funciones
        //Convierte este código en un programa que use mínimo dos funciones: una para cargar datos, y otra para imprimirlos.

        //Scanner sc = new Scanner(System.in);
        //String nombre;
        //int edad;
        //
        //System.out.print("Introduce tu nombre: ");
        //nombre = sc.nextLine();
        //
        //System.out.print("Introduce tu edad: ");
        //edad = sc.nextInt();
        //
        //System.out.println("Hola " + nombre + ", tienes " + edad + " años.");


        String[] datos = cargarDatos();
        imprimirMensaje(datos[0], Integer.parseInt(datos[1]));


        //5. Función que sume los elementos de un array.
        //Crea una función que reciba un array de enteros y devuelva la suma de sus elementos.
        //Ejemplo esperado:

        //int[] numeros = {4,2,7,1};
        //int suma = sumaArray(numeros);// Resultado: 14

        int[] numeros = {10, 31, 17, 98};

        int resultado = sumaArray(numeros);

        System.out.println("La suma del array es: " + resultado);


        //6. Código para convertir en funciones
        //Este código calcula el área de un rectángulo.
        //Divídelo en dos funciones: una para leer datos y otra para calcular el área.

        //Scanner sc = new Scanner(System.in);
        //System.out.print("Introduce base: ");
        //double base = sc.nextDouble();
        //System.out.print("Introduce altura: ");
        //double altura = sc.nextDouble();

        //double area = base * altura;
        //System.out.println("El área es: " + area);

        double[] datos6 = leerDatos();
        double area = calcularArea(datos6[0], datos6[1]);
        System.out.println("El área es: " + area);


        //7. Función que calcule la media de 3 números
        //Crea una función media (double a, double b, double c) que devuelva el promedio de los tres valores.

        double media = calcularMedia(5.3, 9.6, 7.4);
        System.out.println("La media es: " + media);

        int mediaRedondeada = (int) Math.round(media);
        System.out.println("La media redondeada es: " + mediaRedondeada);


        //8. Función que reciba dos enteros y devuelva el mayor.
        //Llama a la función desde el main y muestra el resultado.

        int mayorque = mayor(40, 33);
        System.out.println("El número mayor es : " + mayorque);


        //9. Descompón este programa en funciones.
        //Este programa imprime una tabla de multiplicar. Creauna función tablaMultiplicar(int n) que reciba un número y muestre su tabla.

        //int numero = 5;
        //for (int i = 1; i <= 10; i++) {
        //System.out.println(numero + " x " + i + " = " + (numero * i));
        //}

        tablaMultiplicar(2);


        //10. Función que convierta grados celsiusAFahrenheit(double celsius) que devuelva el equivalente en grados Fahrenheit.
        //La fórmula es:

        //fahrenheit = (celsius * 9/5) + 32;

        //Ejemplo esperado:

        //double resultado = celsiusAFahrenheit(25); // Resultado: 77.0


        double resultado10 = celsiusAFahrenheit(25);
        System.out.println("25º son: " + resultado10 + " Fahrenheit. " );


    }



    //EJERCICIO 1.//
    public static int doble (int n1){

        return n1 * 2;

    }

    //EJERCICIO 2.//
    public static boolean esPar (int n2){

        return n2 % 2 == 0;


    }

    //EJERCICIO 3.//
    public static void saludar (String nombre, int edad){
        System.out.println("Hola, " + nombre + ", qué bien llevas tus " + edad + " años.");

    }

    //EJERCICIO 4.//
    public static String[] cargarDatos(){
        Scanner sc = new Scanner(System.in);
        String[] datos = new String[2];

        System.out.println("Introduce tu nombre: ");
        datos[0] = sc.nextLine();

        System.out.println("Introduce tu edad: ");
        datos[1] = sc.nextLine();

        return datos;


    }

    public static void imprimirMensaje (String nombre, int edad){
        System.out.println("Hola " + nombre + " tiene " + edad + " años. ");


    }

    //EJERCICIO 5.//
    public static int sumaArray (int[] numeros){
        int suma = 0;
        for(int i = 0; i < numeros.length; i++){
            suma += numeros[i];
        }
        return suma;

    }

    //EJERCICIO 6.//

    public static double[] leerDatos(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce base: ");
        double base = sc.nextDouble();
        System.out.print("Introduce altura: ");
        double altura = sc.nextDouble();
        return new double[]{base, altura};
    }

    public static double calcularArea(double base, double altura){
        return base * altura;
    }

    //EJERCICIO 7.//

    public static double calcularMedia(double a, double b, double c){
        return (a + b + c) / 3;
    }

    //EJERCICIO 8.//

    public static int mayor (int a, int b){
        if (a >= b){
            return a;
        }else{
            return b;
        }
    }

    //EJERCICIO 9.//

    public static void tablaMultiplicar (int n){

        for (int i=1; i <=10; i++){
            System.out.println(n + " x " + i + " = " + (n * i));
        }
    }



    public static double celsiusAFahrenheit (double grados){
        double fahrenheit = (grados * 9/5) + 32;
        return fahrenheit;

    }
}
