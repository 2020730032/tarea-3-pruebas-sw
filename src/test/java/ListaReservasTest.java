import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.*;

class ListaReservasTest {

    private ListaReservas listaReservas;
    private Usuario usuario1;
    private Sala sala1;
    LocalDateTime inicio = LocalDateTime.now();

    @BeforeEach
    void setUp() {
        listaReservas = new ListaReservas();
        usuario1 = new Usuario("Juan Perez", "Departamento A", "Usuario activo");
        sala1 = new Sala(101, "Sala de Reuniones", "Edificio Principal");
    }

    @Test
    void agregarReserva() {
        Reserva reserva1 = new Reserva(inicio, inicio.plusHours(2), usuario1, sala1, "Reunión semanal");
        listaReservas.agregarReserva(reserva1);
        assertTrue(listaReservas.getReservas().contains(reserva1));

        Reserva reserva2 = new Reserva(inicio, inicio.plusHours(2), usuario1, sala1,"Otra reunión");
        listaReservas.agregarReserva(reserva2);
        assertFalse(listaReservas.getReservas().contains(reserva2));
    }

    @Test
    void agregarReservaUsuarioConReserva() {
        Reserva reserva1 = new Reserva(inicio, inicio.plusHours(2), usuario1, sala1, "Reunión semanal");
        listaReservas.agregarReserva(reserva1);

        Sala sala2 = new Sala(102, "Sala de Capacitación", "Edificio B");
        Reserva reserva2 = new Reserva(inicio, inicio.plusHours(2), usuario1, sala2, "Capacitación en curso");
        listaReservas.agregarReserva(reserva2);
        assertFalse(listaReservas.getReservas().contains(reserva2));
    }

    @Test
    void eliminarReserva() {
        Reserva reserva1 = new Reserva(inicio, inicio.plusHours(2), usuario1, sala1, "Reunión semanal");
        listaReservas.agregarReserva(reserva1);
        listaReservas.eliminarReserva(reserva1.getReservaID());
        assertFalse(listaReservas.getReservas().contains(reserva1));
    }

    @Test
    void eliminarReservaNoExistente() {
        Reserva reserva1 = new Reserva(inicio, inicio.plusHours(2), usuario1, sala1, "Reunión semanal");
        listaReservas.agregarReserva(reserva1);
        listaReservas.eliminarReserva(999); // ID que no existe
        assertTrue(listaReservas.getReservas().contains(reserva1));
    }

    @Test
    void buscarReservaExistente() {
        Reserva reserva1 = new Reserva(inicio, inicio.plusHours(2), usuario1, sala1, "Reunión semanal");
        listaReservas.agregarReserva(reserva1);
        Reserva foundReserva = listaReservas.buscarReserva(reserva1.getReservaID());
        assertNotNull(foundReserva);
        assertEquals(reserva1.getReservaID(), foundReserva.getReservaID());
    }

    @Test
    void buscarReservaNoExistente() {
        Reserva foundReserva = listaReservas.buscarReserva(999); // ID que no existe
        assertNull(foundReserva);
    }
}