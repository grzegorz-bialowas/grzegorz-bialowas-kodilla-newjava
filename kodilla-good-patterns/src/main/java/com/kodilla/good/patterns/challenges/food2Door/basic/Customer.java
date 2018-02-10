package com.kodilla.good.patterns.challenges.food2Door.basic;

public class Customer {
    private String name;
    private String surname;
    private String phoneNumber;
    private String adress;
    public Customer(String name, String surname, String phoneNumber, String adress) {
        this.name = name;
        this.surname = surname;
        this.phoneNumber = phoneNumber;
        this.adress = adress;
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
    public String getAdress() {
        return adress;
    }
    @Override
    public String toString() {
        return name + " " + surname;
    }
}
