package com.kodilla.patterns.prototype;

import com.kodilla.patterns.prototype.library.Book;
import com.kodilla.patterns.prototype.library.Library;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LibraryTestSuite {

    @Test
    void testGetBooks(){
        //Given
        Library library = new Library("Library 1");
        library.getBooks().add(new Book("Shining", "S.King", LocalDate.of(1985,5,6)));
        library.getBooks().add(new Book("Firestarer", "S.King", LocalDate.of(1990,8,9)));
        library.getBooks().add(new Book("1984", "Orwell", LocalDate.of(1984,1,1)));
        library.getBooks().add(new Book("Achaja", "Ziemiański", LocalDate.of(1998,3,1)));
        library.getBooks().add(new Book("Hobbit", "Tolkien", LocalDate.of(1972,5,25)));

        Library shallowCopy = null;
        try{
            shallowCopy= library.shallowCopy();
            shallowCopy.setName("Library 2");
        }catch(CloneNotSupportedException e){
            System.out.println(e);
        }

        Library deepCopy = null;
        try{
            deepCopy = library.deepCopy();
            deepCopy.setName("Library 3");
        }catch (CloneNotSupportedException e){
            System.out.println(e);
        }

        library.getBooks().clear();
        System.out.println(library);
        System.out.println(shallowCopy);
        System.out.println(deepCopy);


        //When
        //Then
        assertEquals(0,library.getBooks().size());
        assertEquals(0,shallowCopy.getBooks().size());
        assertEquals(5,deepCopy.getBooks().size());

    }
}
