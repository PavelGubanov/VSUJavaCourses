package ru.java.courses.sports.team.football;

import ru.java.courses.sports.Athlete;
import ru.java.courses.sports.ScoringPlayer;

public class FootballPlayer extends Athlete implements ScoringPlayer {

    private int goals;
    private PlayerRole role;

    public FootballPlayer (String name, PlayerRole role){
        super(name);
        if (role == null) {
            throw new IllegalArgumentException("Роль футболиста в команде не задана!");
        }
        this.role = role;
    }

    public int getGoals() {
        return goals;
    }

    public PlayerRole getRole() {
        return role;
    }

    public void setRole(PlayerRole role) {
        if (role == null) {
            throw new IllegalArgumentException("Роль футболиста в команде не задана!");
        }
        this.role = role;
    }

    @Override
    public void score() {
        if (isActive())
            goals++;
        else
            throw new IllegalArgumentException("Запасные игроки не могут забивать голы!");
    }

    @Override
    public int getScore() {
        return goals;
    }
}
