package com.kodilla.patterns.prototype.library;

import java.util.HashSet;
import java.util.Set;

public final class Library extends Prototype<Library>
{

    String name;
    Set<Book> books = new HashSet<>();

    public Library(final String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Set<Book> getBooks() {
        return books;
    }

    public void setName(String name){
        this.name=name;
    }

    public Library shallowCopy() throws CloneNotSupportedException{
        return super.clone();
    }

    @Override
    public String toString() {
        String s = name + "\n";

       for(Book book:books){
           s+=book.getTitle() + " " + book.getAuthor() + " " + book.getPublicationDate() + "\n";
       }
       return s;
    }

    public Library deepCopy() throws CloneNotSupportedException{
        Library clonedLibrary = super.clone();
        clonedLibrary.books = new HashSet<>();
        for(Book book:books){
            clonedLibrary.books.add(book);
        }
        return clonedLibrary;
    }

}