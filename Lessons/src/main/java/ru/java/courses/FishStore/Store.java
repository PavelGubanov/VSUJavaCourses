package ru.java.courses.FishStore;

public class Store {
    private Box[] boxes = new Box[100];
    private int allMoney;
    private int count;

    private Box sell (int money){
        if (money >= boxes[count].getFish().getPrice()) {
            Box box = boxes[count - 1];
            boxes[count - 1] = null;
            count--;
            money -= box.getFish().getPrice();
            return box;
        }
        else{
            throw new IllegalArgumentException("Недостаточно денег у покупателя для покупки рыбы!");
        }
    }

    private void buy (Box[] boxes, int count){
        while ((boxes[count - 1] != null) && ((boxes[count - 1].getFish().getPrice() * boxes[count - 1].getQuantity() <= allMoney))){
            this.count++;
            this.boxes[this.count - 1] = boxes[count - 1];
            boxes[count - 1] = null;
            allMoney -= boxes[count - 1].getFish().getPrice() * boxes[count - 1].getQuantity();
            count--;
        }
    }
}
