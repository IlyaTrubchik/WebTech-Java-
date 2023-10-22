package by.bsuir.webtech1.task15;

import by.bsuir.webtech1.task9.Ball;
import by.bsuir.webtech1.task9.Basket;
import by.bsuir.webtech1.task9.Color;

import java.util.Arrays;
import java.util.Random;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class Test {

    @org.junit.Test
    public void fifteenTaskTests(){
        Random isbn = new Random();
        Book[] booksArray = new Book[100];

        for (int i = 0; i < booksArray.length; i++) {
            booksArray[i] = new Book(isbn.nextInt());
        }
        Arrays.sort(booksArray);
        for (int i = 0; i < booksArray.length-1; i++) {
            assertTrue(booksArray[i].getIsbn() <= booksArray[i + 1].getIsbn());
        }
    }
}
