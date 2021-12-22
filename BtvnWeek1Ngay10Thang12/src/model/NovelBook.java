package model;

public class NovelBook extends Book {
    private String author;


    public NovelBook(String name, long price, int quantity, String dateCreated, String author) {
        super(name, price, quantity, dateCreated);
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }


    @Override
    public String toString() {
        return "Model.NovelBook{" + super.toString() +
                "author='" + author + '\'' +
                '}';
    }
}
