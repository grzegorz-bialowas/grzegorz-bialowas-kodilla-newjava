package com.kodilla.good.patterns.challenges.food2Door.services;

import com.kodilla.good.patterns.challenges.food2Door.basic.Deliverer;

public class OrderRequestProcessor {
    private DelivererProcessor delivererProcessor;
    private Deliverer deliverer;

    public OrderRequestProcessor(DelivererProcessor delivererProcessor, Deliverer deliverer) {
        this.delivererProcessor = delivererProcessor;
        this.deliverer = deliverer;
    }
    public void order(OrderRequest orderRequest){
        if (orderRequest.isOrderConfrmation()) {
            delivererProcessor.process(deliverer);
        }
    }
}
