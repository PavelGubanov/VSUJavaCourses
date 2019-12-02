package ru.java.courses;

import java.util.Date;

public class FishMarket {
    abstract class Fish{
        abstract Date getShelfDate(Date today);
        abstract double getPrice();
    }
    public class Salmon extends Fish {
        public static  final int DAYS_COUNT = 3;
        public static final int DISCOUNT = 15;

        @Override
        Date getShelfDate(Date today) {
            //вычисление реального срока годности лосось
            return today;
        }

        @Override
        double getPrice() {
            return 50;
        }
        public Salmon(Date today){
            getShelfDate(today);
        }
    }
    public class Trout extends Fish {
        public static  final int DAYS_COUNT = 5;
        public static final int DISCOUNT = 20;

        @Override
        Date getShelfDate(Date today) {
            //вычисление реального срока годности форели
            return today;
        }

        @Override
        double getPrice() {
            return 35;
        }

        public Trout(Date today){
            getShelfDate(today);
        }
    }
    public class Carp extends Fish {
        public static  final int DAYS_COUNT = 2;
        public static final int DISCOUNT = 10;

        @Override
        Date getShelfDate(Date today) {
            //вычисление реального срока годности карпа
            return today;
        }

        @Override
        double getPrice() {
            return 20;
        }
        public Carp(Date today){
            getShelfDate(today);
        }
    }
    public class Box{
        private int count;
        private  Fish fish;

        public int getCount() {
            return count;
        }

        public void setCount(int count) {
            this.count = count;
        }

        public Fish getFish() {
            return fish;
        }

        public void setFish(Fish fish) {
            this.fish = fish;
        }
        public Box(int count, Fish fish){
            this.count = count;
            this.fish = fish;
        }
    }
    private Box[] shelf = new Box[100];
    private int money;

    public Box sell (int money, boolean discount){
        if (discount) {
            //
        }
        else{
            //
        }
        return null;
    }
    public int buy (Box[] shelf){
        return 0;
    }
}
