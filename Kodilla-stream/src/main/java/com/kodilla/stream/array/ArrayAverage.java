package com.kodilla.stream.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.stream.IntStream;

public final class ArrayAverage implements ArrayOperations {
    public void printList(int[] numbers){

        IntStream.range(0,numbers.length)
                .forEach(System.out::println);
    }
  /*  public double getAverage(int[] numbers){
        double average = IntStream.range(0, numbers.length)
                .filter(Objects::nonNull)
                .average().getAsDouble();

        return average;
    }*/
}
