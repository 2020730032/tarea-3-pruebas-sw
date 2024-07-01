import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ListaSalasTest {

    private ListaSalas listaSalas;
    private Sala sala1;

    @BeforeEach
    void setUp() {
        listaSalas = new ListaSalas();
        sala1 = new Sala(101, "Sala de Reuniones", "Edificio P");
    }

    @Test
    void agregarSala() {
        listaSalas.agregarSala(sala1);
        assertTrue(listaSalas.getSalas().contains(sala1));
    }

    @Test
    void eliminarSalaExistente() {
        listaSalas.agregarSala(sala1);
        listaSalas.eliminarSala(sala1.getNumero());
        assertFalse(listaSalas.getSalas().contains(sala1));
    }

    @Test
    void eliminarSalaNoExistente() {
        listaSalas.agregarSala(sala1);
        listaSalas.eliminarSala(777);
        assertTrue(listaSalas.getSalas().contains(sala1));
    }

    @Test
    void buscarSalaExistente() {
        listaSalas.agregarSala(sala1);
        Sala sala = listaSalas.buscarSala(sala1.getNumero());
        assertNotNull(sala);
        assertEquals(sala1.getNumero(), sala.getNumero());
    }

    @Test
    void buscarSalaNoExistente() {
        Sala sala = listaSalas.buscarSala(999);
        assertNull(sala);
    }

    @Test
    void editarSalaExistente() {
        listaSalas.agregarSala(sala1);
        listaSalas.editarSala(sala1.getNumero(), "Sala de Conferencias", "Edificio B");
        Sala sala = listaSalas.buscarSala(sala1.getNumero());
        assertEquals("Sala de Conferencias", sala.getNombre());
        assertEquals("Edificio B", sala.getUbicacion());
    }

    @Test
    void editarSalaNoExistente() {
        listaSalas.editarSala(999, "Sala de Conferencias", "Edificio B");
    }
}