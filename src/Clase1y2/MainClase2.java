package Clase1y2;

import java.util.Scanner;

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


        //EJERCICIOS PRÁCTICOS//

        //1. Crea una constante llamada GRAVEDAD con el valor 9.81 y muestra su valor por pantalla

        final double gravedad= 9.81;

        System.out.println("El valor de la GRAVEDAD es de:" + gravedad);

        //2. Declara dos variables a= 25 y b= 7. Realiza todas las operaciones aritméticas entre ellas e imprime los resultados.

        int h = 25, f = 7;

        System.out.println("Suma:" + (h + f));
        System.out.println("Resta:" + (h - f));
        System.out.println("Multiplicación:" + (h * f));
        System.out.println("División:" + (h / f));
        System.out.println("Módulo:" + (h % f));

        //apunte: he cambiado el nombre de las variables a y b por hy f ya que las dos primeras ya aparecen en el main y me da error

       //3. Declara una variable edad e imprime si la persona es mayor de edad (>=18) o menor de edad (< 18).

        int edad = 20;

        System.out.println("¿Es mayor de edad?" + (edad > 18));
        System.out.println("Es menor de edad?" + (edad < 18));


        //4. Crea un programa que reciba dos números y determine cuál es mayor, menor o si son iguales.

        int n =30, w =50;

        System.out.println("¿n es mayor que w?" + (n > w));
        System.out.println("¿n es menor que w?" + (n < w));
        System.out.println("¿es n igual que w?" + (n == w));


        //5. Escribe un programa que evalúe la siguiente expresión lógica: (5 > 3) && (10 < 20). ¿Cuál es el resultado?

        boolean m= true, s= true;

        System.out.println("Son verdaderas las expresiones (5>3) y (10<20):" + (m && s));

        //El resultado es verdadero ya que ambas expresiones son verdaderas.

        //6. Modifica el programa anterior y evalúa también (5 > 3) || (10 > 20). Explica los resultados obtenidos.

        boolean g= true, j= false;

        System.out.println("¿Es alguna de estas expresiones verdadera (5>3) y (10>20):" + (g || j));

        //El resultado es true porque la expresión g es verdadera, si una de las dos es verdadera el resultado es true.


        //7. Declara tres variables x=10, y=20 y z=30. Compara x + y con z utilizando operadores relacionales.

        int q = 10, p = 20, z = 30;

        System.out.println("¿Es la suma de (10+20) = 30 ?:" + (q + p == z));

        //8. Crea un programa que pida al usuario dos números y evalúe si son múltiplos (num1 % num2 == 0).

        final int Numero_1 = 50;
        final int Numero_2 = 5;

        System.out.println("¿Cuál es el resto entre 50 y 5?:" + (Numero_1 % Numero_2));
        System.out.println("¿Son múltiplos 50 y 5 ?:" + (Numero_1 % Numero_2 == 0));

        //Si son múltiplos porque el resto es 0.


        //9.Escribe un código que reciba un número e indique si es par o impar usando el operador módulo (%).

        final int numeroX = 100;

        System.out.println("¿Es numeroX par?:" + (numeroX % 2 == 0));


        //10. Define una constante TASA_CAMBIO con el valor 1.12 (dólar a euro). Convierte una cantidad de dólares ingresada por el usuario a euros.

        final double TASA_CAMBIO = 1.12;


                Scanner scanner = new Scanner(System.in);

                // Solicitar al usuario la cantidad en dólares
                System.out.print("Ingrese la cantidad en dólares: ");
                double dolares = scanner.nextDouble();

                // Convertir a euros
                double euros = dolares / TASA_CAMBIO;

                // Mostrar el resultado
                System.out.printf("La cantidad en euros es: %.2f%n", euros);

                scanner.close();
            }
        }









