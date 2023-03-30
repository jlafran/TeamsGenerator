package Futbol;

public class Player {
    String nick;
    Double attack;
    Double defence;
    Double cardio;
    Integer goals;
    Integer wins;
    Integer ties;
    Integer lost;

    public Player(String nick, Double attack, Double defence, Double cardio) {
        this.nick = nick;
        this.attack = attack;
        this.defence = defence;
        this.cardio = cardio;
        this.goals = 0;
        this.wins = 0;
        this.lost = 0;
        this.ties = 0;
    }

    public Player(String nick, Double attack, Double defence, Double cardio, Integer goals, Integer wins, Integer ties, Integer lost) {
        this.nick = nick;
        this.attack = attack;
        this.defence = defence;
        this.cardio = cardio;
        this.goals = goals;
        this.wins = wins;
        this.ties = ties;
        this.lost = lost;
    }

    public String getNick() {
        return nick;
    }

    public void setNick(String nick) {
        this.nick = nick;
    }

    public Double getAttack() {
        return attack;
    }

    public void setAttack(Double attack) {
        this.attack = this.attack + attack;
    }

    public Double getDefence() {
        return defence;
    }

    public void setDefence(Double defence) {
        this.defence = this.defence + defence;
    }

    public Double getCardio() {
        return cardio;
    }

    public void setCardio(Double cardio) {
        this.cardio = this.cardio + cardio;
    }

    public Integer getGoals() {
        return goals;
    }

    public void setGoals(Integer goals) {
        this.goals = this.goals + goals;
    }

    public Double getGoalsToGameRatio() {
        if (getGames()!=0){
            return Double.valueOf(getGoals() / getGames());
        }
        else return 0.0;
    }

    public Integer getWins() {
        return wins;
    }

    public void setWins(Integer wins) {
        this.wins = getWins() + wins;
    }

    public Integer getLost() {
        return lost;
    }

    public void setLost(Integer lost) {
        this.lost = getLost() + lost;
    }

    public Integer getTies() {
        return ties;
    }

    public void setTies(Integer ties) {
        this.ties = getTies() + ties;
    }

    public Integer getGames() {
        return getWins() + getLost() + getTies();
    }

    public Double getWinRate() {
        if (getGames()!=0){
            return (getWins() + 0.5 * getTies()) / getGames();
        }
        else return 0.0;
    }

    public Double getValue() {
        return ((0.3 * getWinRate())
                + (0.2 * getGoalsToGameRatio())
                + (0.2 * getAttack())
                + (0.2 * getDefence())
                + (0.3 * getCardio()));
    }
}
