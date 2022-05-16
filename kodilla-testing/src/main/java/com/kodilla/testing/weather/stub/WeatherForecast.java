package com.kodilla.testing.weather.stub;

import java.util.*;

public class WeatherForecast {
    private Temperatures temperatures;

    public WeatherForecast(Temperatures temperatures) {
        this.temperatures = temperatures;
    }

    public Map<String, Double> calculateForecast() {
        Map<String, Double> resultMap = new HashMap<>();

        for (Map.Entry<String, Double> temperature :
                temperatures.getTemperatures().entrySet()) {

            // adding 1 celsius degree to current value
            // as a temporary weather forecast
            resultMap.put(temperature.getKey(), temperature.getValue() + 1.0); // [1]
        }
        return resultMap;
    }
    public double averageTemp(Temperatures temperatures){
     double average = 0.0;
     for(Map.Entry<String, Double> temperature: temperatures.getTemperatures().entrySet()){
         average += temperature.getValue();
     }
     return average/temperatures.getTemperatures().size();
    }
    public double medianTemp(Temperatures temperatures){
        double median = 0.0;
        List<Double> tempByKey = new ArrayList<>(temperatures.getTemperatures().values());
        Collections.sort(tempByKey);
        if(tempByKey.size()%2==0){
            median=(tempByKey.get((tempByKey.size()/2-1)) + tempByKey.get((tempByKey.size()/2)))/2; // Median if list is divided by 2
        } else{
            median = tempByKey.get(tempByKey.size()/2); // median if list is not divided by 2
        }
        return median;
    }
}