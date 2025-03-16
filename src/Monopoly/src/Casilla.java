public class Casilla extends Tablero{

        private String nombre;
        private int precio;
        private Jugador propietario;
        private boolean casillaInicio;

        public Casilla(String nombre, int precio) {
            this.nombre = nombre;
            this.precio = precio;
            this.propietario = null;
            this.casillaInicio = false;
        }

    /**
     * Este indica la casilla de inicio
     * @param nombre
     * @param propietario
     */
        public Casilla(String nombre,Jugador propietario) {
            this.nombre = nombre;
            this.precio=0;
            this.propietario = propietario;
            this.casillaInicio = true;
        }

    public boolean isCasillaInicio() {
        return casillaInicio;
    }

    public void setCasillaInicio(boolean casillaInicio) {
        this.casillaInicio = casillaInicio;
    }

    public Jugador getPropietario() {
        return propietario;
    }

    public void setPropietario(Jugador propietario) {
        this.propietario = propietario;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    //
}

