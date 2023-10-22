package by.bsuir.webtech1.task13;


import by.bsuir.webtech1.task12.Book;

public class ProgrammerBook extends Book {
    private String language;
    private int level;
    public ProgrammerBook(){

    }
    public ProgrammerBook(String author,String title,int price,String language,int level)
    {
        super(author,title,price);
        this.language = language;
        this.level = level;
    }
    public int hashCode(){
       int total = super.hashCode();
       total =  total*31 + level;
       total =  total*31 + (language == null ? 0: language.hashCode());
       return total;
    }
    @Override
    public String toString(){
        return new String("Title:" +super.getTitle()+";\n"+
                "Author:"+super.getAuthor()+";\n"+
                "Price:"+super.getPrice()+";\n"+
                "Language:" +this.language+";\n"+
                "Level:"+this.level+".");
    }

    @Override
    public boolean equals(Object obj) {
        if(!super.equals(obj)) return false;
        ProgrammerBook book = (ProgrammerBook) obj;
        return level == book.level && language.equals(book.language);
    }
}
