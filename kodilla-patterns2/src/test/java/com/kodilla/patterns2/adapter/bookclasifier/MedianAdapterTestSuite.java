package com.kodilla.patterns2.adapter.bookclasifier;

import com.kodilla.patterns2.adapter.bookclasifier.librarya.Book;
import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MedianAdapterTestSuite {

    @Test
    public void publicationYearMedianTest(){
        //Given
        Set<Book> bookSet = new HashSet<>();
        bookSet.add(new Book("S.King", "Shining", 1990, "12345"));
        bookSet.add(new Book("S.King", "Firestarer", 1980, "45678"));
        bookSet.add(new Book("S.King", "IT", 2000, "98742"));
        //When
        MedianAdapter medianAdapter = new MedianAdapter();


        //Then
        assertEquals(1990, medianAdapter.publicationYearMedian(bookSet));
    }
}
