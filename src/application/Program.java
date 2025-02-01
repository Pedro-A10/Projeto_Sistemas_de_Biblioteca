package application;

import entities.Author;
import entities.Book;
import entities.Library;

import java.util.List;

public class Program {

    public static void main( String[] args ) {

        //Criação de Autores:
        Author autor1 = new Author("J.K. Rowling", "Britânica");
        Author autor2 = new Author("George Orwell", "Britânica");

        //Criando Livros:
        Book book1 = new Book("Harry Potter e a Pedra filosofal", 1997);
        book1.addAuthor(autor1);

        Book book2 = new Book("1984", 1949);
        book2.addAuthor(autor2);

        //Criando biblioteca e adicionando livros:
        Library library = new Library("Biblioteca Central");
        library.addBook(book1);
        library.addBook(book2);

        //Exibindo informações da biblioteca:
        System.out.println("Biblioteca: " + library.getName());
        for (Book book : library.getBooks()) {
            System.out.println("Livro" + book.getTittle() + " (" + book.getYear() + ")");
            System.out.println("Autores: ");
            for (Author author : book.getAutores()) {
                System.out.println(" - " + author.getName()+ " (" + author.getNacionalidade() + ")");
            }
        }

        //Buscando por autor:
        String searchAuthor = "J.K. Rowling";
        List<Book> booksAuthor = library.searchBookAuthorName(searchAuthor);

        //Exibido resultados:
        System.out.println("Livros do autor " + searchAuthor + ": ");
        for (Book book : booksAuthor) {
            System.out.println("- " + book.getTittle() + " (" + book.getYear() + ")");
        }
    }
}
