package com.kodilla.good.patterns.challenges.food2Door.services;

import com.kodilla.good.patterns.challenges.food2Door.basic.Deliverer;
import com.kodilla.good.patterns.challenges.food2Door.basic.Order;

public class OrderRequest {
    private Order order;
    private Deliverer deliverer;
    public OrderRequest(Order order, Deliverer deliverer) {
        this.order = order;
        this.deliverer = deliverer;
    }
    public Order getOrder() {
        return order;
    }
    public Deliverer getDeliverer() {
        return deliverer;
    }
}
