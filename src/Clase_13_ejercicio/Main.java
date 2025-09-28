package Clase_13_ejercicio;

public class Main {
    public static void main (String [ ] args){

        Vehiculo SkodaFabia = new Coche(95);
        Vehiculo CanyonUltimate  = new Bicicleta(12);

        Vehiculo [] vehiculos = {SkodaFabia, CanyonUltimate};

        for (Vehiculo v: vehiculos){
            System.out.println("Velocidad máxima: " + v.calcularVelocidadMaxima() + " km/h");
            System.out.println("Consumo: " + v.consumo() + "l a los 100km");

        }
    }

}
