import java.util.ArrayList;
import java.util.List;

public class ListaUsuarios {
    private final List<Usuario> usuarios;

    public ListaUsuarios() {
        usuarios = new ArrayList<>();
    }

    public void agregarUsuario(Usuario usuario) {
        usuarios.add(usuario);
    }

    public void eliminarUsuario(int userID) {
        usuarios.removeIf(u -> u.getUserID() == userID);
    }

    public Usuario buscarUsuario(int userID) {
        for (Usuario usuario : usuarios) {
            if (usuario.getUserID() == userID) {
                return usuario;
            }
        }
        return null;
    }

    public void editarUsuario(int userID, String nombre, String departamento, String descripcion) {
        for (Usuario usuario : usuarios) {
            if (usuario.getUserID() == userID) {
                usuario.setNombre(nombre);
                usuario.setDepartamento(departamento);
                usuario.setDescripcion(descripcion);
                return;
            }
        }

        System.out.println("Usuario no encontrado.");
    }

    public void listarUsuarios() {
        if (usuarios.isEmpty()) {
            System.out.println("No hay usuarios registrados.");
        } else {
            System.out.println("Lista de Usuarios:");
            for (Usuario usuario : usuarios) {
                System.out.println(usuario);
            }
        }
    }

    public List<Usuario> getUsuarios() {
        return usuarios;
    }
}