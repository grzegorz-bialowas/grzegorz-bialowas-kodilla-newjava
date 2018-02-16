package com.kodilla.good.patterns.challenges.food2Door.services;

import com.kodilla.good.patterns.challenges.food2Door.basic.Deliverer;
import com.kodilla.good.patterns.challenges.food2Door.basic.Order;
import com.kodilla.good.patterns.challenges.food2Door.interfaces.OrderService;

import java.util.ArrayList;
import java.util.List;

public class OrderServiceImpl implements OrderService {
    private List<Deliverer> delivererList = new ArrayList<>();
    @Override
    public boolean process(Order order) {
        for (Deliverer deliverer : delivererList){
            if (deliverer.getName().equals(order.getDeliverer().getName())){
                deliverer.process(order);
            }
        }
        return false;
    }
    @Override
    public void addDeliverer(Deliverer deliverer) {
        delivererList.add(deliverer);
    }
}
