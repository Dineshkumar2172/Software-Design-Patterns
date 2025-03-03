package design_patterns.behavioural_design_patterns.IteratorMethodDesignPattern.WithIteratorDesignPattern;

import design_patterns.behavioural_design_patterns.IteratorMethodDesignPattern.WithoutIteratorDesignPattern.Book;

public class Client {
    public static void main(String[] args) {
        BookCollection bookCollection = new BookCollection();
        bookCollection.addBook(new Book("C++ Book"));
        bookCollection.addBook(new Book("Java Book"));
        bookCollection.addBook(new Book("Python Book"));

        Iterator<Book> iterator = bookCollection.createIterator();
        while (iterator.hasNext()) {
            Book book = iterator.next();
            System.out.println("Book title : " + book.getTitle());
        }
    }
}
 