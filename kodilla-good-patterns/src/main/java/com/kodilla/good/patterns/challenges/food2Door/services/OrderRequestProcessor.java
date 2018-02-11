package com.kodilla.good.patterns.challenges.food2Door.services;

import com.kodilla.good.patterns.challenges.food2Door.basic.Deliverer;
import com.kodilla.good.patterns.challenges.food2Door.interfaces.DelivererProcessor;

public class OrderRequestProcessor {
    private DelivererProcessor delivererProcessor;
    private Deliverer deliverer;

    public OrderRequestProcessor(DelivererProcessor delivererProcessor, Deliverer deliverer) {
        this.delivererProcessor = delivererProcessor;
        this.deliverer = deliverer;
    }
    public void order(OrderRequest orderRequest){
        if (orderRequest.getOrderConfirmation() == true) {
            delivererProcessor.process(deliverer);
            System.out.println("Your order has been accepted.");
        } else {
            System.out.println("Confirm your order, please.");
        }
    }
}
