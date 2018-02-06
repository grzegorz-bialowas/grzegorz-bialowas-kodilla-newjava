package com.kodilla.good.patterns.challenges.Basic;

import java.util.Objects;

public final class Customer {
    private final String name;
    private final String surname;
    private final int customerId;
    private final String email;
    private final String address;
    public Customer(String name, String surname, int customerId, String email, String address) {
        this.name = name;
        this.surname = surname;
        this.customerId = customerId;
        this.email = email;
        this.address = address;
    }
    public String getName() {
        return name;
    }
    public String getSurname() {
        return surname;
    }
    public int getCustomerId() {
        return customerId;
    }
    public String getEmail() {
        return email;
    }
    public String getAddress() {
        return address;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Customer)) return false;
        Customer customer = (Customer) o;
        return getCustomerId() == customer.getCustomerId() &&
                Objects.equals(getName(), customer.getName()) &&
                Objects.equals(getSurname(), customer.getSurname()) &&
                Objects.equals(getEmail(), customer.getEmail()) &&
                Objects.equals(getAddress(), customer.getAddress());
    }
    @Override
    public int hashCode() {
        return Objects.hash(getName(), getSurname(), getCustomerId(), getEmail(), getAddress());
    }
    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", customerId=" + customerId +
                ", email='" + email + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
