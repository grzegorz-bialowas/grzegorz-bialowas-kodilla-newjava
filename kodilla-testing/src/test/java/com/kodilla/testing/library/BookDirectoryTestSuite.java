package com.kodilla.testing.library;
import org.junit.Test;
import java.util.ArrayList;
import java.util.List;
import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;
public class BookDirectoryTestSuite {
    private List<Book> generateListOfNBooks(int booksQuantity) {
        List<Book> resultList = new ArrayList<Book>();
        for(int n = 1; n <= booksQuantity; n++){
            Book theBook = new Book("Title " + n, "Author " + n, 1970 + n);
            resultList.add(theBook);
        }
        return resultList;
    }
    @Test
    public void testListBooksWithConditionsReturnList() {
        // Given
        LibraryDatabase libraryDatabaseMock = mock(LibraryDatabase.class);
        BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);
        List<Book> resultListOfBooks = new ArrayList<Book>();
        Book book1 = new Book("Secrets of Alamo", "John Smith", 2008);
        Book book2 = new Book("Secretaries and Directors", "Dilbert Michigan", 2012);
        Book book3 = new Book("Secret life of programmers", "Steve Wolkowitz", 2016);
        Book book4 = new Book("Secrets of Java", "Ian Tenewitch", 2010);
        resultListOfBooks.add(book1);
        resultListOfBooks.add(book2);
        resultListOfBooks.add(book3);
        resultListOfBooks.add(book4);
        when(libraryDatabaseMock.listBooksWithCondition("Alamo")).thenReturn(resultListOfBooks);
        // When
        List<Book> theListOfBooks = bookLibrary.listBooksWithCondition("Alamo");
        // Then
        assertEquals(4, theListOfBooks.size());
    }
    @Test
    public void testListBooksWithConditionMoreThan20() {
        // Given
        LibraryDatabase libraryDatabaseMock = mock(LibraryDatabase.class);
        BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);
        List<Book> resultListOf0Books = new ArrayList<Book>();
        List<Book> resultListOf15Books = generateListOfNBooks(15);
        List<Book> resultListOf40Books = generateListOfNBooks(40);
        when(libraryDatabaseMock.listBooksWithCondition(anyString()))
                .thenReturn(resultListOf15Books);
        when(libraryDatabaseMock.listBooksWithCondition("ZeroBooks"))
                .thenReturn(resultListOf0Books);
        when(libraryDatabaseMock.listBooksWithCondition("FourtyBooks"))
                .thenReturn(resultListOf40Books);
        // When
        List<Book> theListOfBooks0 = bookLibrary.listBooksWithCondition("ZeroBooks");
        List<Book> theListOfBooks15 = bookLibrary.listBooksWithCondition("Any title");
        List<Book> theListOfBooks40 = bookLibrary.listBooksWithCondition("FourtyBooks");
        // Then
        assertEquals(0, theListOfBooks0.size());
        assertEquals(15, theListOfBooks15.size());
        assertEquals(0, theListOfBooks40.size());
    }
    @Test
    public void testListBooksWithConditionFragmentShorterThan3() {
        // Given
        LibraryDatabase libraryDatabaseMock = mock(LibraryDatabase.class);
        BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);
        List<Book> resultListOf10Books = generateListOfNBooks(10);
        when(libraryDatabaseMock.listBooksWithCondition(anyString()))
                .thenReturn(resultListOf10Books);
        // When
        List<Book> theListOfBooks10 = bookLibrary.listBooksWithCondition("An");
        // Then
        assertEquals(0, theListOfBooks10.size());
        verify(libraryDatabaseMock, times(0)).listBooksWithCondition(anyString());
    }
    @Test
    public void testListBooksInHandsOfFiveBooks() {
        //Given
        LibraryDatabase libraryDatabaseMock = mock(LibraryDatabase.class);
        BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);
        ArrayList<Book> bookList = new ArrayList<>();
        Book book = new Book("Star Wars", "John Smith", 2010);
        Book book1 = new Book("Star Wars1", "John Smith1", 2011);
        Book book2 = new Book("Star Wars2", "John Smith2", 2012);
        Book book3 = new Book("Star Wars3", "John Smith3", 2013);
        Book book4 = new Book("Star Wars4", "John Smith4", 2014);
        bookList.add(book);
        bookList.add(book1);
        bookList.add(book2);
        bookList.add(book3);
        bookList.add(book4);
        LibraryUser user = new LibraryUser("Greg", "Poland", "123456789");
        when(libraryDatabaseMock.listBooksInHandsOf(user)).thenReturn(bookList);
        //When
        List<Book> checkBookList = bookLibrary.listBooksInHandsOf(user);
        //Then
        assertEquals(5,checkBookList.size());
        verify(libraryDatabaseMock).listBooksInHandsOf(user);
    }
    @Test
    public void testListBooksInHandsOfOneBook() {
        //Given
        LibraryDatabase libraryDatabaseMock = mock(LibraryDatabase.class);
        BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);
        List<Book> bookList = new ArrayList<Book>();
        Book book = new Book("Jungle", "John Smith", 2015);
        bookList.add(book);
        LibraryUser user = new LibraryUser("Greg", "Poland", "123456789");
        when(libraryDatabaseMock.listBooksInHandsOf(user)).thenReturn((ArrayList<Book>) bookList);
        //When
        List<Book> checkBookList = bookLibrary.listBooksInHandsOf(user);
        //Then
        assertEquals(1,checkBookList.size());
        verify(libraryDatabaseMock).listBooksInHandsOf(user);
    }
    @Test
    public void testListBooksInHandsOfZeroBooks() {
        //Given
        LibraryDatabase libraryDatabaseMock = mock(LibraryDatabase.class);
        BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);
        List<Book> bookList = new ArrayList<Book>();
        LibraryUser user = new LibraryUser("Greg", "Poland", "123456789");
        when(libraryDatabaseMock.listBooksInHandsOf(user)).thenReturn((ArrayList<Book>) bookList);
        //When
        List<Book> checkBookList = bookLibrary.listBooksInHandsOf(user);
        //Then
        assertEquals(0,checkBookList.size());
        verify(libraryDatabaseMock).listBooksInHandsOf(user);
    }
}