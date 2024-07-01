public class Reserva {

    private int classroomID;
    private int userID;
    private String detail;
    private String date;

    public Reserva(int classroomID, int userID, String detail, String date) {
        this.classroomID = classroomID;
        this.userID = userID;
        this.detail = detail;
        this.date = date;
    }

    public int getClassroomID() {
        return classroomID;
    }

    public void setClassroomID(int classroomID) {
        this.classroomID = classroomID;
    }

    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}
