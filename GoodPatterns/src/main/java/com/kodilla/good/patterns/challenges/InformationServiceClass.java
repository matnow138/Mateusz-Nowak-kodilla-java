package com.kodilla.good.patterns.challenges;
//todo nazwij to konkretnie, czyli np EmailInformationService
public class InformationServiceClass implements InformationService{

    public void inform(User user){
        System.out.println("Sending mail to:" + user.getEmail());
    }
}
