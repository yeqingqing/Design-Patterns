package observerd.subject.impl;

import observerd.observer.Observer;
import observerd.subject.Subject;

import java.util.ArrayList;

/**
 * WeatherData现在实现了
 * Subject接口。
 */
public class WeatherData implements Subject {
    /**
     * 我们加上一个ArrayList来纪录观察
     * 者，此ArrayList是在构造器中建立
     * 的。
     */
    private ArrayList<Observer> observers;
    private float temperature;
    private float humidity;
    private float pressure;
    //构造方法
    public WeatherData() {
        observers = new ArrayList();
    }

    /**
     * 当注册观察者时，我们只要把它加
     * 到ArrayList的后面即可。
     * @param o
     */
    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
    }

    /**
     * 同样地，当观察者想取消注册，我们把
     * 它从ArrayList中删除即可。
     * @param o
     */
    @Override
    public void removeObserver(Observer o) {
        int i = observers.indexOf(o);
        if (i >= 0) {
            observers.remove(i);
        }
    }

    /**
     * 在这里，我们
     * 把状态告诉每一个观察者。因为
     * 观察者都实现了update()，所以我
     * 们知道如何通知它们
     */
    @Override
    public void notifyObservers() {
        for (Observer o:observers
             ) {
            o.update(temperature, humidity, pressure);
        }
    }

    /**
     * 当从气象站得到更新观测值 时，我们通知观察者。
     */
    public void measurementsChanged() {
        notifyObservers();
    }

    /**
     * 我们想要每本书随书赠送一个小型气象站，
     * 但是出版社不肯。所以，和从装置中读取
     * 实际的气象数据相比，我们宁愿利用这个
     * 方法来测试布告板。或者，为了好玩，你
     * 也可以写代码从网站上抓取观测值。
     * @param temperature
     * @param humidity
     * @param pressure
     */
    public void setMeasurements(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }
    // WeatherData的其他方法
}
