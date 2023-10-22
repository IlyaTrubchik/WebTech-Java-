package by.bsuir.webtech1.task12;

import by.bsuir.webtech1.task9.Ball;
import by.bsuir.webtech1.task9.Basket;
import by.bsuir.webtech1.task9.Color;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class Test {

    @org.junit.Test
    public void twelveTaskTests(){
        Book firstBook = new Book("Robinson Crusoe","Daniel Defoe",30);
        Book secondBook =  new Book("Robinson Crusoe","Daniel Defoe",30);
        Integer otherTypeEqualityObject = 10;
        assertEquals(firstBook, firstBook);
        assertEquals(firstBook, secondBook);
        assertEquals(secondBook,firstBook);
        assertNotEquals(null, firstBook);
        assertEquals(firstBook.hashCode(),secondBook.hashCode());
        assertEquals(firstBook.hashCode(),firstBook.hashCode());
        secondBook.setAuthor("Some Another Author");
        assertNotEquals(firstBook,secondBook);
        assertNotEquals(secondBook, firstBook);
        assertNotEquals(firstBook, otherTypeEqualityObject);
        assertNotEquals(firstBook.hashCode(),secondBook.hashCode());
        String testString = "Title:Robinson Crusoe;\nAuthor:Daniel Defoe;\nPrice:30.";
        assertEquals(testString,firstBook.toString());
    }
}
