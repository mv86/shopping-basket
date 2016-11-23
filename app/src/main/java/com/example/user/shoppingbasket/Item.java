package com.example.user.shoppingbasket;

/**
 * Created by user on 21/11/2016.
 */

public class Item {

    private String name;
    private double price;
    private int quantity;
    private boolean bogof;

    public Item(String name, double price, int quantity, boolean bogof) {
        this.name =  name;
        this.price = price;
        this.quantity = quantity;
        this.bogof = bogof;
    }

    public String getName() {
        return this.name;
    }

    public double getPrice() {
        return this.price;
    }

    public int getQuantity() {
        return this.quantity;
    }

    public boolean getbogof() {
        return this.bogof;
    }

}
