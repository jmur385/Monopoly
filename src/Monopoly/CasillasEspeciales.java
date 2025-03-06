package Monopoly;

public abstract class CasillasEspeciales extends Casilla{

    public CasillasEspeciales(String nombre) {
        super(nombre);
    }

    public void pagarBanco() {
        System.out.println("meow");
    }

    private Integer d;

}
