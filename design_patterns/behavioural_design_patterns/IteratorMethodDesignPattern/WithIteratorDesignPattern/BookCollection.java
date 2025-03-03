package design_patterns.behavioural_design_patterns.IteratorMethodDesignPattern.WithIteratorDesignPattern;

import java.util.ArrayList;
import java.util.List;

import design_patterns.behavioural_design_patterns.IteratorMethodDesignPattern.WithoutIteratorDesignPattern.Book;

public class BookCollection {
    private List<Book> books =  new ArrayList<>();
    
    public void addBook(Book book) {
        books.add(book);
    }

    public List<Book> getBooks() {
        return books;
    }

    public Iterator<Book> createIterator() {
        return new BookIterator(this.books);
    }

    private class BookIterator implements Iterator{
        private List<Book> books;

        private int position = 0;

        public BookIterator(List<Book> books) {
            this.books = books;
        }

        public boolean hasNext() {
            return position < books.size();
        }

        public Book next() {
            // returns the element at position and then increments the position
            return books.get(position++);
        }
    }
}
