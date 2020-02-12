package ru.java.courses.FishStore;

import java.util.Date;

public class Carp extends Fish {
    private static Date LIFE;
    public static final int DISCOUNT = 20;
    public static final String NAME = "Carp";
    public static final int PRICE = 150;
    public static final int SHELF_LIFE = 8;

    @Override
    public String getName() {
        return null;
    }

    @Override
    public int getPrice() {
        return 0;
    }

    @Override
    public int getShelfLife() {
        return 0;
    }

    @Override
    public boolean isFresh() {
        return false;
    }

    public Carp (Date today){
        LIFE = today;
//      date =
    }
}
