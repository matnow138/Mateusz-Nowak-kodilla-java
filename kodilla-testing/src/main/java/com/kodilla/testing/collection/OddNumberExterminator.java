package com.kodilla.testing.collection;
import java.util.*;
public class OddNumberExterminator {

    public List<Integer> exterminate(List<Integer> numbers){
        List<Integer> evenNumbers = new ArrayList<>();
        for(Integer temp:numbers){
         if (temp % 2==0){
             evenNumbers.add(temp);
         }
        }
        return evenNumbers;
    }
}
