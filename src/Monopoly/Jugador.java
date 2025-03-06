package Monopoly;

import java.util.ArrayList;

public class Jugador {

    private Casilla token; // casilla en la q estas
    private Integer dinero;
    private ArrayList<Propiedad> propiedades;

    public Jugador(Casilla token, Integer dinero, ArrayList<Propiedad> propiedades) {
        this.token = token;
        this.dinero = 1500;
        this.propiedades = propiedades;
    }

    public Casilla getToken() {
        return token;
    }

    public void setToken(Casilla token) {
        this.token = token;
    }

    public Integer getDinero() {
        return dinero;
    }

    public void setDinero(Integer dinero) {
        this.dinero = dinero;
    }

    public ArrayList<Propiedad> getPropiedades() {
        return propiedades;
    }

}
