package Clase_13_ejercicio;

public class Main {
    public static void main (String [ ] args){

        Vehiculo SkodaFabia = new Coche(95);
        Vehiculo CanyonUltimate  = new Bicicleta(12);

        Vehiculo [] vehiculos = {SkodaFabia, CanyonUltimate};

        for (Vehiculo v: vehiculos){
            if ( v instanceof Coche c){
                System.out.println("Velocidad máxima: " + c.calcularVelocidadMaxima() + " km/h");
                System.out.println("Consumo: " + c.consumo() + "l a los 100km");

            }else if (v instanceof Bicicleta b){
                System.out.println("Velocidad máxima: " + b.calcularVelocidadMaxima() + " km/h");
                System.out.println("Consumo: " + b.consumo() + " No consume combustible. ");

            }

        }
    }

}
