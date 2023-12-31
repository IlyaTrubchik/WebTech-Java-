package by.bsuir.webtech1.task16.comparators;

import by.bsuir.webtech1.task16.Book;
import java.util.Comparator;

public class AuthorComparator implements Comparator<Book> {
    @Override
    public int compare(Book o1, Book o2) {
        return o1.getAuthor().compareTo(o2.getAuthor());
    }
}
