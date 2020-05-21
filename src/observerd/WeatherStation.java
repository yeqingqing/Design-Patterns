package observerd;

import observerd.observer.impl.CurrentConditionsDisplay;
import observerd.observer.impl.CurrentConditionsDisplay2;
import observerd.subject.impl.WeatherData;
import observerd.subject.impl.WeatherData2;

public class WeatherStation {
    public static void main(String[] args) {
        WeatherData2 weatherData2 = new WeatherData2();

        CurrentConditionsDisplay2 currentConditionsDisplay2 =
                new CurrentConditionsDisplay2(weatherData2);
        //StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);
        //ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);
       // weatherData.setMeasurements(80, 65, 30.4f);
        //weatherData.setMeasurements(82, 70, 29.2f);
        //weatherData.setMeasurements(78, 90, 29.2f);

        weatherData2.setMessurements(80, 65, 30.4f);
        weatherData2.setMessurements(82, 70, 29.2f);
        weatherData2.setMessurements(78, 90, 29.2f);
    }
}
