package com.kodilla.good.patterns.challenges.food2Door.services;

import com.kodilla.good.patterns.challenges.food2Door.basic.Customer;
import com.kodilla.good.patterns.challenges.food2Door.basic.Deliverer;
import com.kodilla.good.patterns.challenges.food2Door.basic.Product;

import java.util.List;

public class OrderRequest {
    private final Deliverer deliverer;
    private final Customer customer;
    private final List<Product> product;
    private final int productQuantity;
    private boolean orderConfirmation;
    public OrderRequest(Deliverer deliverer, Customer customer, List<Product> product, int productQuantity, boolean orderConfirmation) {
        this.customer = customer;
        this.product = product;
        this.productQuantity = productQuantity;
        this.orderConfirmation = orderConfirmation;
        this.deliverer = deliverer;
    }
    public Deliverer getDeliverer() {
        return deliverer;
    }
    public Customer getCustomer() {
        return customer;
    }
    public List<Product> getProduct() {
        return product;
    }
    public int getProductQuantity() {
        return productQuantity;
    }
    public boolean isOrderConfirmation() {
        return orderConfirmation;
    }
}
