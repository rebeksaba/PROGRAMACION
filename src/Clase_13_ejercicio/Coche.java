package Clase_13_ejercicio;

public class Coche extends Vehiculo {

    private int caballos;

    public Coche (int caballos){
        this.caballos = caballos;
    }

    public int getCaballos() {
        return caballos;
    }

    @Override
    public double calcularVelocidadMaxima() {
        return caballos * 2;
    }

    @Override
    public double consumo() {
        return caballos * 0.05;
    }
}
