package com.edu.java.hw2;


public class Pizza {

    public enum PizzaType {
        LARGE, MEDIUM,SMALL
    }

    PizzaType type;
    int unit_price;
    int loyalty_points;

    public Pizza() {
        this.type = PizzaType.MEDIUM;
        this.unit_price = 2;
        this.loyalty_points = 3;
    }

    public Pizza(PizzaType type, int unit_price) {
        this.type = type;
        this.unit_price = unit_price;
    }

    public Pizza(PizzaType type, int unit_price, int loyalty_points) {
        this.type = type;
        this.unit_price = unit_price;
        this.loyalty_points = loyalty_points;
    }

    public int get_price() {
        return this.unit_price;
    }
}
