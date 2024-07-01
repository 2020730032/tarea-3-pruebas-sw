public class Sala {

    private int numero;
    private String nombre;
    private String ubicacion;
    private Reserva reserva;

    public Sala(int numero, String nombre, String ubicacion) {
        this.numero = numero;
        this.nombre = nombre;
        this.ubicacion = ubicacion;
        this.reserva = null;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public Reserva getReserva() {
        return reserva;
    }

    public void setReserva(Reserva reserva) {
        this.reserva = reserva;
    }

    @Override
    public String toString() {
        return String.format("Número: %d, Nombre: %s, Ubicacion: %s",
                numero, nombre, ubicacion);
    }
}