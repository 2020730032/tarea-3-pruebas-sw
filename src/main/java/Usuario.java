public class Usuario {
    private static int contadorIds = 1;
    private int userID;
    private String nombre;
    private String departamento;
    private String descripcion;
    private Reserva reserva;

    public Usuario(String nombre, String departamento, String descripcion) {
        this.userID = contadorIds++;
        this.nombre = nombre;
        this.departamento = departamento;
        this.descripcion = descripcion;
        this.reserva = null;
    }

    // Getters y setters
    public int getUserID() {
        return userID;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Reserva getReserva() {
        return reserva;
    }

    public void setReserva(Reserva reserva) {
        this.reserva = reserva;
    }

    @Override
    public String toString() {
        return String.format("ID: %d, Nombre: %s, Departamento: %s, Descripción: %s",
                userID, nombre, departamento, descripcion);
    }
}