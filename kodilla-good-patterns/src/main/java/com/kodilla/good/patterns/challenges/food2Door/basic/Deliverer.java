package com.kodilla.good.patterns.challenges.food2Door.basic;

public class Deliverer {
    private String name;
    private String address;
    private String phoneNumber;
    private String email;
    public Deliverer(String name, String address, String phoneNumber, String email) {
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
    public String getPhoneNumber() {
        return phoneNumber;
    }
    public String getEmail() {
        return email;
    }

}
