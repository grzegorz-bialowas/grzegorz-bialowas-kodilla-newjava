package com.kodilla.good.patterns.challenges.food2Door.interfaces;

import com.kodilla.good.patterns.challenges.food2Door.basic.Deliverer;
import com.kodilla.good.patterns.challenges.food2Door.basic.Order;

public interface OrderService {
    boolean process(Order order);
    void addDeliverer (Deliverer deliverer);
}
