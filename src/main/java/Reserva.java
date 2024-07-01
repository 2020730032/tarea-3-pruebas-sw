import java.time.LocalDateTime;

public class Reserva {
    private static int contadorIds = 1;
    private int reservaID;
    private LocalDateTime inicio;
    private LocalDateTime fin;
    private Usuario usuario;
    private Sala sala;
    private String detalleReserva;

    public Reserva(LocalDateTime inicio, LocalDateTime fin, Usuario usuario, Sala sala, String detalleReserva) {
        this.reservaID = contadorIds++;
        this.inicio = inicio;
        this.fin = fin;
        this.usuario = usuario;
        this.sala = sala;
        this.detalleReserva = detalleReserva;
    }

    public int getReservaID() {
        return reservaID;
    }

    public LocalDateTime getInicio() {
        return inicio;
    }

    public void setInicio(LocalDateTime inicio) {
        this.inicio = inicio;
    }

    public LocalDateTime getFin() {
        return fin;
    }

    public void setFin(LocalDateTime fin) {
        this.fin = fin;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Sala getSala() {
        return sala;
    }

    public void setSala(Sala sala) {
        this.sala = sala;
    }

    @Override
    public String toString() {
        return String.format("ID: %d, Usuario: %s, Sala: %s, Inicio: %s, Fin: %s, Detalle: %s",
                reservaID, usuario.getNombre(), sala.getNombre(), inicio, fin, detalleReserva);
    }
}