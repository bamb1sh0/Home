package oopClasses;

enum Genres{Fantasy, SciFi, Mystery, Thriller, Romance};

public class Book{
    private String name;
    private String author;
    private int countPages;
    private Genres genre;

    Book(String name, String author, int countPages, Genres genre){

        this(name, author, countPages);
        this.genre = genre;
    }
    Book(String name, String author, int countPages){

        this(name,author);
        this.countPages = countPages;
    }
    Book(String name, String author){

        this.name = name;
        this.author = author;
    }
    public String getName() {
        return name;
    }
    public String getAuthor() {
        return author;
    }
    public int getCountPages() {
        return countPages;
    }
    public Genres getGenre() {
        return genre;
    }
    public String toString(){
        return String.format("Book: %s, author: %s, pages: %d, genre: %s",name,author,countPages,genre);
    }
}
