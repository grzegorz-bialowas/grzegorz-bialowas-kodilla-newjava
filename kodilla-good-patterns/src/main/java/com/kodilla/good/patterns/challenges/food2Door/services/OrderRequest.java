package com.kodilla.good.patterns.challenges.food2Door.services;

import com.kodilla.good.patterns.challenges.food2Door.basic.Deliverer;
import com.kodilla.good.patterns.challenges.food2Door.basic.Product;

public class OrderRequest {
    private final Deliverer deliverer;
    private final Product product;
    private final int productQuantity;
    private boolean orderConfrmation;
    public OrderRequest(Deliverer deliverer, Product product, int productQuantity, boolean orderConfrmation) {
        this.deliverer = deliverer;
        this.product = product;
        this.productQuantity = productQuantity;
        this.orderConfrmation = orderConfrmation;
    }
    public Deliverer getDeliverer() {
        return deliverer;
    }
    public Product getProduct() {
        return product;
    }
    public int getProductQuantity() {
        return productQuantity;
    }
    public boolean getOrderConfirmation() {
        return orderConfrmation;
    }
}
