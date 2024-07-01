public class Sala {

    private int codeId;
    private String name;
    private String location;
    private boolean isUsed;

    public Sala(int code_id, String name, String location, boolean isUsed) {
        this.codeId = code_id;
        this.name = name;
        this.location = location;
        this.isUsed = isUsed;
    }

    public Sala(int code_id, String name, String location) {
        this.codeId = code_id;
        this.name = name;
        this.location = location;
    }

    public Sala() {
        this.isUsed = false;
    }

    public int getCodeId() {
        return codeId;
    }

    public void setCodeId(int codeId) {
        this.codeId = codeId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public boolean getIsUsed() {
        return isUsed;
    }

    public void setIsUsed(boolean isUsed) {
        this.isUsed = isUsed;
    }

}
