package by.bsuir.webtech1.task14;

public class Book implements Cloneable{
    private String title;
    private String author;
    private int price;
    private static int edition;

    public Book(String title, String author, int price) {
        this.title = title;
        this.author = author;
        this.price = price;
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
    public Book clone(){
        Book clonedBook = new Book(this.title,this.author,this.price);
        return  clonedBook;
    }
}