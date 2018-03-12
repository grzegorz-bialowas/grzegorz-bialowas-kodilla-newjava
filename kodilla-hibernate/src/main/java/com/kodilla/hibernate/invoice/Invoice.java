package com.kodilla.hibernate.invoice;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.List;
@Entity
@Table (name = "INVOICE")
public class Invoice {
    private int id;
    private String number;
    private List<Item> items;
    public Invoice() {
    }
    public Invoice(String number) {
        this.number = number;
    }
    @Id
    @NotNull
    @GeneratedValue
    @Column(name = "INVOICE_ID")
    public int getId() {
        return id;
    }
    @NotNull
    @Column(name = "NUMBER")
    public String getNumber() {
        return number;
    }
    @OneToMany (
            targetEntity = Item.class,
            mappedBy = "items",
            cascade = CascadeType.ALL,
            fetch = FetchType.LAZY
    )
    public List<Item> getItems(Item item) {
        return items;
    }
    public void setId(int id) {
        this.id = id;
    }
    public void setNumber(String number) {
        this.number = number;
    }
    public void setItems(List<Item> items) {
        this.items = items;
    }
}
