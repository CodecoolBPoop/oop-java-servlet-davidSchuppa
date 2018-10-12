package com.codecool.servlet;


/*
 a simple Java class with id (generated integer), name (string) and price (float or double) properties.
 */

public class Item {
    private static int instanceCounter = 0;
    private int id;
    private String name;
    private double price;

    public Item(String name, double price) {
        this.id = instanceCounter++;
        this.name = name;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
}
