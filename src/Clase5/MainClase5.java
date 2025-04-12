import java.util.Scanner;

public class Clase5 {

    public static void main(String[] args) {

        //🟨 Ejercicio 1 – Salir de un bucle while con break
        //Haz un programa que pida al usuario números enteros positivos.
        //El programa debe terminar cuando el usuario introduzca el número 0.
        // Usa un bucle while con break.

        Scanner sc = new Scanner(System.in);
        int numero;

        while(true){
            System.out.println("Introduce un número y pon un 0 para salir");
            numero = sc.nextInt();
            if (numero == 0){
                //Si es 0, como pide el enunciado, salgo del bucle
                break;
            }
            System.out.println("Has introducido:" + numero);
        }
        System.out.println("Programa finalizado");
        sc.close();


        //🟨 Ejercicio 2 – Saltarse los múltiplos de 3 con continue
        //Escribe un programa que muestre los números del 1 al 10,
        // excepto los múltiplos de 3.
        // Usa un bucle for con continue.

        //Recorrer ese intervalo de números.
        for (int i = 1;i<=10;i++){
            if (i%3 == 0){
                //Si es múltiplo de 3, sáltame
                continue;

            }
            System.out.println(i);
        }

        //🟨 Ejercicio 3 – Finalizar un bucle for al encontrar un número concreto
        //Haz un programa que busque el número 7 entre los números del 1 al 20.
        // Cuando lo encuentre, debe mostrar un mensaje y terminar el bucle con break.

        for (int i= 1;i<=20;i++) {
            if (i == 7) {
                System.out.println("Has encontrado el número 7!");
                break;

            }
            System.out.println("Probando qué se ve con: " + i);
        }


        //🟨 Ejercicio 4 – Evitar mostrar letras vocales con continue
        //Muestra las letras de la palabra "PROGRAMACION",
        //pero omite las vocales usando continue.


        String palabra = "PROGRAMACION";
        for (int i =0; i<palabra.length();i++){
            char letra = palabra.charAt(i);

            if (letra == 'A' || letra == 'E' || letra == 'I' || letra == 'O' || letra == 'U'){
                //Saltar las vocales
                continue;

            }
            System.out.println(letra);
        }


        //🟨 Ejercicio 5 – Dividir dos números con try-catch
        //Haz un programa que divida dos números enteros introducidos por el usuario.
        //Usa try-catch para evitar que el programa se rompa si el divisor es 0.




        //🟨 Ejercicio 6 – Acceder a una posición no válida de una cadena (charAt)
        // con control de excepción.
        //Solicita una palabra al usuario y pide una posición.
        //Intenta mostrar el carácter en esa posición usando try-catch.
        // Si se produce un error, muestra un mensaje.


        //🟨 Ejercicio 7 – Mensaje de fin con finally
        //Haz un programa que intente dividir dos números.
        //Usa try-catch-finally para mostrar siempre un mensaje final que diga
        //"Operación terminada".



        //🟨 Ejercicio 8 – Leer números y sumar los positivos,
        // ignorando los negativos con continue.
        //Pide al usuario 5 números enteros.
        //Suma solo los positivos usando continue para ignorar los negativos.



        //🟨 Ejercicio 9 – Detectar si se ha introducido texto en lugar
        //de número (try-catch)
        //Pide al usuario que introduzca un número.
        //Si escribe una palabra u otro texto, el programa debe capturar
        //la excepción y mostrar "Eso no es un número".


        //🟨 Ejercicio 10 – Salir de un bucle do-while
        //cuando se adivina un número secreto
        //Crea un número secreto entre 1 y 10. El usuario tiene que adivinarlo.
        //Usa do-while y break para salir cuando acierte.