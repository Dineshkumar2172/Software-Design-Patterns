package design_patterns.behavioural_design_patterns.ObserverMethodDesignPattern.WithoutObserverPattern;

public class WeatherStation {

    private float temperature;
    private DisplayDevice displayDevice; // can be multiple such devices

    public WeatherStation(DisplayDevice displayDevice){
        this.displayDevice = displayDevice;
    }

    public void setTemperature(float temp){
        this.temperature = temp;
        notifyDevice();
    }

    public void notifyDevice(){
        displayDevice.showTemperature(temperature);
    }

}
