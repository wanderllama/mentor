package constructor;

public class Book {

    private String name, author, genre;
    private int numberOfPages, year;

    public Book(String name) {
        this.name = name;
    }

    public Book(String name, String author) {
        this(name);
        this.author = author;
    }

    public Book(String name, String author, String genre) {
        this(name, author);
        this.genre = genre;
    }

    public Book(String name, String author, String genre, int numberOfPages) {
        this(name, author, genre);
        this.numberOfPages = numberOfPages;
    }

    public Book(String name, String author, String genre, int numberOfPages, int year) {
        this(name, author, genre, numberOfPages);
        this.year = year;
    }

    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    public String getGenre() {
        return genre;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public int getYear() {
        return year;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", genre='" + genre + '\'' +
                ", numberOfPages=" + numberOfPages +
                ", year=" + year +
                '}';
    }
}
