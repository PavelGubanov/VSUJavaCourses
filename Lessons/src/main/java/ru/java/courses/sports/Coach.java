package ru.java.courses.sports;

public class Coach {
    private int experience;

    private String name;

    public Coach (String name){
        if ((name == null) || (name.isEmpty())){
            throw new IllegalArgumentException("Имя тренера не может быть пустым!");
        }
        this.name = name;
    }

    public Coach(String name, int experience){
        this(name);
        if ((experience < 0) || (experience > 80)) {
            throw new IllegalArgumentException("Опыт тренера не может быть отрицательным и слишком большим!");
        }
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public String getName() {
        return name;
    }

}
