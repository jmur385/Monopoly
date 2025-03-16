package Monopoly;
import java.util.ArrayList;
import java.util.List;
public class Tablero {


        private List<Casilla> casillas;

        public Tablero() {
            this.casillas = new ArrayList<>();

            casillas.add(new Casilla("Salida", 0));
            casillas.add(new Casilla("Casa 1", 50));
            casillas.add(new Casilla("Impuesto", 0));
            casillas.add(new Casilla("Casa 2", 60));
            casillas.add(new Casilla("Casa", 0));
            casillas.add(new Casilla("Casa 3", 60));
            casillas.add(new Casilla("Casa 4", 100));
            casillas.add(new Casilla("Casa 5", 70));
            casillas.add(new Casilla("Casa 6", 60));
            casillas.add(new Casilla("¡Suerte!", 0));
            casillas.add(new Casilla("Comunidad", 0));
            casillas.add(new Casilla("Parking", 0));
            casillas.add(new Casilla("Casa 7", 290));

        }

        public Casilla getCasilla(int posicion) {
            return casillas.get(posicion);
        }

        public int getCantidadCasillas() {
            return casillas.size();
        }

    }

