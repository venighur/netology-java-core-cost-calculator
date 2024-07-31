package ru.netology;

public class Service {
    public static final int WEIGHT_TAX = 100;
    public static final int PRICE_TAX = 100;

    public static int calculateCustoms(int price, int weight) {
        int customs = price / PRICE_TAX + weight * WEIGHT_TAX;
        return customs;
    }
}
