package observerd.subject.impl;

import java.util.Observable;

public class WeatherData2 extends Observable {
    private float temperature;
    private float humidity;
    private float pressure;

    public WeatherData2(){
    }

    public void messureChanged(){
        setChanged();
        notifyObservers();
    }


    public void setMessurements(float temprature, float humiditym, float pressure){
        this.temperature = temprature;
        this.humidity = humiditym;
        this.pressure = pressure;
        messureChanged();
    }

    public float getTemperature() {
        return temperature;
    }

    public float getHumidity() {
        return humidity;
    }

    public float getPressure() {
        return pressure;
    }


}
