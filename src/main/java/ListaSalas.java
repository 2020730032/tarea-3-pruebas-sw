import java.util.ArrayList;
import java.util.List;

public class ListaSalas {
    private final List<Sala> salas;

    public ListaSalas() {
        salas = new ArrayList<>();
    }

    public void agregarSala(Sala sala) {
        salas.add(sala);
    }

    public void eliminarSala(int numeroSala) {
        salas.removeIf(s -> s.getNumero() == numeroSala);
    }

    public Sala buscarSala(int numeroSala) {
        for (Sala sala : salas) {
            if (sala.getNumero() == numeroSala) {
                return sala;
            }
        }
        return null;
    }

    public void editarSala(int numeroSala, String nombre, String edificio) {
        for (Sala sala : salas) {
            if (sala.getNumero() == numeroSala) {
                sala.setNombre(nombre);
                sala.setUbicacion(edificio);
                return;
            }
        }

        System.out.println("Sala no encontrada.");
    }

    public void listarSalas() {
        if (salas.isEmpty()) {
            System.out.println("No hay salas registradas.");
        } else {
            System.out.println("Lista de Salas:");
            for (Sala sala : salas) {
                System.out.println(sala);
            }
        }
    }

    public List<Sala> getSalas() {
        return salas;
    }
}