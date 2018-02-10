package com.kodilla.good.patterns.challenges.food2Door.basic;

public class Customer {
    private String name;
    private String surname;
    private String phoneNumber;
    private String address;
    public Customer(String name, String surname, String phoneNumber, String address) {
        this.name = name;
        this.surname = surname;
        this.phoneNumber = phoneNumber;
        this.address = address;
    }
    public String getName() {
        return name;
    }
    public String getSurname() {
        return surname;
    }
    public String getPhoneNumber() {
        return phoneNumber;
    }
    public String getAddress() {
        return address;
    }
    @Override
    public String toString() {
        return name + " " + surname;
    }
}
