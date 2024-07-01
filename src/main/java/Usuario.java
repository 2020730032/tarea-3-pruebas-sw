public class Usuario {

    private int userID;
    private String name;
    private String department;
    private String description;
    private boolean hasReservation;

    public Usuario () {
        this.hasReservation = false;
    }

    public Usuario (int userID, String name, String department, String description, boolean hasReservation) {
        this.userID = userID;
        this.name = name;
        this.department = department;
        this.description = description;
        this.hasReservation = hasReservation;
    }

    public Usuario (int userId, String name, String department, String description) {
        this.userID = userId;
        this.name = name;
        this.department = department;
        this.description = description;
    }

    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
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
