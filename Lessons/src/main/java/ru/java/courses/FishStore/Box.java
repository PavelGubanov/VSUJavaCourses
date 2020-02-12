package ru.java.courses.FishStore;

public class Box {
    private int quantity;
    private Fish fish;

    public Box(int quantity, Fish fish){
        this.fish = fish;
        this.quantity = quantity;
    }

    public Box (){
        this.fish = null;
        this.quantity = 0;
    }

    public Fish getFish() {
        return fish;
    }

    public void setFish(Fish fish) {
        this.fish = fish;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
