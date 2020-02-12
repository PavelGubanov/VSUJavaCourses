package ru.java.courses.FishStore;

import java.util.Date;

public class Trout extends Fish {
    private static Date LIFE;
    public static final int DISCOUNT = 20;
    public static final String NAME = "Trout";
    public static final int PRICE = 170;
    public static final int SHELF_LIFE = 10;

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

    public Trout(Date today){
        LIFE = today;
//      date =
    }
}
