import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LibraryTest {

    private Library library;
    private Book book;

    @Before
    public void before() {
        library = new Library(10);
        book = new Book("To Kill a Mockingbird", "Harper Lee", "Thriller");
    }

    @Test
    public void hasEmptyCollection() {
        assertEquals(0, library.getBookCount());
    }

    @Test
    public void canAddBook() {
        library.addBook(book);
        assertEquals(1, library.getBookCount());
    }

    @Test
    public void getCapacityRemaining() {
        assertEquals(10, library.getCapacityRemaining());
    }

    @Test
    public void ensureBookDoesntAddWhenAtCapacity(){
        for (int i = 0; i< 10; i++){
            library.addBook(book);
        }
        assertEquals(0, library.getCapacityRemaining());
        library.addBook(book);
        assertEquals(0, library.getCapacityRemaining());
    }
}
