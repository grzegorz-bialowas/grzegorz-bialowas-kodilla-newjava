package com.kodilla.good.patterns.challenges.food2Door.interfaces;

import com.kodilla.good.patterns.challenges.food2Door.basic.Order;

public interface OrderRepository {
    boolean createOrder(Order order);
}
