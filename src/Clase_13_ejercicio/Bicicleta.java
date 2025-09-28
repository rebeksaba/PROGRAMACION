package Clase_13_ejercicio;

public class Bicicleta extends Vehiculo {

    private int numeroMarchas;

    public Bicicleta (int numeroMarchas){
        this.numeroMarchas = numeroMarchas;
    }

    public int getNumeroMarchas() {
        return numeroMarchas;
    }

    @Override
    public double calcularVelocidadMaxima(){
        return numeroMarchas * 5;
    }

    @Override
    public double consumo(){
        return 0.0; //no consume nada

    }
}
