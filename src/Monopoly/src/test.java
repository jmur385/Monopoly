import java.util.ArrayList;
import java.util.List;
public class test {


        public static void main(String[] args) {
            List<Jugador> jugadores = new ArrayList<>();
            jugadores.add(new Jugador("Jugador 1", 1500));
            jugadores.add(new Jugador("Jugador 2", 1500));
            Juego juego = new Juego(jugadores);
            juego.iniciarJuego();

            //

        }
    }

