package com.kodilla.testing.library;
import org.junit.jupiter.api.*;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.*;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
class BookDirectoryTestSuite {
    @BeforeAll
    public static void beforeAll(){
        System.out.println("Test start");
    }
    @AfterAll
    public static void afterAll(){
        System.out.println("End of tests");
    }
    @Mock
    private LibraryDatabase libraryDatabaseMock;
    private List<Book> generateListOfNBooks(int booksQuantity) {
        List<Book> resultList = new ArrayList<>();
        for (int n = 1; n <= booksQuantity; n++) {
            Book theBook = new Book("Title " + n, "Author " + n, 1970 + n);
            resultList.add(theBook);
        }
        return resultList;
    }
    @DisplayName("Test for list of books with condition")
    @Test
    void testListBooksWithConditionsReturnList() {
        //Given
        BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);
        List<Book> resultListOfBooks = new ArrayList<>();
        Book book1 = new Book("Secrets of Alamo", "John Smith", 2008);                   // [5]
        Book book2 = new Book("Secretaries and Directors", "Dilbert Michigan", 2012);    // [6]
        Book book3 = new Book("Secret life of programmers", "Steve Wolkowitz", 2016);    // [7]
        Book book4 = new Book("Secrets of Java", "Ian Tenewitch", 2010);                 // [8]
        resultListOfBooks.add(book1);                                                    // [9]
        resultListOfBooks.add(book2);                                                    // [10]
        resultListOfBooks.add(book3);                                                    // [11]
        resultListOfBooks.add(book4);
        when(libraryDatabaseMock.listBooksWithCondition("Secret")).thenReturn(resultListOfBooks);

        //When
        List<Book> theListOfbooks = bookLibrary.listBooksWithCondition("Secret");

        //Then
        assertEquals(4, theListOfbooks.size());
    }
    @DisplayName("Test for list of books longer than 20")
    @Test
    void testListBooksWithConditionMoreThan20() {
        // Given
        BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);                  // [1]
        List<Book> resultListOf0Books = new ArrayList<Book>();                           // [2]
        List<Book> resultListOf15Books = generateListOfNBooks(15);                       // [3]
        List<Book> resultListOf40Books = generateListOfNBooks(40);                       // [4]
        when(libraryDatabaseMock.listBooksWithCondition(anyString()))                    // [5]
                .thenReturn(resultListOf15Books);                                             // [6]
        when(libraryDatabaseMock.listBooksWithCondition("ZeroBooks"))                    // [7]
                .thenReturn(resultListOf0Books);                                              // [8]
        when(libraryDatabaseMock.listBooksWithCondition("FortyBooks"))                   // [9]
                .thenReturn(resultListOf40Books);                                             // [10]

        // When
        List<Book> theListOfBooks0 = bookLibrary.listBooksWithCondition("ZeroBooks");    // [11]
        List<Book> theListOfBooks15 = bookLibrary.listBooksWithCondition("Any title");   // [12]
        List<Book> theListOfBooks40 = bookLibrary.listBooksWithCondition("FortyBooks");  // [13]
        // Then

        assertEquals(0, theListOfBooks0.size());                                         // [14]
        assertEquals(15, theListOfBooks15.size());                                       // [15]
        assertEquals(0, theListOfBooks40.size());
    }

    @DisplayName("Test for list of books shorter than 3")
    @Test
    void testListBooksWithConditionFragmentShorterThan3() {                          // [1]
        // Given
        LibraryDatabase libraryDatabaseMock = mock(LibraryDatabase.class);            // [2]
        BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);               // [3]

        // When
        List<Book> theListOfBooks10 = bookLibrary.listBooksWithCondition("An");       // [4]

        // Then
        assertEquals(0, theListOfBooks10.size());                                     // [5]
        verify(libraryDatabaseMock, times(0)).listBooksWithCondition(anyString());    // [6]
    }
    @DisplayName("Test for list of books rented by user")
    @Test
    void testBooksInHandOf(){
        //Given
        LibraryDatabase libraryDatabaseMock = mock(LibraryDatabase.class);
        BookLibrary booklibrary = new BookLibrary(libraryDatabaseMock);
        LibraryUser user0 = new LibraryUser("John", "Smith", "123456789");
        LibraryUser user1 = new LibraryUser("Jane", "Doe", "987654321");
        LibraryUser user5 = new LibraryUser("Jan", "Kowalski", "456789123");
        List<Book> list0 = new ArrayList<>();
        List<Book> list1 = generateListOfNBooks(1);
        List<Book> list5 = generateListOfNBooks(5);
        user0.addBooks(list0);
        user1.addBooks(list1);
        user5.addBooks(list5);

        //When
        List<Book> books0 = booklibrary.listBooksInHandOf(user0);
        List<Book> books1 = booklibrary.listBooksInHandOf(user1);
        List<Book> books5 = booklibrary.listBooksInHandOf(user5);

        //Then

        assertEquals(0, books0.size());
        assertEquals(1, books1.size());
        assertEquals(5, books5.size());
    }
}