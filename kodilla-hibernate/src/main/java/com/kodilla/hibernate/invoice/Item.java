package com.kodilla.hibernate.invoice;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;
@Entity
@Table(name = "ITEM")
public class Item {
    private int id;
    private Product product;
    private BigDecimal price;
    private int quantity;
    private BigDecimal value;
    private Invoice invoice;
    public Item() {
    }
    public Item(Product product, BigDecimal price, int quantity, BigDecimal value) {
        this.price = price;
        this.quantity = quantity;
        this.product = product;
        this.value = value;
    }
    @Id
    @GeneratedValue
    @NotNull
    @Column(name = "ITEM_ID", unique = true)
    public int getId() {
        return id;
    }
    @ManyToOne(
            cascade = CascadeType.ALL,
            fetch = FetchType.EAGER
    )
    @JoinColumn(name = "PRODUCT_ID")
    public Product getProduct() {
        return this.product;
    }
    @NotNull
    @Column(name = "PRICE")
    public BigDecimal getPrice() {
        return price;
    }
    @NotNull
    @Column(name = "QUANTITY")
    public int getQuantity() {
        return quantity;
    }
    @NotNull
    @Column(name = "VALUE")
    public BigDecimal getValue() {
        return value;
    }
    @ManyToOne
    @JoinColumn(name = "INVOICE_ID")
    public Invoice getInvoice() {
        return invoice;
    }
    public void setInvoice(Invoice invoice) {
        this.invoice = invoice;
    }
    public void setId(int id) {
        this.id = id;
    }
    public void setProduct(Product product) {
        this.product = product;
    }
    public void setPrice(BigDecimal price) {
        this.price = price;
    }
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    public void setValue(BigDecimal value) {
        this.value = value;
    }
}
