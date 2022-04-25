package ru.nshi.learn.lecture9;

/**
 * @author rassafel
 */
public class RowGoal {
    private Object date;
    private String stage;
    private String home;
    private String away;
    private String teamScored;
    private String playerScored;
    private String time;
    private boolean ownGoal;
    private boolean penalty;

    @Override
    public String toString() {
        return "RowGoal{" +
            "date=" + date +
            ", stage='" + stage + '\'' +
            ", home='" + home + '\'' +
            ", away='" + away + '\'' +
            ", teamScored='" + teamScored + '\'' +
            ", playerScored='" + playerScored + '\'' +
            ", time='" + time + '\'' +
            ", ownGoal=" + ownGoal +
            ", penalty=" + penalty +
            '}';
    }

    public Object getDate() {
        return date;
    }

    public void setDate(Object date) {
        this.date = date;
    }

    public String getStage() {
        return stage;
    }

    public void setStage(String stage) {
        this.stage = stage;
    }

    public String getHome() {
        return home;
    }

    public void setHome(String home) {
        this.home = home;
    }

    public String getAway() {
        return away;
    }

    public void setAway(String away) {
        this.away = away;
    }

    public String getTeamScored() {
        return teamScored;
    }

    public void setTeamScored(String teamScored) {
        this.teamScored = teamScored;
    }

    public String getPlayerScored() {
        return playerScored;
    }

    public void setPlayerScored(String playerScored) {
        this.playerScored = playerScored;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public boolean isOwnGoal() {
        return ownGoal;
    }

    public void setOwnGoal(boolean ownGoal) {
        this.ownGoal = ownGoal;
    }

    public boolean isPenalty() {
        return penalty;
    }

    public void setPenalty(boolean penalty) {
        this.penalty = penalty;
    }
}
