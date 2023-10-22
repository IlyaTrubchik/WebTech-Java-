package by.bsuir.webtech1.task15;

public class Book implements Comparable<Book>{
    private String title;
    private String author;
    private int price;
    private static int edition;
    private int isbn;

    public Book(int isbn) {
        this.isbn = isbn;
    }

    public int getIsbn()
    {
        return  this.isbn;
    }
    public int hashCode() {
        int total = 31;
        total = 31 * total + (title == null ? 0 : title.hashCode());
        total = 31 * total + (author == null ? 0 : author.hashCode());
        total = 31 * total + price;
        return total;
    }
    public void setTitle(String title)
    {
        this.title = title;
    }
    public void setAuthor(String author)
    {
        this.author = author;
    }
    public void setPrice(int price)
    {
        this.price = price;
    }

    @Override
    public String toString() {
        return new String("Title:" + title + ";\n" +
                "Author:" + author + ";\n" +
                "Price:" + price + ".");
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Book) {
            if (obj.hashCode() != hashCode()) return false;
            if (title.equals(((Book) obj).title) && author.equals(((Book) obj).author)
                    && price == ((Book) obj).price) return true;
            return false;
        }
        return false;

    }

    @Override
    public int compareTo(Book o) {
        if (this.isbn < o.isbn) {
            return -1;
        } else if (this.isbn > o.isbn) {
            return 1;
        } else {
            return 0;
        }
    }
}
