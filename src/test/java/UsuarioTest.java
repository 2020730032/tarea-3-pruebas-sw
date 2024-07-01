import org.junit.jupiter.api.BeforeEach;
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
    void getId() {
        assertEquals(usuario1.getId(), 1);
    }

    @Test
    void getIdFailure() {
        assertTrue(usuario1.getId() != -1);
    }

    @Test
    void setId() {
        usuario1.setId(2);
        assertEquals(usuario1.getId(), 2);
    }

    @Test
    void getName() {
        assertEquals(usuario1.getName(), "Ian Cooper");
    }

    @Test
    void getNameFailure() {
        assertNotSame("Eli Cooper", usuario1.getName());
    }

    @Test
    void setName() {
        usuario1.setName("Eli Cooper");
        assertEquals(usuario1.getName(), "Eli Cooper");
    }

    @Test
    void getDepartment() {
        assertEquals(usuario1.getDepartment(), "Departamento C");
    }

    @Test
    void getDepartmentFailure() {
        assertNotSame("Casa", usuario1.getDepartment());
    }

    @Test
    void setDepartment() {
        usuario1.setDepartment("Departamento P");
        assertEquals(usuario1.getDepartment(), "Departamento P");
    }

    @Test
    void getDescription() {
        assertEquals(usuario1.getDescription(), "Le gustan las donas");
    }

    @Test
    void getDescriptionFailure() {
        assertNotSame("Tiene mucha hambre", usuario1.getDescription());
    }

    @Test
    void setDescription() {
        usuario1.setDescription("No tiene mucha hambre");
        assertEquals(usuario1.getDescription(), "No tiene mucha hambre");
    }

    @Test
    void getHasReservation() {
        assertFalse(usuario1.getHasReservation());
    }

    @Test
    void getHasReservationFailure() {
        assertNotEquals(true, usuario1.getHasReservation());
    }

    @Test
    void setHasReservation() {
        usuario1.setHasReservation(true);
        assertTrue(usuario1.getHasReservation());
    }
}