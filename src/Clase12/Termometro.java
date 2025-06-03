package Clase12;

public class Termometro {

    private double temperaturaActual;

    public Termometro (){
        this.temperaturaActual = 25.0;

    }

    public double leerTemperatura(){
        this.temperaturaActual += (Math.random() * 2 -1); //oscilación entre -1 y 1 grados
        return this.temperaturaActual;
    }



}
