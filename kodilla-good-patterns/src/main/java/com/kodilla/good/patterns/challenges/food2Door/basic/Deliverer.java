package com.kodilla.good.patterns.challenges.food2Door.basic;

public class Deliverer {
    private String name;
    private String adress;
    private String phoneNumber;
    private String email;
    public Deliverer(String name, String adress, String phoneNumber, String email) {
        this.name = name;
        this.adress = adress;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }
    public String getName() {
        return name;
    }
    public String getAdress() {
        return adress;
    }
    public String getPhoneNumber() {
        return phoneNumber;
    }
    public String getEmail() {
        return email;
    }

}
