import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UsuarioTest {

    private Usuario usuario1;

    @BeforeEach
    void setUp() {
        usuario1 = new Usuario(1, "Ian Cooper", "Departamento C", "Le gustan las donas");
        usuario1.setHasReservation(false);
    }

    @Test
    @DisplayName("Get id de usuario")
    void getId() {
        assertEquals(usuario1.getUserID(), 1);
    }

    @Test
    @DisplayName("Get id de usuario malo")
    void getIdFailure() {
        assertTrue(usuario1.getUserID() != -1);
    }

    @Test
    @DisplayName("Set id de usuario")
    void setId() {
        usuario1.setUserID(2);
        assertEquals(usuario1.getUserID(), 2);
    }

    @Test
    @DisplayName("Get nombre de usuario")
    void getName() {
        assertEquals(usuario1.getName(), "Ian Cooper");
    }

    @Test
    @DisplayName("Get nombre de usuario malo")
    void getNameFailure() {
        assertNotSame("Eli Cooper", usuario1.getName());
    }

    @Test
    @DisplayName("Set nombre de usuario")
    void setName() {
        usuario1.setName("Eli Cooper");
        assertEquals(usuario1.getName(), "Eli Cooper");
    }

    @Test
    @DisplayName("Get departamento de usuario")
    void getDepartment() {
        assertEquals(usuario1.getDepartment(), "Departamento C");
    }

    @Test
    @DisplayName("Get departamento de usuario malo")
    void getDepartmentFailure() {
        assertNotSame("Casa", usuario1.getDepartment());
    }

    @Test
    @DisplayName("Set departamento de usuario")
    void setDepartment() {
        usuario1.setDepartment("Departamento P");
        assertEquals(usuario1.getDepartment(), "Departamento P");
    }

    @Test
    @DisplayName("Get descripción de usuario")
    void getDescription() {
        assertEquals(usuario1.getDescription(), "Le gustan las donas");
    }

    @Test
    @DisplayName("Get descripción de usuario malo")
    void getDescriptionFailure() {
        assertNotSame("Tiene mucha hambre", usuario1.getDescription());
    }

    @Test
    @DisplayName("Set descripción de usuario")
    void setDescription() {
        usuario1.setDescription("No tiene mucha hambre");
        assertEquals(usuario1.getDescription(), "No tiene mucha hambre");
    }

    @Test
    @DisplayName("Get usuario tiene reserva")
    void getHasReservation() {
        assertFalse(usuario1.getHasReservation());
    }

    @Test
    @DisplayName("Get usuario tiene reserva malo")
    void getHasReservationFailure() {
        assertNotEquals(true, usuario1.getHasReservation());
    }

    @Test
    @DisplayName("Set usuario tiene reserva")
    void setHasReservation() {
        usuario1.setHasReservation(true);
        assertTrue(usuario1.getHasReservation());
    }
}