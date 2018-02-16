package com.kodilla.good.patterns.challenges.food2Door.services;

import com.kodilla.good.patterns.challenges.food2Door.basic.Deliverer;
import com.kodilla.good.patterns.challenges.food2Door.basic.Order;

public class OrderRequestRetriver {
    public OrderRequest retrvie() {
        Deliverer deliverer = new Deliverer("kkk");
        Order order = new Order("xxx", 4, deliverer);
        return new OrderRequest(order, deliverer);
    }
}
