package by.bsuir.webtech1.task13;

import by.bsuir.webtech1.task12.Book;
import by.bsuir.webtech1.task9.Ball;
import by.bsuir.webtech1.task9.Basket;
import by.bsuir.webtech1.task9.Color;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class Test {

    @org.junit.Test
    public void thirteenTaskTests(){
        ProgrammerBook firstBook = new ProgrammerBook("Some title","Some author",30,"Java",5);
        ProgrammerBook secondBook =  new ProgrammerBook("Some title","Some author",30,"Java",5);
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
        String testString = "Title:Some title;\nAuthor:Some author;\nPrice:30;\nLanguage:Java;\nLevel:5.";
        assertEquals(testString,firstBook.toString());
    }
}
