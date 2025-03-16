package Monopoly;
import java.util.ArrayList;
import java.util.List;
public class Jugador {


        private String nombre;
        private int dinero;
        private int token;
        private List<Casilla> propiedades;

        public Jugador(String nombre, int dinero) {
            this.nombre = nombre;
            this.dinero = dinero;
            this.token = 0;
            this.propiedades = new ArrayList<>();
        }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        nombre = nombre;
    }

    public int getDinero() {
        return dinero;
    }

    public void setDinero(int dinero) {
        this.dinero = dinero;
    }

    public int getPosicion() {
        return token;
    }

    public void setPosicion(int posicion) {
        this.token = posicion;
    }

    public List<Casilla> getPropiedades() {
        return propiedades;
    }

    public void setPropiedades(List<Casilla> propiedades) {
        this.propiedades = propiedades;
    }


}
