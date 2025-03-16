import java.util.List;
import java.util.Random;
public class Juego {

        private List<Jugador> jugadores;
        private Tablero tablero;
        private Random random;

        public Juego(List<Jugador> jugadores) {
            this.jugadores = jugadores;
            this.tablero = new Tablero();
            this.random = new Random();
        }

        public void iniciarJuego() {
            while (jugadores.size() > 1) {
                for (Jugador jugador : jugadores) {
                    turno(jugador);
                    if (jugador.getDinero() <= 0) {
                        jugadores.remove(jugador);
                    }
                }
            }
            System.out.println("Ganador: " + jugadores.get(0).getNombre());
        }

        private void turno(Jugador jugador) {
            int dado1 = random.nextInt(6) + 1;
            int dado2 = random.nextInt(6) + 1;
            int totalDados = dado1 + dado2;

            jugador.setPosicion((jugador.getPosicion() + totalDados) % tablero.getCantidadCasillas());
            Casilla casillaActual = tablero.getCasilla(jugador.getPosicion());

            System.out.println(jugador.getNombre() + " lanzó " + dado1 + " y " + dado2 + ". Cayó en " + casillaActual.getNombre());

            if (casillaActual.getPropietario() ==null){
                if (jugador.getDinero() >= casillaActual.getPrecio()) {
                    jugador.setDinero(jugador.getDinero() - casillaActual.getPrecio());
                    casillaActual.setPropietario(jugador);
                    System.out.println(jugador.getNombre() + (" compró la propiedad " + casillaActual.getNombre()));
                } else
                    System.out.println(jugador.getNombre() + (" no tiene suficiente dinero para comprar la propiedad, lo sentimos muchísimo" ));
            }
        }


        //







}
