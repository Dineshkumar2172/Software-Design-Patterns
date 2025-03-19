package maang_prep.behavioral;

import java.util.ArrayList;
import java.util.List;

import org.w3c.dom.events.Event;

// observer interface
interface Observer {
    void update(float temperature, float humidity);
}

// subject interface
interface Subject {
    void registerObserver(Observer o); // for registering observers
    void deregisterObserver(Observer o); // for deregistering observers
    void notifyObservers(); // for notifying oberserverss
}

// concrete subject
class WeatherStation implements Subject {
    private List<Observer> observers = new ArrayList<>();
    private float temperature;
    private float humidity;

    public void registerObserver (Observer o) {
        observers.add(o);
    }

    public void deregisterObserver (Observer o) {
        observers.remove(o);
    }

    public void setTemperature(float temperature, float humidity) {
        this.temperature = temperature;
        this.humidity = humidity;
        notifyObservers();
    }

    public void notifyObservers() {
        for (Observer observer: observers) {
            observer.update(temperature, humidity);
        }
    }
}

// concrete observer
class WeatherDisplay implements Observer {
    private String name;

    public WeatherDisplay(String name) {
        this.name = name;
    }

    public void update(float temperature, float humidity) {
        System.out.println(name + " - Updated weather: Temp = " + temperature + "C and Humidity = " + humidity + "%");
    }
}

public class ObserverPattern {
    
    // ✅ Event listeners in UI frameworks (Swing, React.js hooks).
    // ✅ Stock Market apps where multiple users observe price changes.
    // ✅ Messaging systems (publish-subscribe mechanisms like Kafka, RabbitMQ).
    // ✅ Distributed systems where services notify subscribers.

    public static void main(String[] args) {
        // create observers
        Observer weatherDisplay1 = new WeatherDisplay("india");
        Observer weatherDisplay2 = new WeatherDisplay("australlia");
        Observer weatherDisplay3 = new WeatherDisplay("US");

        // create subject
        WeatherStation weatherStation = new WeatherStation();

        // register observer to a subject
        weatherStation.registerObserver(weatherDisplay1);
        weatherStation.registerObserver(weatherDisplay2);
        weatherStation.registerObserver(weatherDisplay3);

        // updating weather - all the registered observer should get notified now
        weatherStation.setTemperature(100, 30);

        weatherStation.deregisterObserver(weatherDisplay3);

        weatherStation.setTemperature(56, 10);
    }   
}
