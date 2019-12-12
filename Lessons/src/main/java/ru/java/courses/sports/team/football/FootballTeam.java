package ru.java.courses.sports.team.football;

import ru.java.courses.sports.Coach;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FootballTeam {
    public static final int MAX_COUNT_PLAYERS = 20;

    private String name;

    private Coach coach;

    private List<FootballPlayer> players = new ArrayList<>();

    public FootballTeam(String name){
        if ((name == null) && (name.isEmpty()))
            throw new IllegalArgumentException("У футбольной команды обязательно должно быть название!");

        this.name = name;
    }

    public int getPlayersCount() { return players.size(); }

    public int getMaxPlayersCount(){
        return MAX_COUNT_PLAYERS;
    }

    public int getScore(){
        int allScore = 0;
        for (FootballPlayer player : players){
            allScore += player.getScore();
        }
        return allScore;
    }

    public void addPlayers (FootballPlayer... newPlayers){
        if (players.size() + newPlayers.length > MAX_COUNT_PLAYERS){
            throw new IllegalArgumentException("Превышено максимальное количество игроков в команде!");
        }
        players.addAll(Arrays.asList(newPlayers));
    }

    public void removePlayer (FootballPlayer deletedPlayer){
        players.remove(deletedPlayer);
    }

    public void addPlayer (FootballPlayer newPlayer){
        if (players.size() + 1 > MAX_COUNT_PLAYERS){
            throw new IllegalArgumentException("Превышено максимальное количество игроков в команде!");
        }
        players.add(newPlayer);
    }

    public String getName() {
        return name;
    }

    public void setCoach(Coach coach) {
        this.coach = coach;
    }

    public Coach getCoach() {
        return coach;
    }

    public void setPlayers(List<FootballPlayer> players) {
        this.players = players;
    }

    public List<FootballPlayer> getPlayers() {
        return players;
    }
}
