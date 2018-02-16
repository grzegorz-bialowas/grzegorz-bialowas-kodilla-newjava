package com.kodilla.good.patterns.challenges.food2Door.basic;

public class OrderDto {
    private Deliverer deliverer;
    private boolean isOrdered;
    public OrderDto(Deliverer deliverer, boolean isOrdered) {
        this.deliverer = deliverer;
        this.isOrdered = isOrdered;
    }
    public Deliverer getDeliverer() {
        return deliverer;
    }
    public boolean isOrdered() {
        return isOrdered;
    }
}
