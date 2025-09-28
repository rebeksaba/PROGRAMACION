package Clase14_PasarelaPago;

public abstract class Pago {

    protected double cantidad;

    public Pago (double cantidad) {
        if (cantidad <=0) {
            throw new IllegalArgumentException("La cantidad debe ser mayor que 0. ");
        }

        this.cantidad = cantidad;


    }

    public void mostrarCantidad(){
        System.out.println("Cantidad: " + this.cantidad);
    }

    public abstract void procesarPago();

}
