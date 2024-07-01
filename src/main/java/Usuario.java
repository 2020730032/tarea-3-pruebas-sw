public class Usuario {

    private int id;
    private String name;
    private String department;
    private String description;
    private boolean hasReservation;

    public Usuario () {
        this.hasReservation = false;
    }

    public Usuario (int id, String name, String department, String description, boolean hasReservation) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.description = description;
        this.hasReservation = hasReservation;
    }

    public Usuario (int id, String name, String department, String description) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.description = description;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean getHasReservation() {
        return hasReservation;
    }

    public void setHasReservation(boolean hasReservation) {
        this.hasReservation = hasReservation;
    }
}
