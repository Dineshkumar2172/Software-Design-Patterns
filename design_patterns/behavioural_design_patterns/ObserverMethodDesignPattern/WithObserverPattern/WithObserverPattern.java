package design_patterns.behavioural_design_patterns.ObserverMethodDesignPattern.WithObserverPattern;

public class WithObserverPattern {
    public static void main(String[] args) {
        WeatherStation station = new WeatherStation();
        
        Observer mobileDevice = new MobileDevice("Ram's mobile device");
        Observer displayDevice = new DisplayDevice("Ram's display device");

        station.attach(mobileDevice);
        station.attach(displayDevice);

        // station.setTemperature(45);

        station.detach(mobileDevice);

        station.setTemperature(45);
    }
}
