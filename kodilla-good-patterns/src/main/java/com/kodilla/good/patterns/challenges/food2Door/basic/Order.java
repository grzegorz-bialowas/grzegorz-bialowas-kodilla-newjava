package com.kodilla.good.patterns.challenges.food2Door.basic;

public class Order {
    private String productName;
    private int quantity;
    private Deliverer deliverer;

    public Order(String productName, int quantity, Deliverer deliverer) {
        this.productName = productName;
        this.quantity = quantity;
        this.deliverer = deliverer;
    }

    public String getProductName() {
        return productName;
    }

    public int getQuantity() {
        return quantity;
    }

    public Deliverer getDeliverer() {
        return deliverer;
    }
}
