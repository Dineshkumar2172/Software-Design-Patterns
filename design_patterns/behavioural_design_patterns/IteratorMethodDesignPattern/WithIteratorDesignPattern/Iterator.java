package design_patterns.behavioural_design_patterns.IteratorMethodDesignPattern.WithIteratorDesignPattern;

// The Iterator<T> interface uses a generic type T.
public interface Iterator<T> {
    boolean hasNext();
    T next(); // When a class implements Iterator<T>, it must specify the actual type for T.
}
