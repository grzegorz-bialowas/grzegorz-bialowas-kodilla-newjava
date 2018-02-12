package com.kodilla.good.patterns.challenges.food2Door.basic;

import java.util.Objects;

public class Deliverer {
    private String name;
    private String address;
    private int phoneNumber;
    private String email;
    public Deliverer(String name, String address, int phoneNumber, String email) {
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }
    public String getName() {
        return name;
    }
    public String getAddress() {
        return address;
    }
    public int getPhoneNumber() {
        return phoneNumber;
    }
    public String getEmail() {
        return email;
    }
    @Override
    public String toString() {
        return "Deliverer{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", phoneNumber=" + phoneNumber +
                ", email='" + email + '\'' +
                '}';
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Deliverer)) return false;
        Deliverer deliverer = (Deliverer) o;
        return getPhoneNumber() == deliverer.getPhoneNumber() &&
                Objects.equals(getName(), deliverer.getName()) &&
                Objects.equals(getAddress(), deliverer.getAddress()) &&
                Objects.equals(getEmail(), deliverer.getEmail());
    }
    @Override
    public int hashCode() {

        return Objects.hash(getName(), getAddress(), getPhoneNumber(), getEmail());
    }
}
