package com.kodilla.good.patterns.challenges.food2Door.basic;

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

}
