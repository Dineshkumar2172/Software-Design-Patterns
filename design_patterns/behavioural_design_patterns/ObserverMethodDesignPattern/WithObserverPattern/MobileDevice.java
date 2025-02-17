package design_patterns.behavioural_design_patterns.ObserverMethodDesignPattern.WithObserverPattern;

public class MobileDevice implements Observer{

    private String name;

    public MobileDevice(String name) {
        this.name = name;
    }

    public void update(float temperature){
        System.out.println("Current temperature on mobile device: " + temperature + " C");
    }
}
