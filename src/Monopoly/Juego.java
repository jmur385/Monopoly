package Monopoly;

public class Juego {

    private Integer numeroJugadores;
    private Tablero tablero;

    public Juego(Integer numeroJugadores, Tablero tablero) {
        this.numeroJugadores = numeroJugadores;
        this.tablero = tablero;
    }

    public Integer getNumeroJugadores() {
        return numeroJugadores;
    }

    public void setNumeroJugadores(Integer numeroJugadores) {
        this.numeroJugadores = numeroJugadores;
    }

    public Tablero getTablero() {
        return tablero;
    }

    public void setTablero(Tablero tablero) {
        this.tablero = tablero;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Juego{");
        sb.append("numeroJugadores=").append(numeroJugadores);
        sb.append(", tablero=").append(tablero);
        sb.append('}');
        return sb.toString();
    }
}
