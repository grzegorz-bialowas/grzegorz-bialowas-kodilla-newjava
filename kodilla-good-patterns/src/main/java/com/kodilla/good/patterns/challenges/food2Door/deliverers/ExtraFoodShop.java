package com.kodilla.good.patterns.challenges.food2Door.deliverers;

import com.kodilla.good.patterns.challenges.food2Door.basic.Deliverer;
import com.kodilla.good.patterns.challenges.food2Door.basic.Product;
import com.kodilla.good.patterns.challenges.food2Door.services.DelivererProcessor;

import java.util.List;

public class ExtraFoodShop implements DelivererProcessor {
    private final Deliverer deliverer;
    private final List<Product> productList;
    @Override
    public void process(Deliverer deliverer) {
    }
}
