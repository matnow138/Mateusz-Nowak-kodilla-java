package com.kodilla.testing.weather.mock;                                     // [1]

import com.kodilla.testing.weather.stub.Temperatures;                         // [2]
import com.kodilla.testing.weather.stub.WeatherForecast;                      // [3]
import org.junit.jupiter.api.Assertions;                                      // [4]
import org.junit.jupiter.api.Test;                                            // [5]

import static org.mockito.Mockito.mock;                                       // [6]
import static org.mockito.Mockito.when;
import java.util.HashMap;                                                        // [6]
import java.util.Map;
class WeatherForecastTestSuite {                                              // [7]

    @Test                                                                      // [8]
    void testCalculateForecastWithMock() {                                     // [9]
        //Given
        Temperatures temperaturesMock = mock(Temperatures.class);               // [10]

        Map<String, Double> temperaturesMap = new HashMap<>();

        temperaturesMap.put("Rzeszow", 25.5);
        temperaturesMap.put("Krakow", 26.2);
        temperaturesMap.put("Wroclaw", 24.8);
        temperaturesMap.put("Warszawa", 25.2);
        temperaturesMap.put("Gdansk", 26.1);
        when(temperaturesMock.getTemperatures()).thenReturn(temperaturesMap);
        WeatherForecast weatherForecast = new WeatherForecast(temperaturesMock);//
    //When
        int quantityOfSensors = weatherForecast.calculateForecast().size();     // [12]

        //Then
        Assertions.assertEquals(5, quantityOfSensors);                          // [13]
    }                                                                          // [14]
}