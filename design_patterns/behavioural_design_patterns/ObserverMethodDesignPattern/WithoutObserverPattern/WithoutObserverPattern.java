package design_patterns.behavioural_design_patterns.ObserverMethodDesignPattern.WithoutObserverPattern;

public class WithoutObserverPattern {
    public static void main(String[] args) {
        DisplayDevice device = new DisplayDevice();
        WeatherStation station = new WeatherStation(device);
        // tight coupling between station and devices

        station.setTemperature(26);
        station.setTemperature(30);
    }
}
