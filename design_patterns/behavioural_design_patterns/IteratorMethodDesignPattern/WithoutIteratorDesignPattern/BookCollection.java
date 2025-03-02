package design_patterns.behavioural_design_patterns.IteratorMethodDesignPattern.WithoutIteratorDesignPattern;

import java.util.ArrayList;
import java.util.List;

public class BookCollection {
    private List<Book> books = new ArrayList<>();

    public void addBook(Book book) {
        books.add(book);
    }

    public List<Book> getBooks(){
        return books;
    }
}
