package Futbol;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Team {
    Set<Player> players;
    Double attack;
    Double defend;
    Double cardio;
    Double winRate;
    Double goalsRatio;
    Double value;

    public Team() {
        players = new HashSet<Player>();
        this.attack = 0.0;
        this.defend = 0.0;
        this.cardio = 0.0;
        this.winRate = 0.0;
        this.goalsRatio = 0.0;
        this.value = 0.0;
    }

    public Team(Set<Player> players, Double attack, Double defend, Double cardio, Double winRate, Double goalsRatio, Double value) {
        this.players = players;
        this.attack = 0.0;
        this.defend = 0.0;
        this.cardio = 0.0;
        this.winRate = 0.0;
        this.goalsRatio = 0.0;
        this.value = 0.0;
    }

    public Set<Player> getPlayers() {
        return players;
    }

    public void setPlayers(Player player) {
        this.players.add(player);
    }

    public Double getAttack() {
        return attack;
    }

    public void setAttack(Double attack) {
        this.attack = this.attack + attack;
    }

    public Double getDefend() {
        return defend;
    }

    public void setDefend(Double defend) {
        this.defend = this.defend + defend;
    }

    public Double getCardio() {
        return cardio;
    }

    public void setCardio(Double cardio) {
        this.cardio = this.cardio + cardio;
    }

    public Double getWinRate() {
        return winRate;
    }

    public void setWinRate(Double winRate) {
        this.winRate = this.winRate + winRate;
    }

    public Double getGoalsRatio() {
        return goalsRatio;
    }

    public void setGoalsRatio(Double goalsRatio) {
        this.goalsRatio = this.goalsRatio + goalsRatio;
    }

    public Double getValue() {
        return value;
    }

    public void setValue(Double value) {
        this.value = this.value + value;
    }
}
