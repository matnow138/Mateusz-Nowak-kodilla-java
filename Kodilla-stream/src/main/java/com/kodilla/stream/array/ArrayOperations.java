package com.kodilla.stream.array;

import java.util.Objects;
import java.util.stream.IntStream;

public interface ArrayOperations {
   static double getAverage(int[] numbers) {
       double average = IntStream.range(0, numbers.length)
               .filter(Objects::nonNull)
               .average().getAsDouble();

       return average;
   }
}
