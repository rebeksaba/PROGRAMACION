package Clase1y2;

public class MainClase1 {
    public static void main(String[] args) {
    // =====================================================
    // 📌 TIPOS PRIMITIVOS EN JAVA 📌
    // Los tipos primitivos almacenan valores simples en memoria.
    // No pueden contener métodos ni comportamientos adicionales.
    // =====================================================

        System.out.println("\n🔹 TIPOS PRIMITIVOS EN JAVA 🔹");

    // 🔹 Enteros (números sin decimales)
        System.out.println("\n👉 ENTEROS:");
    byte numeroByte = 127;  // Número pequeño (-128 a 127)
        System.out.println("byte (8 bits): " + numeroByte);

    short numeroShort = 32000; // Número mediano (-32,768 a 32,767)
        System.out.println("short (16 bits): " + numeroShort);

    int numeroInt = 1000000; // Número grande
        System.out.println("int (32 bits): " + numeroInt);

    long numeroLong = 900000000000L; // Número muy grande (requiere 'L' al final)
        System.out.println("long (64 bits): " + numeroLong);

    // 📌 EJERCICIO 1:
    // Crea una variable de cada tipo entero y asígnale valores distintos.
    // Luego imprímelas con System.out.println().

    // 🔹 Flotantes (números con decimales)
        System.out.println("\n👉 COMA FLOTANTE:");
    float numeroFloat = 3.14f; // Número decimal (requiere 'f' al final)
        System.out.println("float (32 bits, precisión de 6-7 decimales): " + numeroFloat);

    double numeroDouble = 2.7182818284; // Mayor precisión
        System.out.println("double (64 bits, precisión de 15-16 decimales): " + numeroDouble);

    // 📌 EJERCICIO 2:
    // Declara una variable de tipo float y otra de tipo double con valores distintos.
    // Imprímelas en la consola.

    // 🔹 Booleanos (verdadero o falso)
        System.out.println("\n👉 BOOLEANOS:");
    boolean esVerdadero = true;
    boolean esFalso = false;
        System.out.println("boolean (1 bit, valores: true o false): " + esVerdadero + " / " + esFalso);

    // 📌 EJERCICIO 3:
    // Declara una variable boolean y asígnale un valor falso.
    // Luego usa un `if` para imprimir un mensaje si es true o false.

    // 🔹 Caracteres (un solo símbolo)
        System.out.println("\n👉 CARACTERES:");
    char letra = 'A';
    char simbolo = '#';
    char unicode = '\u2764';  // Corazón ❤️
        System.out.println("char (16 bits, caracteres Unicode): " + letra + " " + simbolo + " " + unicode);

    // 📌 EJERCICIO 4:
    // Declara una variable de tipo char con tu inicial y otra con un símbolo especial.
    // Imprímelas en la consola.

    // =====================================================
    // 📌 TIPOS DE REFERENCIA EN JAVA 📌
    // Los tipos de referencia no almacenan valores directamente.
    // En su lugar, almacenan direcciones de memoria que apuntan a objetos.
    // =====================================================

        System.out.println("\n🔹 TIPOS DE REFERENCIA EN JAVA 🔹");

    // 🔹 Cadenas de texto (Strings)
        System.out.println("\n👉 CADENAS DE TEXTO:");
    String texto = "Esto es una cadena en Java";
        System.out.println("String (almacena texto y caracteres): " + texto);

    // 📌 EJERCICIO 5:
    // Declara una variable String con tu nombre y otra con tu lenguaje favorito.
    // Concátalas en un mensaje y muestra el resultado.

    // 🔹 Arrays (listas de valores)
        System.out.println("\n👉 ARRAYS:");
    int[] numeros = {10, 20, 30, 40, 50}; // Array de enteros
        System.out.println("Array de enteros (posición 0): " + numeros[0]);
        System.out.println("Array de enteros (posición 1): " + numeros[1]);

    // 📌 EJERCICIO 6:
    // Declara un array de 5 nombres y muéstralos en la consola usando un bucle.

    // =====================================================
    // 📌 LITERALES EN JAVA 📌
    // Un literal es un valor constante que se usa directamente en el código.
    // Ejemplos: números, texto, valores booleanos.
    // =====================================================

        System.out.println("\n🔹 LITERALES EN JAVA 🔹");

        System.out.println("\n👉 LITERALES ENTEROS:");
        System.out.println(100);  // Literal entero
        System.out.println(-50);  // Literal negativo

        System.out.println("\n👉 LITERALES FLOTANTES:");
        System.out.println(3.1415);  // Literal flotante
        System.out.println(2.5e3);  // Notación científica (2.5 × 10³)

        System.out.println("\n👉 LITERALES BOOLEANOS:");
        System.out.println(true);  // Literal booleano
        System.out.println(false); // Literal booleano

        System.out.println("\n👉 LITERALES DE TEXTO:");
        System.out.println("Hola, mundo");  // Literal de cadena

    // 📌 EJERCICIO 7:
    // Usa literales para imprimir en consola:
    // Un número entero, un decimal, un booleano y una cadena de texto.

        System.out.println(180); //entero
        System.out.println(1.80); //decimal
        System.out.println(true);  //booleano
        System.out.println("Hola gente"); //cadena

    // =====================================================
    // 📌 CONCLUSIÓN 📌
    // En esta práctica aprendimos:
    // - Tipos primitivos: int, double, boolean, char.
    // - Tipos de referencia: String, Arrays.
    // - Literales: valores constantes en el código.
    // =====================================================

        System.out.println("\n✅ HEMOS APRENDIDO SOBRE LOS TIPOS DE DATOS EN JAVA ✅");
        System.out.println("- Tipos primitivos: enteros, flotantes, booleanos, caracteres.");
        System.out.println("- Tipos de referencia: String, Arrays.");
        System.out.println("- Literales: valores constantes en el código.");
        System.out.println("- Además, realizamos ejercicios para reforzar lo aprendido.");

    // 🚀 FIN DEL SCRIPT 🚀
    }
}






