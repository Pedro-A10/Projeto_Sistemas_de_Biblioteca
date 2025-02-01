package entities;

import java.util.ArrayList;
import java.util.List;

public class Book {
    private String tittle;
    private int year;

    private List<Author> autores = new ArrayList<>();

    public Book( String tittle, int year) {
        this.tittle = tittle;
        this.year = year;
    }

    public void addAuthor (Author author) {
        autores.add(author);
    }

    public String getTittle() {
        return tittle;
    }

    public int getYear() {
        return year;
    }

    public List<Author> getAutores() {
        return autores;
    }

    public boolean containsAuthor(String authorName) {
        for (Author author : autores) {
            if (author.getName().equalsIgnoreCase(authorName)) {
                return true;
            }
        }
        return false;
    }
}
