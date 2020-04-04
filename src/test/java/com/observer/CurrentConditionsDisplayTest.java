package com.observer;

import com.google.gson.Gson;
import com.observer.Entity.Weather;
import com.observer.observer.impl.CurrentConditionsDisplay;
import com.observer.subject.Subject;
import com.observer.subject.impl.WindSpeedSubject;
import com.observer.subject.impl.WeatherSubject;
import org.junit.Test;

public class CurrentConditionsDisplayTest {

    @Test
    public void test(){
        Weather weather = new Weather(20,10,30);



        WeatherSubject weatherSubject = new WeatherSubject();
        WindSpeedSubject windSpeedSubject = new WindSpeedSubject();
        CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay(new Subject[]{weatherSubject, windSpeedSubject});

        weatherSubject.setMeasurements(new Gson().toJson(weather));

        windSpeedSubject.setMeasurements(new Gson().toJson(weather));

    }

}