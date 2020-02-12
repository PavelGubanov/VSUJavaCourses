package ru.java.courses.FishStore;

import ru.java.courses.FishStore.Fish;

import java.util.Calendar;
import java.util.Date;

public class Salmon extends Fish {
    private static Date LIFE;
    public static final int DISCOUNT = 15;
    public static final String NAME = "Salmon";
    public static final int PRICE = 220;
    public static final int SHELF_LIFE = 16;


    @Override
    public String getName(){
        return NAME;
    }

    @Override
    public int getShelfLife() {
        return SHELF_LIFE;
    }

    @Override
    public boolean isFresh() {
        return Calendar.getInstance().before(LIFE);
    }

    @Override
    public int getPrice() {
        return PRICE;
    }

    public Salmon(Date today){
        LIFE = today;
//      date =
    }


}

