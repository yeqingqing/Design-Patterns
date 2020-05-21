package observerd.observer.impl;

import observerd.observer.DisplayElement;
import observerd.subject.impl.WeatherData;

import java.util.Observable;
import java.util.Observer;

/**
 * 导入正确的Observer包 ，是java.util
 */
public class CurrentConditionsDisplay2 implements Observer, DisplayElement {
    Observable observable;
    private float temperature;
    private float humidity;

    public CurrentConditionsDisplay2(Observable observable){
        this.observable = observable;
        observable.addObserver(this);
    }

    @Override
    public void display() {

    }

    @Override
    public void update(Observable obs, Object arg) {
        if(obs instanceof WeatherData2){

        }
    }
}
