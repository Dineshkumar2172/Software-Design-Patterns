package design_patterns.behavioural_design_patterns.ObserverMethodDesignPattern.WithObserverPattern;

public class DisplayDevice implements Observer{
    
    private String name;

    public DisplayDevice(String name) {
        this.name = name;
    } 

    public void update(float temperature){
        System.out.println("Current temp on display device: " + temperature + " C");
    }
}
