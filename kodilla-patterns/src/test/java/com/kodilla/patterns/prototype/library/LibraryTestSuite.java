package com.kodilla.patterns.prototype.library;

import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;
public class LibraryTestSuite {
    @Test
    public void testGetBooks() {
        //Given
        Set<Book> books = new HashSet<>();
        Book book = new Book("Wawa", "Luke Snow", LocalDate.of(2011, 12, 22));
        books.add(book);
        books.add(new Book("Star Wars", "John New",LocalDate.of(2015, 02, 02)));
        books.add(new Book("Pinokio", "Max Lowe", LocalDate.of(2010, 05,07)));
        books.add(new Book("laser", "Lina Olsa", LocalDate.of(2002, 03, 10)));
        books.add(new Book("Jack Sparrow", "Heidi Klassa", LocalDate.of(2017, 11, 21)));
        books.add(new Book("MethodMan", "Alcice Kays", LocalDate.of(2013, 12, 21)));
        Library library = new Library("Library");
        library.books = books;
        Library cloneLibrary = null;
        try {
            cloneLibrary = library.shallowCopy();
            cloneLibrary.setName("New project Library");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }
        System.out.println(library);
        System.out.println(cloneLibrary);
        Library deepClonedLibrary = null;
        try {
            deepClonedLibrary = library.deepCopy();
            deepClonedLibrary.setName("New project library 2");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }
        //When
        library.getBooks().remove(book);
        //Then
        System.out.println(library);
        System.out.println(cloneLibrary);
        System.out.println(deepClonedLibrary);
        Assert.assertEquals(5, library.getBooks().size());
        Assert.assertEquals(5, cloneLibrary.getBooks().size());
        Assert.assertEquals(6, deepClonedLibrary.getBooks().size());
    }
}
