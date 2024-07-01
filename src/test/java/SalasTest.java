import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;
class SalasTest {

    private Salas sala1 = new Salas();

    @BeforeEach
    public void setUp() throws Exception {
        sala1 = new Salas(1, "Sala 106", "Edificio P");
        sala1.setIsUsed(true);
    }

    @Test
    @DisplayName("Get código de sala")
    void getCodeId() throws Exception {
        assertEquals(sala1.getCodeId(), 1);
    }

    @Test
    @DisplayName("Get código de sala malo")
    void getCodeIdFailure() throws Exception {
        assertTrue(sala1.getCodeId() != -1);
    }

    @Test
    @DisplayName("Set código de sala")
    void setCodeId() throws Exception {
        sala1.setCodeId(2);
        assertEquals(sala1.getCodeId(), 2);
    }

    @Test
    @DisplayName("Get nombre de sala")
    void getName() throws Exception {
        assertEquals(sala1.getName(), "Sala 106");
    }

    @Test
    @DisplayName("Get nombre de sala malo")
    void getNameFailure() throws Exception {
        assertNotSame(" ", sala1.getName());
    }

    @Test
    @DisplayName("Set nombre de sala")
    void setName() throws Exception {
        sala1.setName("Sala 225");
        assertEquals("Sala 225", sala1.getName());
    }

    @Test
    @DisplayName("Get ubicación de sala")
    void getLocation() throws Exception {
        assertEquals(sala1.getLocation(), "Edificio P");
    }

    @Test
    @DisplayName("Get ubicación de sala malo")
    void getLocationFailure() throws Exception {
        assertNotSame("Edificio Z", sala1.getLocation());
    }

    @Test
    @DisplayName("Set ubicación de sala")
    void setLocation() throws Exception {
        sala1.setLocation("Edificio C");
        assertEquals("Edificio C", sala1.getLocation());
    }

    @Test
    @DisplayName("Get sala en uso")
    void getIsUsed() throws Exception {
        assertTrue(sala1.getIsUsed());
    }

    @Test
    @DisplayName("Get sala en uso")
    void getIsUsedFailure() throws Exception {
        assertNotEquals(false, sala1.getIsUsed());
    }

    @Test
    @DisplayName("Set sala en uso")
    void setIsUsed() throws Exception {
        sala1.setIsUsed(false);
        assertFalse(sala1.getIsUsed());
    }
}