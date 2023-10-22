package by.bsuir.webtech1.task16;

import by.bsuir.webtech1.task16.comparators.AuthorComparator;
import by.bsuir.webtech1.task16.comparators.PriceComparator;
import by.bsuir.webtech1.task16.comparators.TitleComparator;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

import static org.junit.Assert.assertEquals;

public class Test {

    @org.junit.Test
    public void sixteenTaskTests(){
        Comparator<Book> titleThenAuthorComparator = new TitleComparator().thenComparing(new AuthorComparator());
        Comparator<Book> authorThenTitleComparator = new AuthorComparator().thenComparing(new TitleComparator());
        Comparator<Book> authorThenTitleThenPriceComparator = new AuthorComparator()
                .thenComparing(new TitleComparator().thenComparing(new PriceComparator()));
        ArrayList<Book> testList =  new ArrayList<>();
        ArrayList<Book> expectedResult = new ArrayList<>();
        testList.add(new Book("B","A",30));
        testList.add(new Book("D","C",30));
        testList.add(new Book("O","P",30));
        testList.add(new Book("A","A",30));

        expectedResult.add(0,new Book("A","A",30));
        expectedResult.add(1,new Book("B","A",30));
        expectedResult.add(2,new Book("D","C",30));
        expectedResult.add(3,new Book("O","P",30));
        testList.sort(titleThenAuthorComparator);
        for(int i = 0;i<testList.size();i++)
        {
            assertEquals(expectedResult.get(i),testList.get(i));
        }
        expectedResult.clear();
        testList.clear();
        testList.add(new Book("A","B",30));
        testList.add(new Book("D","C",30));
        testList.add(new Book("B","A",30));
        testList.add(new Book("A","C",30));

        expectedResult.add(0,new Book("A","B",30));
        expectedResult.add(1,new Book("A","C",30));
        expectedResult.add(2,new Book("B","A",30));
        expectedResult.add(3,new Book("D","C",30));
        testList.sort(authorThenTitleComparator);
        for(int i = 0;i<testList.size();i++)
        {
            assertEquals(expectedResult.get(i),testList.get(i));
        }
        expectedResult.clear();
        testList.clear();
        testList.add(new Book("A","B",15));
        testList.add(new Book("D","C",30));
        testList.add(new Book("F","A",10));
        testList.add(new Book("A","B",30));

        expectedResult.add(0,new Book("A","B",15));
        expectedResult.add(1,new Book("A","B",30));
        expectedResult.add(2,new Book("D","C",30));
        expectedResult.add(3,new Book("F","A",10));
        testList.sort(authorThenTitleThenPriceComparator);
        for(int i = 0;i<testList.size();i++)
        {
            assertEquals(expectedResult.get(i),testList.get(i));
        }
    }
}
