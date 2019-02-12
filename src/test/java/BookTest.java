import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BookTest {

    private Book book;

    @Before
    public void before(){
        book = new Book("To Kill a Mockingbird", "Harper Lee");
    }

    @Test
    public void bookHasName(){
        assertEquals("To Kill a Mockingbird", book.getName());
    }

    @Test
    public void bookHasGenre(){
        assertEquals("Harper Lee", book.getAuthor());
    }
}
