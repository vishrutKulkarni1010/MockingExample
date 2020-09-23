import java.util.List;

public class Team {
    private ScoreService s;
    private List<Player> playerList;

    public ScoreService getScoreService(){
        return s;
    }
    public void setScoreService(ScoreService t){
        this.s = t;
    }
    public List<Player>  getPlayerList(){
        return playerList;
    }
    public void setPlayers(List<Player> p){
        this.playerList = p;
    }
    public int getTotal(){
        int total=0;
        for(Player p:playerList){
            total+=s.getScore(p);
        }
        return total;
    }
}
