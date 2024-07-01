import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReservaTest {

    private Reserva reserva1;

    @BeforeEach
    void setUp() {
        reserva1 = new Reserva(1, 1, "Para 10 personas", "01-07-2024");
    }

    @Test
    @DisplayName("Get id de sala")
    void getClassroomID() {
        assertEquals(reserva1.getClassroomID(), 1);
    }
    @Test
    @DisplayName("Get id de sala malo")
    void getClassroomIDFailure() {
        assertTrue(reserva1.getClassroomID() != -1);
    }

    @Test
    @DisplayName("Set id de sala")
    void setClassroomID() {
        reserva1.setClassroomID(2);
        assertEquals(reserva1.getClassroomID(), 2);
    }

    @Test
    @DisplayName("Get id de usuario")
    void getUserID() {
        assertEquals(reserva1.getUserID(), 1);
    }

    @Test
    @DisplayName("Get id de usuario malo")
    void getUserIDFailure() {
        assertTrue(reserva1.getUserID() != -1);
    }

    @Test
    @DisplayName("Set id de usuario")
    void setUserID() {
        reserva1.setUserID(3);
        assertEquals(reserva1.getUserID(), 3);
    }

    @Test
    @DisplayName("Get detalle de reserva")
    void getDetail() {
        assertEquals(reserva1.getDetail(), "Para 10 personas");
    }

    @Test
    @DisplayName("Get detalle de reserva malo")
    void getDetailFailure() {
        assertNotSame("Sala cerrada", reserva1.getDetail());
    }

    @Test
    @DisplayName("Set detalle de reserva")
    void setDetail() {
        reserva1.setDetail("Para 50 personas");
        assertEquals(reserva1.getDetail(), "Para 50 personas");
    }

    @Test
    @DisplayName("Get fecha de reserva")
    void getDate() {
        assertEquals(reserva1.getDate(), "01-07-2024");
    }

    @Test
    @DisplayName("Get fecha de reserva malo")
    void getDateFailure() {
        assertNotSame("01-01-2024", reserva1.getDate());
    }

    @Test
    @DisplayName("Set fecha de reserva")
    void setDate() {
        reserva1.setDate("01-07-2025");
        assertEquals(reserva1.getDate(), "01-07-2025");
    }
}