import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ListaUsuariosTest {

    private ListaUsuarios listaUsuarios;
    private Usuario usuario1;

    @BeforeEach
    void setUp() {
        listaUsuarios = new ListaUsuarios();
        usuario1 = new Usuario("Ian Cooper", "Informática", "Estudiante de último año");
    }

    @Test
    void agregarUsuario() {
        listaUsuarios.agregarUsuario(usuario1);
        assertTrue(listaUsuarios.getUsuarios().contains(usuario1));
    }

    @Test
    void eliminarUsuarioExistente() {
        listaUsuarios.agregarUsuario(usuario1);
        listaUsuarios.eliminarUsuario(usuario1.getUserID());
        assertFalse(listaUsuarios.getUsuarios().contains(usuario1));
    }

    @Test
    void eliminarUsuarioNoExistente() {
        listaUsuarios.agregarUsuario(usuario1);
        listaUsuarios.eliminarUsuario(777);
        assertTrue(listaUsuarios.getUsuarios().contains(usuario1));
    }

    @Test
    void buscarUsuarioExistente() {
        listaUsuarios.agregarUsuario(usuario1);
        Usuario usuario = listaUsuarios.buscarUsuario(usuario1.getUserID());
        assertNotNull(usuario);
        assertEquals(usuario1.getUserID(), usuario.getUserID());
    }

    @Test
    void buscarUsuarioNoExistente() {
        Usuario usuario = listaUsuarios.buscarUsuario(777);
        assertNull(usuario);
    }

    @Test
    void editarUsuarioExistente() {
        listaUsuarios.agregarUsuario(usuario1);
        listaUsuarios.editarUsuario(usuario1.getUserID(), "Hector Duarte", "Física", "Profesor de fisica 140");
        Usuario usuario = listaUsuarios.buscarUsuario(usuario1.getUserID());
        assertEquals("Hector Duarte", usuario.getNombre());
        assertEquals("Física", usuario.getDepartamento());
        assertEquals("Profesor de fisica 140", usuario.getDescripcion());
    }

    @Test
    void editarUsuarioNoExistente() {
        listaUsuarios.editarUsuario(777, "Hector Duarte", "Física", "Profesor de fisica 140");

    }
}