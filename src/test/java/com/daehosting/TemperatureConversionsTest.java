package com.daehosting;

import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.*;

/**
 * Created by David on 2/21/17.
 */
public class TemperatureConversionsTest {
    @Test
    public void getTemperatureConversionsSoap12() throws Exception {
        TemperatureConversionsSoapType service = new TemperatureConversions().getTemperatureConversionsSoap12();

        BigDecimal celciusToFahrenheitResults = service.celsiusToFahrenheit(BigDecimal.valueOf(0.0));

        assertEquals("The celcius to fahrenhiet failed", BigDecimal.valueOf(32), celciusToFahrenheitResults);
    }

}