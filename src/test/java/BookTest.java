import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BookTest {

    private Book book;

    @Before
    public void before(){
        book = new Book("To Kill a Mockingbird", "Harper Lee", "Thriller");
    }

    @Test
    public void bookHasName(){
        assertEquals("To Kill a Mockingbird", book.getName());
    }

    @Test
    public void bookHasAuthor(){
        assertEquals("Harper Lee", book.getAuthor());
    }

    @Test
    public void bookHasGenre(){
        assertEquals("Thriller", book.getGenre());
    }
}
