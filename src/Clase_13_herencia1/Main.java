package Clase_13_herencia1;

public class Main {
    public static void main (String [ ] args){

        Usuario user = new Usuario("Pepe", "pepe@gmail.com");
        Usuario admin = new Administrador("maría", "maria@gmail.com", "Gestor");
        Usuario cli = new Cliente("Juan", "juan@gmail.com", 50);

        Usuario[] usuarios = { user, admin, cli};

        for (Usuario u : usuarios){
            u.mostrarInfo();
        }
    }
}
