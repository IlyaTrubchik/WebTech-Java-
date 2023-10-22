package by.bsuir.webtech1.task12;

public class Book {
    private String title;
    private String author;
    private int price;
    private static int edition;

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
    public Book(){

    }
    public Book(String title,String author,int price)
    {
        this.author = author;
        this.title = title;
        this.price = price;
    }
    @Override
    public int hashCode(){
        int total = 31;
        total = 31*total + (title == null ? 0 :title.hashCode());
        total = 31*total + (author == null ? 0: author.hashCode());
        total = 31*total + price;
        return total;
    }
    public String getTitle()
    {
        return this.title;
    }
    public String getAuthor(){
        return this.author;
    }
    public int getPrice(){
        return this.price;
    }
    @Override
    public String toString(){
        return new String("Title:" +title+";\n"+
                "Author:"+author+";\n"+
                "Price:"+price+".");
    }

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof Book){
            if(((Book)obj).hashCode() != this.hashCode()) return false;
            if(title.equals(((Book)obj).title) && author.equals(((Book)obj).author)
                && price == ((Book)obj).price) return true;
            return false;
        }
        return false;

    }
}
