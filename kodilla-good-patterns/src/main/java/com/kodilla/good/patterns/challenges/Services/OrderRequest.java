package com.kodilla.good.patterns.challenges.Services;

import com.kodilla.good.patterns.challenges.Basic.Customer;
import com.kodilla.good.patterns.challenges.Basic.Product;

import java.time.LocalDate;
import java.time.LocalDateTime;

public final class OrderRequest {
    private final Customer customer;
    private final Product product;
    private final LocalDateTime dateOfOrder;
    private final LocalDate dateOfDelivery;
    public OrderRequest(final Customer customer, final Product product, final LocalDateTime dateOfOrder, final LocalDate dateOfDelivery) {
        this.customer = customer;
        this.product = product;
        this.dateOfOrder = dateOfOrder;
        this.dateOfDelivery = dateOfDelivery;
    }
    public Customer getCustomer() {
        return customer;
    }
    public Product getProduct() {
        return product;
    }
    public LocalDateTime getDateOfOrder() {
        return dateOfOrder;
    }
    public LocalDate getDateOfDelivery() {
        return dateOfDelivery;
    }
    @Override
    public String toString() {
        return "OrderRequest{" +
                "customer=" + customer +
                ", product=" + product +
                ", dateOfOrder=" + dateOfOrder +
                ", dateOfDelivery=" + dateOfDelivery +
                '}';
    }
}
