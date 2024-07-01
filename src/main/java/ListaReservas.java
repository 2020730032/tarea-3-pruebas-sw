import java.util.ArrayList;
import java.util.List;

public class ListaReservas {
    private final List<Reserva> reservas;

    public ListaReservas() {
        reservas = new ArrayList<>();
    }

    public void agregarReserva(Reserva reserva) {
        Sala sala = reserva.getSala();
        if (sala.getReserva() != null) {
            System.out.println("La sala ya tiene una reserva.");
            return;
        }

        Usuario usuario = reserva.getUsuario();
        if (usuario.getReserva() != null) {
            System.out.println("El usuario ya tiene una reserva.");
            return;
        }

        reservas.add(reserva);

        sala.setReserva(reserva);
        usuario.setReserva(reserva);
    }

    public void eliminarReserva(int reservaID) {
        reservas.removeIf(r -> r.getReservaID() == reservaID);
    }

    public Reserva buscarReserva(int reservaID) {
        for (Reserva reserva : reservas) {
            if (reserva.getReservaID() == reservaID) {
                return reserva;
            }
        }
        return null;
    }

    public void listarReservas() {
        if (reservas.isEmpty()) {
            System.out.println("No hay reservas registradas.");
        } else {
            System.out.println("Lista de Reservas:");
            for (Reserva reserva : reservas) {
                System.out.println(reserva);
            }
        }
    }

    public List<Reserva> getReservas() {
        return reservas;
    }
}