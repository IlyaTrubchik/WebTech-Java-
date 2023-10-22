package by.bsuir.webtech1.task14;



import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class Test {

    @org.junit.Test
    public void fourteenTaskTests(){
        Book originalBook = new Book("Some title","some author",50);
        Book cloneOfBook;
        cloneOfBook = originalBook.clone();
        assertTrue(originalBook!=cloneOfBook);
        assertTrue(originalBook.getClass() == cloneOfBook.getClass());
        assertEquals(originalBook, cloneOfBook);
    }
}
