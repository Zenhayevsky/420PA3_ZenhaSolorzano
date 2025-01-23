public class Player {
    private String pName;
    private String pPosition;

    public String getName() {
        return pName;
    }

    public void setName(String pName) {
        this.pName = pName;
    }

    public String getPosition() {
        return pPosition;
    }

    public void setPosition(String pPosition) {
        this.pPosition = pPosition;
    }

    public Player() {
        this.pName = "Not defined";
        this.pPosition = "Not defined";
    }

    public Player(String name, String position) {
        this.pName = name;
        this.pPosition = position;
    }
}
