package entities;

import java.util.ArrayList;
import java.util.List;

public class Library {

    private String name;
    private List<Book> books = new ArrayList<>();


    public Library() {
    }

    public Library( String name) {
        this.name = name;
    }

    public void addBook ( Book book ) {
        books.add(book);
    }

    public void removeBook (Book book) {
        books.remove(book);
    }

    public String getName() {
        return name;
    }

    public List<Book> getBooks() {
        return books;
    }

    public List<Book> searchBookAuthorName(String authorName) {
        List<Book> resultados = new ArrayList<>();
        for (Book book : books) {
            if (book.containsAuthor(authorName)) {
                resultados.add(book);
            }
        }
        return resultados;
    }
}
