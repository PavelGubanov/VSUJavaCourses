package ru.java.courses.sports;

public class Athlete {

    private boolean active;

    private String name;

    public Athlete(String name) {
        if (name == null || name.isEmpty()) {
            throw new IllegalArgumentException("У любого спортсмена должно быть имя!");
        }
        this.name = name;
        this.active = true;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public String getName() {
        return name;
    }
}
