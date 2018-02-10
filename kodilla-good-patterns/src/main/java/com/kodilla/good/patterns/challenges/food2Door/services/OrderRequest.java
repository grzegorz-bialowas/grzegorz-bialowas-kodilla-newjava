package com.kodilla.good.patterns.challenges.food2Door.services;

import com.kodilla.good.patterns.challenges.food2Door.basic.Customer;
import com.kodilla.good.patterns.challenges.food2Door.basic.Product;

public class OrderRequest {
    private final Customer customer;
    private final Product product;
    private final int productQuantity;
    private boolean orderConfrmation;
    public OrderRequest(Customer customer, Product product, int productQuantity, boolean orderConfrmation) {
        this.customer = customer;
        this.product = product;
        this.productQuantity = productQuantity;
        this.orderConfrmation = orderConfrmation;
    }
    public Customer getCustomer() {
        return customer;
    }
    public Product getProduct() {
        return product;
    }
    public int getProductQuantity() {
        return productQuantity;
    }
    public boolean isOrderConfrmation() {
        return orderConfrmation;
    }
}
