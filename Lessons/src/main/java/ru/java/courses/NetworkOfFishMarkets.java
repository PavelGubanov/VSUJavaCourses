package ru.java.courses;

public class NetworkOfFishMarkets
{
    private FishMarket[] network = new FishMarket[20];
    private int allMoney;

    public FishMarket[] getNetwork() {
        return network;
    }

    public void setNetwork(FishMarket[] network) {
        this.network = network;
    }

    public int getAllMoney() {
        return allMoney;
    }
}
