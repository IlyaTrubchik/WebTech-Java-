package by.bsuir.webtech1.task16;

import by.bsuir.webtech1.task16.comparators.AuthorComparator;
import  by.bsuir.webtech1.task16.comparators.PriceComparator;
import  by.bsuir.webtech1.task16.comparators.TitleComparator;

import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        TitleComparator titleComparator = new TitleComparator();
        Comparator<Book> titleThenAuthorComparator = new TitleComparator().thenComparing(new AuthorComparator());
        Comparator<Book> authorThenTitleComparator = new AuthorComparator().thenComparing(new TitleComparator());
        Comparator<Book> authorThenTitleThenPriceComparator = new AuthorComparator()
                .thenComparing(new TitleComparator().thenComparing(new PriceComparator()));
    }
}
