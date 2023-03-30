package Futbol;

public class Match {
    Team teamA;
    Team teamB;
    Double attack;
    Double defend;
    Double cardio;
    Double goalRate;
    Double winRate;
    Double value;

    public Match(Team teamA, Team teamB) {
        this.teamA = teamA;
        this.teamB = teamB;
    }

    public Team getTeamA() {
        return teamA;
    }

    public void setTeamA(Team teamA) {
        this.teamA = teamA;
    }

    public Team getTeamB() {
        return teamB;
    }

    public void setTeamB(Team teamB) {
        this.teamB = teamB;
    }


    public Double getAttack() {
        return attack;
    }

    public void setAttack(Double attackA, Double attackB) {
        this.attack = restaAbsoluta(attackA,attackB);
    }

    public Double getDefend() {
        return defend;
    }

    public void setDefend(Double defendA, Double defendB) {
        this.defend = restaAbsoluta(defendA,defendB);
    }

    public Double getCardio() {
        return cardio;
    }

    public void setCardio(Double cardioA, Double cardioB) {
        this.cardio = restaAbsoluta(cardioA,cardioB);
    }

    public Double getGoalRate() {
        return goalRate;
    }

    public void setGoalRate(Double goalRateA, Double goalRateB) {
        this.goalRate = restaAbsoluta(goalRateA,goalRateB);
    }

    public Double getWinRate() {
        return winRate;
    }

    public void setWinRate(Double winRateA, Double winRateB) {
        this.winRate = restaAbsoluta(winRateA,winRateB);
    }

    public Double getValue() {
        return value;
    }

    public void setValue(Double valueA, Double valueB) {
        this.value = restaAbsoluta(valueA,valueB);
    }
    private Double restaAbsoluta(Double value1, Double value2){
        return Math.abs(value1 - value2);
    }
}
