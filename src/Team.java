import java.util.ArrayList;
import java.util.List;

public class Team {
    private String tTeamName;
    public List<Player> players = new ArrayList<>();

    public String getTeamName() {
        return tTeamName;
    }

    public void setTeamName(String tTeamName) {
        this.tTeamName = tTeamName;
    }

    public Team() {
        this.tTeamName = "Not defined";
        this.players = new ArrayList<>();
    }

    public Team(String name, List<Player> playersList) {
        this.tTeamName = name;
        for (Player p : playersList) {
            this.players.add(p);
        }
    }
}
