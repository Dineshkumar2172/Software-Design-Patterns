package design_patterns.behavioural_design_patterns.ObserverMethodDesignPattern.WithObserverPattern;

public interface Subject {
    void attach(Observer observer);
    void detach(Observer observer);
    void notifyObservers();
}
