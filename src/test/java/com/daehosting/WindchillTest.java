package com.daehosting;

import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.*;

/**
 * Created by David on 3/7/17.
 */
public class WindchillTest {
    @Test
    public void getWindChillCelsius() throws Exception {
        TemperatureConversionsSoapType windchillCelsius = new TemperatureConversions().getTemperatureConversionsSoap12();

        BigDecimal results = windchillCelsius.windChillInCelsius(BigDecimal.valueOf(35.0), BigDecimal.valueOf(15));

        assertEquals("Celsius conversion failed", BigDecimal.valueOf(30.7825), results);
    }

    @Test
    public void getWindChillFahrenheit() throws Exception {
        TemperatureConversionsSoapType windchillFahrenheit = new TemperatureConversions().getTemperatureConversionsSoap12();

        BigDecimal results = windchillFahrenheit.windChillInFahrenheit(BigDecimal.valueOf(50.0), BigDecimal.valueOf(15.0));

        assertEquals("Fahrenheit conversion failed", BigDecimal.valueOf(30.821), results);

    }
}
