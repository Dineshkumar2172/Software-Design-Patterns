package design_patterns.behavioural_design_patterns.ObserverMethodDesignPattern.WithObserverPattern;

import java.util.ArrayList;
import java.util.List;

public class WeatherStation implements Subject{

    private float temperature;

    private List<Observer> observers = new ArrayList<>();

    public void setTemperature(float temp) {
        this.temperature = temp;
        notifyObservers();
    }

    @Override
    public void attach(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void detach(Observer observer) {
       observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(temperature); // Runtime Polymorphism
        }
    }
    
}
