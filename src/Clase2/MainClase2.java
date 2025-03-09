package Clase2;

import java.sql.SQLOutput;

public class MainClase2 {
    public static void main(String[] args) {

        //CONSTANTES EN JAVA

        //Las constantes en Java se definen usando final. Una vez asignado un valor no puede cambiar.
        //DECLARAS UNA CONSTANTE CON LA PALABRA FINAL
        final double PI = 3.1416; // constante de tipo double
        final int mayoriaEdad = 18; // constante tipo entero

        System.out.println("El valor de PI es:"+ PI);
        System.out.println("La mayoria de edad en España es:"+ mayoriaEdad);

        //EXPLICACIÓN:
        //final indica que la variable es una constante.
        //Las constantes se escriben en mayúsculas por convención.


        //OPERADORES ARITMÉTICOS (+,-,*,/,etc)

        //Permiten realizar cálculos matemáticos básicos.
        int a = 10, b = 5;

        System.out.println("Suma:"+ (a + b));
        System.out.println("Resta:"+ (a - b));
        System.out.println("Multiplicación:"+ (a * b));
        System.out.println("División:"+ (a / b));
        System.out.println("Módulo:"+ (a % b));

        //EXPLICACIÓN:
        // + suma
        // - resta
        // * multiplicación
        // / división
        // % módulo (resto de la división)


        //OPERADORES RELACIONALES

        //Estos operadores comparan valores y devuelven true o false.
        int x = 10, y = 20;

        System.out.println("¿x es igual a y?:"+ (x==y));
        System.out.println("¿x es diferente de y?:"+ (x!=y));
        System.out.println("¿x es mayor que y?:"+ (x > y));
        System.out.println("¿x es menor que y? " + (x < y));

        //EXPLICACIÓN:
        // == igualdad
        // != diferente
        // > mayor que
        // < menor que


        //OPERADORES LÓGICOS

        //Estos operadores combinan expresiones lógicas.
        boolean a2 = true;
        boolean b2 = false;

        System.out.println("a2 AND b2:" + (a2 && b2));
        System.out.println("a2 OR b2:" + (a2 || b2));
        System.out.println("NOT a2:" + (!a2));


        //EXPLICACIÓN:
        // && AND lógico (ambos deben ser true)
        // || OR lógico (al menos uno debe ser true)
        // ! NOT lógico (invierte el valor de true a false)


        //EXPRESIONES Y EVALUACIONES

        int resultado = (10 + 5) * 2/3;

        System.out.println("El resultado de la expresión es: " + resultado);

        //EXPLICACIÓN:
        // Java sigue la jerarquía de operadores (paréntesis primero, luego multiplicación/división, luego suma/resta).

    }
}