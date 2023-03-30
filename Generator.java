package Futbol;

import java.util.*;

public class Generator {

    public static void printMatches(List<Match> matches){
        for (int i=0; i < matches.size()/2; i++){
            Team teamA = matches.get(i).getTeamA();
            Team teamB = matches.get(i).getTeamB();
            Set<Player> playersA = teamA.getPlayers();
            Set<Player> playersB = teamB.getPlayers();
            System.out.println("Team A: ");
            printPlayers(new ArrayList<>(playersA));
            System.out.print(teamA.getCardio());
            System.out.println(" ");
            System.out.println("Team B: ");
            printPlayers(new ArrayList<>(playersB));
            System.out.print(teamB.getCardio());
            System.out.println(" ");
            System.out.println("Balance: " + matches.get(i).getValue());
            System.out.println("Balance Attack: " + matches.get(i).getAttack());
            System.out.println("Balance Defence: " + matches.get(i).getDefend());
            System.out.println("Balance Cardio: " + matches.get(i).getCardio());
            System.out.println("Balance WinRate: " + matches.get(i).getWinRate());
            System.out.println("Balance GoalRate: " + matches.get(i).getGoalRate());
            System.out.println("----------------------------------------------");
            System.out.println(" ");
        }
    }

    private static void printPlayers(List<Player> players) {
        for (int j = 0; j < players.size(); j++) {
            System.out.print(players.get(j).getNick() + ", ");
        }
        System.out.println(" ");
    }

    public static List<Match> AllPossibleMatches(List<Player> players){
        Integer teamSize = players.size() / 2;
        List<Match> matches = new ArrayList<>();
        for (int mask = 0; mask < (1 << players.size()); mask++) {
            if (Integer.bitCount(mask) != teamSize) {
                continue;
            }
            Team team1 = new Team();
            Team team2 = new Team();

            // Divide players into two teams
            for (int i = 0; i < players.size(); i++) {
                if ((mask & (1 << i)) != 0) {
                    settersRandomTeam(players, team1, i);
                } else {
                    settersRandomTeam(players, team2, i);
                }
            }
            Match match = new Match(team1, team2);
            match.setAttack(team1.getAttack(), team2.getAttack());
            match.setDefend(team1.getDefend(), team2.getDefend());
            match.setCardio(team1.getCardio(), team2.getCardio());
            match.setWinRate(team1.getWinRate(), team2.getWinRate());
            match.setGoalRate(team1.getGoalsRatio(), team2.getGoalsRatio());
            match.setValue(team1.getValue(), team2.getValue());
            // Create a match and add it to the list of matches

            if (match.getValue() <= 0.1
                    //&& match.getAttack() <=2
                    //&& match.getDefend() <= 2
                    //&& match.getCardio() <= 2
                    //&& match.getGoalRate() <= 1
                    //&& match.getWinRate() <= 1
            )
            {
                matches.add(match);
            }

        }

        return (matches);
    }

    private static void settersRandomTeam(List<Player> players, Team team1, int i) {
        team1.setAttack(players.get(i).getAttack());
        team1.setDefend(players.get(i).getDefence());
        team1.setCardio(players.get(i).getCardio());
        team1.setGoalsRatio(players.get(i).getGoalsToGameRatio());
        team1.setWinRate(players.get(i).getWinRate());
        team1.setValue(players.get(i).getValue());
        team1.setPlayers(players.get(i));
    }


    public static void main(String[] args) {
        Player juan = new Player("Juano",5.5,6.0,6.0,3,0,0,2);
        Player fede = new Player("Fede", 6.5,6.0,5.5,4,0,0,2);
        Player inda = new Player("Inda", 6.5,5.0,5.0,1,1,0,1);
        Player brian = new Player("Brian", 3.0,5.0,5.0,0,1,0,1);
        Player maleh = new Player("Maleh", 5.0,7.0,5.0, 1, 0,0,1);
        Player lucas = new Player("Luqui", 9.0,10.0,10.0, 3, 1, 0,0);
        Player fedeG = new Player("DF", 6.0,5.5,7.0,4,2,0,0);
        Player mau = new Player("Mau", 4.0,5.5,2.0,1,1,0,1);
        Player fran = new Player("Fran", 7.0,4.5,2.0,2,1,0,1);
        Player rei = new Player("Rei", 7.5,5.5,5.5,4,2,0,1);
        Player menghi = new Player("Menghi", 7.0,4.5,4.0,2,1,0,0);
        Player juanma = new Player("Juanma", 5.0,8.0,7.5,2,0,0,1);
        Player tomer = new Player("Tomer", 4.5,6.5,5.0,1,1,0,0);
        Player lara = new Player("Lara", 5.0,4.5,6.5,0,0,0,1);
        Player gabi = new Player("Beto", 3.0,5.5,4.5,0,0,0, 0);

        List<Player> players = new ArrayList<Player>();

        players.add(juan);
        players.add(fede);
        players.add(brian);
        players.add(menghi);
        players.add(lara);
        players.add(fran);
        players.add(rei);
        players.add(tomer);
        players.add(mau);
        players.add(inda);
        List<Match> matches = AllPossibleMatches(players);
        printMatches(matches);

    }
}
