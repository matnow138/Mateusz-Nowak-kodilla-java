package com.kodilla.exception.io;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FileReaderTestSuite {

    @Test
    void testReadFile(){
        //Given
        FileReader fileReader = new FileReader();
        //when & then
        assertAll(
                ()-> assertThrows(FileReaderException.class, () -> fileReader.readFile("nie ma takiego pliku")),
                () -> assertThrows(FileReaderException.class, () -> fileReader.readFile("null")),
                () -> assertDoesNotThrow(() -> fileReader.readFile("names.txt"))
                );
    }

}