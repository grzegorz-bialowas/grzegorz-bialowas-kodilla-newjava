package com.kodilla.good.patterns.challenges.food2Door.services;

import com.kodilla.good.patterns.challenges.food2Door.basic.Customer;
import com.kodilla.good.patterns.challenges.food2Door.basic.Product;

public class OrderRequest {
  //  private final Deliverer deliverer;
    private final Customer customer;
    private final Product product;
    private final int productQuantity;
    private boolean orderConfirmation;
    public OrderRequest(Customer customer, Product product, int productQuantity, boolean orderConfirmation) {
  //      this.deliverer = deliverer;
        this.customer = customer;
        this.product = product;
        this.productQuantity = productQuantity;
        this.orderConfirmation = orderConfirmation;
    }
   // public Deliverer getDeliverer() {
    //    return deliverer;
  //  }
    public Customer getCustomer() {
        return customer;
    }
    public Product getProduct() {
        return product;
    }
    public int getProductQuantity() {
        return productQuantity;
    }
    public boolean getOrderConfirmation() {
        return orderConfirmation;
    }
}
