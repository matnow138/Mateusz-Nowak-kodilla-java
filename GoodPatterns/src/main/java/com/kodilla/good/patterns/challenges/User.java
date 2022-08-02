package com.kodilla.good.patterns.challenges;

public class User {
    private final String name;
    private final String surname;
    private final String address;
    private final String email;
    private final String phoneNumber;

    public User(String name, String surname, String address, String email, String phoneNumber) {
        this.name = name;
        this.surname = surname;
        this.address = address;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getAddress() {
        return address;
    }

    public String getEmail() {
        return email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }
}
