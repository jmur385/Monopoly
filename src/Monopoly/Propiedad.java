package Monopoly;

public class Propiedad extends Casilla{

    private Integer precio;
    private Integer precioPagar;

    public Propiedad(String nombre, Integer precio, Integer precioPagar) {
        super(nombre);
        this.precio = precio;
        this.precioPagar = precioPagar;
    }

    public Integer getPrecio() {
        return precio;
    }

    public void setPrecio(Integer precio) {
        this.precio = precio;
    }

    public Integer getPrecioPagar() {
        return precioPagar;
    }

    public void setPrecioPagar(Integer precioPagar) {
        this.precioPagar = precioPagar;
    }

}
