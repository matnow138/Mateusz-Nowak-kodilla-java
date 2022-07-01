package com.kodilla.good.patterns.challenges;

public class InformationServiceClass implements InformationService{

    public void inform(User user){
        System.out.println("Sending mail to:" + user.getEmail());
    }
}
